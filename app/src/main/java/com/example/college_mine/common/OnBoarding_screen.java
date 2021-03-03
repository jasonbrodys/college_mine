package com.example.college_mine.common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.college_mine.Helperclasses.Slideradapter;
import com.example.college_mine.R;

public class OnBoarding_screen extends AppCompatActivity {
    ViewPager ViewPager;
    LinearLayout dots_layout;
    Slideradapter slideradapter;
    TextView[] dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);

        //hooks
        ViewPager = findViewById(R.id.slider);
        dots_layout = findViewById(R.id.dots);


        //call adapter
        slideradapter = new Slideradapter(this);

        ViewPager.setAdapter(slideradapter);

        int position = 0;
        addDots(position );
        ViewPager.addOnPageChangeListener(changeListener);
    }


    private void addDots(int position){

        dots=new TextView[4];
        dots_layout.removeAllViews();
        for(int i=0;i<dots.length;i++){
            dots[i]=new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);


            dots_layout.addView(dots[i]);
        }

           if(dots.length>0){

               dots[position].setTextColor(getResources().getColor(R.color.color1));
           }
    }


    ViewPager.OnPageChangeListener changeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}