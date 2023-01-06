package com.example.newstrend;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
//the is showing because it is deprecated method
public class PagerAdapter extends FragmentPagerAdapter {

    int tabCount;
//to initialize tabCount
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        //super keyword referring to the fragmentation
        super(fm, behavior);
        tabCount=behavior;
    }

    @NonNull
    @Override
    //below method will return fragment
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new SportFragment();
            case 2:
                return new HealthFragment();
            case 3:
                return new ScienceFragment();
            case 4:
                return new EntertainmentFragment();
            case 5:
                return new TechnologyFragment();
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
