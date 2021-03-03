package com.example.college_mine.Helperclasses;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.college_mine.R;

public class Slideradapter extends PagerAdapter {


    Context context;
    LayoutInflater layoutInflater;


    public Slideradapter(Context context) {
        this.context = context;
    }


    int headings[] = {

            R.string.first_slide_title,
            R.string.second_slide_title,
            R.string.third_slide_title,
            R.string.fourth_slide_title
    };


    int description[] = {

      R.string.first_slide_description,
      R.string.second_slide_description,
      R.string.third_slide_description,
      R.string.fourth_slide_description
    };

    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(ConstraintLayout) object;
    }

    @NonNull
    @Override
    public java.lang.Object instantiateItem(@NonNull ViewGroup container, int position) {


        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slides_layout,container,false);

          //hooks
        TextView heading=view.findViewById(R.id.slider_heading);
        TextView desc=view.findViewById(R.id.slider_description);

        //hooks view
        heading.setText(headings[position]);
        desc.setText(description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
            }
}