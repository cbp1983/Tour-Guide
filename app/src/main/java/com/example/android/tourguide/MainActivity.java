package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Display the app through a ViewPager based in the MainActivity
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Set the ViewPager view

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create the TourFragmentPagerAdapter which knows which fragment to display on each page

        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager());

        // Set this adapter on the entire ViewPager

        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
