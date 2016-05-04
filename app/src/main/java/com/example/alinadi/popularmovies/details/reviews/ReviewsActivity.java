package com.example.alinadi.popularmovies.details.reviews;

import android.support.v4.app.Fragment;

import com.example.alinadi.popularmovies.BaseActivity;


public class ReviewsActivity extends BaseActivity {
    @Override
    protected Fragment createFragment() {
        return ReviewsFragment.newInstance(getIntent().getIntExtra("extra_movie_id", 0));
    }
}
