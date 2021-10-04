package com.example.swipe_test.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.swipe_test.Frag1;
import com.example.swipe_test.Frag2;
import com.example.swipe_test.Frag3;
import com.example.swipe_test.Global_Variables;
import com.example.swipe_test.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Frag1();

                break;
            case 1:
                fragment = new Frag2();

                break;
            case 2:
                fragment = new Frag3();

                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return TAB_TITLES.length;
    }

    public void getMessage(int position) {
        switch (position) {
            case 0:
                Global_Variables.weapon = "1 Silver Sword";
                Global_Variables.magic = "Teleport";
                break;
            case 1:
                Global_Variables.weapon = "Aard - Igni - Yrden - Quen - Axii";
                Global_Variables.magic = "";
                break;
            case 2:
                Global_Variables.weapon = "1 Silver and 1 Steel Sword";
                Global_Variables.magic = "Aard - Igni - Yrden - Quen - Axii";
                break;
        }
    }

}