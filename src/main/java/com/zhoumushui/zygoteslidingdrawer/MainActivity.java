package com.zhoumushui.zygoteslidingdrawer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SlidingDrawer;

import com.zhoumushui.zygoteslidingdrawer.util.HintUtil;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();

        setContentView(R.layout.activity_main);

        initialLayout();
    }

    private void initialLayout() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;
        HintUtil.showToast(context, "Weight:" + displayMetrics.widthPixels +
                " Height:" + screenHeight);

        SlidingDrawer slidingDrawer = (SlidingDrawer) findViewById(R.id.slidingDrawer);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, screenHeight / 2);
        slidingDrawer.setLayoutParams(layoutParams);
    }

}
