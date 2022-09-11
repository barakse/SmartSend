package com.example.smartsend.smartsendapp.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.smartsend.smartsendapp.R;
import com.example.smartsend.smartsendapp.utilities.SplashPagerAdapter;

public class WelcomeActivity extends AppCompatActivity {

    ViewPager welcomeViewPager;
    SplashPagerAdapter welcomeViewPagerAdapter;
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        welcomeViewPager =(ViewPager) findViewById(R.id.welcome_view_pager);
        welcomeViewPagerAdapter = new SplashPagerAdapter(this);
        welcomeViewPager.setAdapter(welcomeViewPagerAdapter);
        ctx = this;
        ViewPager.OnPageChangeListener listenerWelcomeViewPager = new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int pageNumber) {
                // TODO Auto-generated method stub
               if(pageNumber == 1){
                   goLoginActivity();
               }

            }

            @Override
            public void onPageScrolled(int pageScrolledOn, float positionOffset, int positionOffsetPixels) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        };
        welcomeViewPager.setOnPageChangeListener(listenerWelcomeViewPager);
    }

    public void goLoginActivity(){
        Intent intent = new Intent(WelcomeActivity.this,
                LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
