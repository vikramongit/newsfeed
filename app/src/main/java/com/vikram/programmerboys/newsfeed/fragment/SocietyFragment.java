package com.vikram.programmerboys.newsfeed.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.vikram.programmerboys.newsfeed.News;
import com.vikram.programmerboys.newsfeed.NewsLoader;
import com.vikram.programmerboys.newsfeed.NewsPreferences;
import com.vikram.programmerboys.newsfeed.R;

import java.util.List;


public class SocietyFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = SocietyFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String societyUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.society));
        Log.e(LOG_TAG, societyUrl);


        return new NewsLoader(getActivity(), societyUrl);
    }
}
