package com.example.college_mine.common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.college_mine.R;
import com.example.college_mine.user.Userdashborad;

public class Splashscreen extends AppCompatActivity  {
    private static int SPLASH_TIMER=5000;
    ImageView backgroundImage;
    //variables
    Animation sideAnim,bottomAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        //hooks
        backgroundImage=findViewById(R.id.background_image);
        sideAnim= AnimationUtils.loadAnimation(this,R.anim.slide_anim);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        backgroundImage.setAnimation(sideAnim);

        new Handler().postDelayed(new Runnable(){


                                      @Override
                                      public void run() {
                                          Intent intent=new Intent(getApplicationContext(), OnBoarding_screen.class);
                                          startActivity(intent);
                                          finish();

                                      }
                                  },SPLASH_TIMER);




    }
}