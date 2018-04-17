package com.example.android.tourguide;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * This creates a FragmentPagerAdapter to use to switch between fragments in the Tour Guide app
 * Var is TourFragmentPagerAdapter
 */

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {
    public TourFragmentPagerAdapter(FragmentManager fm) {super (fm);}

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ChurchFragment();
        } else if (position == 1) {
            return new PalaceFragment();
        } else if (position == 2) {
            return new NatureFragment();
        } else {
            return new FoodFragment();
        }
    }

    //create tab titles
    private String tabTitles[] = new String[] { "Churches", "Palaces", "Nature", "Food & Drink" };

    //Putting the tab titles into place

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
