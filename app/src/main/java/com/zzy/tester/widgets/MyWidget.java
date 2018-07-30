package com.zzy.tester.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zzy.tester.MyApplication;

/**
 * @author zzy
 * @date 2018/7/30
 */

@SuppressLint("AppCompatCustomView")
public class MyWidget extends View {
    private static final String TAG = "zzy";
    private int keyCount;
    public MyWidget(Context context) {
        super(context);
    }

    public MyWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN://0
                keyCount = 0;
                Log.e(TAG, "MyWidget onTouchEvent 按住");
                return true;
            case MotionEvent.ACTION_UP://1
                Log.e(TAG, "MyWidget onTouchEvent 抬起 keyCount:"+keyCount);
                getParent().requestDisallowInterceptTouchEvent(false);
                if(keyCount>0){
                    Toast.makeText(MyApplication.instance, "MyWidget 滑动！！！", Toast.LENGTH_SHORT).show();
                    return true;
                }else{
                    return false;
                }
            case MotionEvent.ACTION_MOVE://2
                keyCount ++;
                getParent().requestDisallowInterceptTouchEvent(true);
                Log.e(TAG, "MyWidget onTouchEvent 移动");
                return false;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN://0
                Log.e(TAG, "MyWidget dispatchTouchEvent 按住");
                break;
            case MotionEvent.ACTION_UP://1
                Log.e(TAG, "MyWidget dispatchTouchEvent 抬起");
                break;
            case MotionEvent.ACTION_MOVE://2
                Log.e(TAG, "MyWidget dispatchTouchEvent 移动");
                break;
        }

        return super.dispatchTouchEvent(event);
    }
}
