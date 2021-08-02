package com.vikram.programmerboys.newsfeed.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import androidx.fragment.app.FragmentPagerAdapter;

import com.vikram.programmerboys.newsfeed.R;
import com.vikram.programmerboys.newsfeed.fragment.BusinessFragment;
import com.vikram.programmerboys.newsfeed.fragment.CultureFragment;
import com.vikram.programmerboys.newsfeed.fragment.EnvironmentFragment;
import com.vikram.programmerboys.newsfeed.fragment.FashionFragment;
import com.vikram.programmerboys.newsfeed.fragment.HomeFragment;
import com.vikram.programmerboys.newsfeed.fragment.ScienceFragment;
import com.vikram.programmerboys.newsfeed.fragment.SocietyFragment;
import com.vikram.programmerboys.newsfeed.fragment.SportFragment;
import com.vikram.programmerboys.newsfeed.fragment.WorldFragment;
import com.vikram.programmerboys.newsfeed.utils.Constants;



public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public CategoryFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case Constants.HOME:
                return new HomeFragment();
            case Constants.WORLD:
                return new WorldFragment();
            case Constants.SCIENCE:
                return new ScienceFragment();
            case Constants.SPORT:
                return new SportFragment();
            case Constants.ENVIRONMENT:
                return new EnvironmentFragment();
            case Constants.SOCIETY:
                return new SocietyFragment();
            case Constants.FASHION:
                return new FashionFragment();
            case Constants.BUSINESS:
                return new BusinessFragment();
            case Constants.CULTURE:
                return new CultureFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        int titleResId;
        switch (position) {
            case Constants.HOME:
                titleResId = R.string.ic_title_home;
                break;
            case Constants.WORLD:
                titleResId = R.string.ic_title_world;
                break;
            case Constants.SCIENCE:
                titleResId = R.string.ic_title_science;
                break;
            case Constants.SPORT:
                titleResId = R.string.ic_title_sport;
                break;
            case Constants.ENVIRONMENT:
                titleResId = R.string.ic_title_environment;
                break;
            case Constants.SOCIETY:
                titleResId = R.string.ic_title_society;
                break;
            case Constants.FASHION:
                titleResId = R.string.ic_title_fashion;
                break;
            case Constants.BUSINESS:
                titleResId = R.string.ic_title_business;
                break;
            default:
                titleResId = R.string.ic_title_culture;
                break;
        }
        return mContext.getString(titleResId);
    }
}