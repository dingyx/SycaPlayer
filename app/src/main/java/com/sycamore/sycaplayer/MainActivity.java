package com.sycamore.sycaplayer;

import androidx.annotation.RequiresApi;
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

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 21) {//21表示5.0
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= 19) {//19表示4.4
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //虚拟键盘也透明
            //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        setContentView(R.layout.activity_main);

        IjkVideoView videoView = findViewById(R.id.video_view);
        videoView.setVideoPath("https://vd2.bdstatic.com/mda-md0aegx0t1iueq4q/fhd/cae_h264_nowatermark/1617312402/mda-md0aegx0t1iueq4q.mp4?v_from_s=tc_haokan_4469&auth_key=1617332103-0-0-00e61267d2e1d1270b69767825e3ebe0&bcevod_channel=searchbox_feed&pd=1&pt=3&abtest=3000165_2");
        AndroidMediaController mMediaController = new AndroidMediaController(this, false);
        videoView.setMediaController(mMediaController);

        //      videoView.setVideoPath("rtmp://58.200.131.2:1935/livetv/cctv6");
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
}