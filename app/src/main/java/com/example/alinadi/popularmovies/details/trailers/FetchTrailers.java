package com.example.alinadi.popularmovies.details.trailers;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.example.alinadi.popularmovies.details.DataSetUpdateListener;
import com.example.alinadi.popularmovies.details.FetchMovieElements;
import com.example.alinadi.popularmovies.details.MovieServerConnector;


public class FetchTrailers extends FetchMovieElements {


    public FetchTrailers(Activity activity, DataSetUpdateListener listener) {
        super(activity, listener);
    }

    @Override
    @NonNull
    protected MovieServerConnector setServerConnector(Integer[] params) {
        return new MovieTrailersServerConnector(mActivity, params[0]);
    }

}
