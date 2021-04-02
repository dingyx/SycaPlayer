# SycaPlayer
Android 视频播放器 Demo，依赖 Android环境的 [ijkplayer 视频播放器库](https://github.com/dingyx/ijkplayer) 完成的视频播放基本 Demo。本项目主要是参考[ijkplayer 官方 example](https://github.com/bilibili/ijkplayer/tree/master/android/ijkplayer/ijkplayer-example) 编写了视频播放的基本界面。主要可参考 media 目录下的视频播放界面实现。 

> 支持播放器 AndroidMediaPlayer、IjkMediaPlayer、ExoPlayer

* 主要说明

  * exoplayer --- 对google ExoPlayer 的封装
  * view --- 视频播放渲染 View 相关
  * IjkVideoView --- 视频播放View封装

* 基本使用

  ```java
  // 布局文件引入 IjkVideoView  控件后使用
  IjkVideoView videoView = findViewById(R.id.video_view);
  
  // 添加控制器
  AndroidMediaController mMediaController = new AndroidMediaController(this, false);
  videoView.setMediaController(mMediaController);
  
  // 设置播放文件路径
  videoView.setVideoPath("path");
  
  // 调用播放
  videoView.start();
  ```




##### 尚未完成 持续更新中...