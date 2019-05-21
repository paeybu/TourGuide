package com.kabu.kabi.tourguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourAdapter extends FragmentPagerAdapter {
    public TourAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new TempleFragment();
            case 1:
                return new MallFragment();
            default:
                return new TempleFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Temple";
            case 1:
                return "Shopping Mall";
            default:
                return "N/A";
        }
    }
}
