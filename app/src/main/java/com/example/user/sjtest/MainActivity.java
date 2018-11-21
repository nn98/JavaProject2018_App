package com.example.user.sjtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i=42;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

        LinearLayout layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout3 = new LinearLayout(this);
        layout3.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout4 = new LinearLayout(this);
        layout4.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout5 = new LinearLayout(this);
        layout5.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout6 = new LinearLayout(this);
        layout6.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout7 = new LinearLayout(this);
        layout7.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout8 = new LinearLayout(this);
        layout8.setOrientation(LinearLayout.HORIZONTAL);

        for (; i > 36; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout8.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout8.addView(t);
            }
        }
        for (; i > 30; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout7.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout7.addView(t);
            }
        }
        for (; i > 24; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout6.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout6.addView(t);
            }
        }
        for (; i > 18; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout5.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout5.addView(t);
            }
        }
        for (; i > 12; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout4.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout4.addView(t);
            }
        }
        for (; i > 6; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout3.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout3.addView(t);
            }
        }
        for (; i > 0; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(90, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout2.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout2.addView(t);
            }
        }
        layout.addView(layout2);
        layout.addView(layout3);
        layout.addView(layout4);
        layout.addView(layout5);
        layout.addView(layout6);
        layout.addView(layout7);
        layout.addView(layout8);

        setContentView(layout);
    }
}