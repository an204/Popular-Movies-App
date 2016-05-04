package com.example.alinadi.popularmovies.details.reviews;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.example.alinadi.popularmovies.details.DataSetUpdateListener;
import com.example.alinadi.popularmovies.details.FetchMovieElements;
import com.example.alinadi.popularmovies.details.MovieServerConnector;

public class FetchReviews extends FetchMovieElements {


    public FetchReviews(Activity activity, DataSetUpdateListener listener) {
        super(activity, listener);
    }

    @NonNull
    @Override
    protected MovieServerConnector setServerConnector(Integer[] params) {
        return new MovieReviewsServerConnector(mActivity, params[0]);
    }

}
