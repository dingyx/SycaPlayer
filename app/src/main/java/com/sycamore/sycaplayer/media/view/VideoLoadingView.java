package com.sycamore.sycaplayer.media.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.sycamore.sycaplayer.R;


/**
 * @author dingyx
 * @description: 视频加载中
 * @date: 2021/1/18
 */
public class VideoLoadingView extends RelativeLayout {


    ImageView ivLoading;

    public VideoLoadingView(Context context) {
        super(context);
        initView(context);
    }

    public VideoLoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public VideoLoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.video_loading, this);
        ivLoading = (ImageView) this.findViewById(R.id.iv_loading);
        RotateAnimation rotate;
        rotate = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        LinearInterpolator lin = new LinearInterpolator();
        rotate.setInterpolator(lin);
        rotate.setDuration(2000);//设置动画持续周期
        rotate.setRepeatCount(-1);//设置重复次数
        rotate.setFillAfter(true);//动画执行完后是否停留在执行完的状态
        rotate.setStartOffset(10);//执行前的等待时间
        ivLoading.setAnimation(rotate);
        rotate.start();
    }


}
