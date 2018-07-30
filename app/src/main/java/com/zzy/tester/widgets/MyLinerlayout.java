package com.zzy.tester.widgets;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.zzy.tester.MyApplication;

/**
 * @author zzy
 * @date 2018/7/30
 */

public class MyLinerlayout extends LinearLayout{
    private static final String TAG = "zzy";
    public MyLinerlayout(Context context) {
        super(context);
    }

    public MyLinerlayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinerlayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyLinerlayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN://0
                Log.e(TAG, "MyLinerlayout onTouchEvent 按住");
                break;
            case MotionEvent.ACTION_UP://1
                Toast.makeText(MyApplication.instance, "viewGroup 被点击了", Toast.LENGTH_SHORT).show();
                Log.e(TAG, "MyLinerlayout onTouchEvent 抬起");
                break;
            case MotionEvent.ACTION_MOVE://2
                Log.e(TAG, "MyLinerlayout onTouchEvent 移动");
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN://0
                Log.e(TAG, "MyLinerlayout onInterceptTouchEvent 按住");
                break;
            case MotionEvent.ACTION_UP://1
                Log.e(TAG, "MyLinerlayout onInterceptTouchEvent 抬起");
                Toast.makeText(MyApplication.instance, "viewGroup 被点击了", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_MOVE://2
                Log.e(TAG, "MyLinerlayout onInterceptTouchEvent 移动");
                break;
        }
        return super.onInterceptTouchEvent(ev);


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN://0
                Log.e(TAG, "MyLinerlayout dispatchTouchEvent 按住");
                break;
            case MotionEvent.ACTION_UP://1
                Log.e(TAG, "MyLinerlayout dispatchTouchEvent 抬起");
                break;
            case MotionEvent.ACTION_MOVE://2
                Log.e(TAG, "MyLinerlayout dispatchTouchEvent 移动");
                break;
        }

        return super.dispatchTouchEvent(event);
    }


}
