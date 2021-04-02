package com.sycamore.sycaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.sycamore.sycaplayer.media.IjkVideoView;
import com.sycamore.sycaplayer.media.view.AndroidMediaController;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class PlayerActivity extends AppCompatActivity {

    private IjkVideoView videoView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //虚拟键盘也透明
            //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        url = getIntent().getStringExtra("url");
        if (url == null || url.isEmpty()) {
            url = "rtmp://58.200.131.2:1935/livetv/cctv1";
        }

        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.video_view);
        AndroidMediaController mMediaController = new AndroidMediaController(this, false);
        videoView.setMediaController(mMediaController);
        videoView.setVideoPath(url);
        videoView.start();

        mMediaController.setControllerListener(() -> {
            // 横屏 SCREEN_ORIENTATION_LANDSCAPE
            // 竖屏 SCREEN_ORIENTATION_PORTRAIT'
            int currentOrientation = getRequestedOrientation();
            if (currentOrientation == ActivityInfo.SCREEN_ORIENTATION_NOSENSOR) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                return;
            }
            setRequestedOrientation(currentOrientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE ? ActivityInfo.SCREEN_ORIENTATION_PORTRAIT : ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        });


    }


    private boolean mBackPressed;

    @Override
    public void onBackPressed() {
        mBackPressed = true;

        super.onBackPressed();
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (mBackPressed || !videoView.isBackgroundPlayEnabled()) {
            videoView.stopPlayback();
            videoView.release(true);
            videoView.stopBackgroundPlay();
        } else {
            videoView.enterBackground();
        }
        IjkMediaPlayer.native_profileEnd();
    }

}