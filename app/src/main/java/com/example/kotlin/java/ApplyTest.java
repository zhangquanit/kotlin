package com.example.kotlin.java;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

/**
 * @author zhangquan
 */
public class ApplyTest {
    public void test(Context ctx) {
        TextView textView = new TextView(ctx);
        textView.setText("text");
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
