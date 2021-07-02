package com.example.myto_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myto_do.databinding.ActivitySplashScreenBinding;

import java.util.function.IntToDoubleFunction;

public class SplashScreen extends AppCompatActivity {
    ActivitySplashScreenBinding binding;

    Animation topAnim,bottomAnim;
    TextView textView1,textView2;
    ImageView imageView;
    // github check



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        binding.imgSplash.setAnimation(topAnim);
        binding.tvSplash.setAnimation(bottomAnim);
        binding.tvSplash1.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this,LogIn.class);
                startActivity(intent);
                finish();

            }
        },3333);
    }
}