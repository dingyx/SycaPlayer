package com.sycamore.sycaplayer.media.view;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * @author dingyx
 * @description: 视频播放渲染 View 接口
 * @date: 2021/3/30
 */
public interface IRenderView {

    // 显示比例、类型
    int AR_ASPECT_FIT_PARENT = 0; // 不会裁剪
    int AR_ASPECT_FILL_PARENT = 1; // 可能裁剪
    int AR_ASPECT_WRAP_CONTENT = 2;
    int AR_MATCH_PARENT = 3;
    int AR_16_9_FIT_PARENT = 4;
    int AR_4_3_FIT_PARENT = 5;

    View getView();

    boolean shouldWaitForResize();

    void setVideoSize(int videoWidth, int videoHeight);

    // 宽高比 TODO sure
    void setVideoSampleAspectRatio(int videoSarNum, int videoSarDen);

    void setVideoRotation(int degree);

    void setAspectRatio(int aspectRatio);

    void addRenderCallback(@NonNull IRenderCallback callback);

    void removeRenderCallback(@NonNull IRenderCallback callback);


    interface ISurfaceHolder {
        void bindToMediaPlayer(IMediaPlayer mp);

        @NonNull
        IRenderView getRenderView();

        @Nullable
        SurfaceHolder getSurfaceHolder();

        @Nullable
        Surface openSurface();

        @Nullable
        SurfaceTexture getSurfaceTexture();

    }


    interface IRenderCallback {

        /**
         * @param holder ISurfaceHolder
         * @param width  可能为 0
         * @param height 可能为 0
         */
        void onSurfaceCreated(@NonNull ISurfaceHolder holder, int width, int height);

        /**
         *
         * @param holder ISurfaceHolder
         * @param format format 可能为0
         * @param width  width
         * @param height height
         */
        void onSurfaceChanged(@NonNull ISurfaceHolder holder, int format, int width, int height);

        void onSurfaceDestroyed(@NonNull ISurfaceHolder holder);

    }

}
