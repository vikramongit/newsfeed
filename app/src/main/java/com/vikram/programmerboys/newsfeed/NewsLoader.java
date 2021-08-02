

package com.vikram.programmerboys.newsfeed;

import androidx.loader.content.AsyncTaskLoader;
import android.content.Context;

import com.vikram.programmerboys.newsfeed.utils.QueryUtils;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {


    private static final String LOG_TAG = NewsLoader.class.getName();


    private String mUrl;


    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        // Trigger the loadInBackground() method to execute.
        forceLoad();
    }


    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of news.
        List<News> newsData = QueryUtils.fetchNewsData(mUrl);
        return newsData;
    }
}
