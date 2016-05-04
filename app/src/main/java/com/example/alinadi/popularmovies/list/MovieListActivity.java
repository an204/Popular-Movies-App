package com.example.alinadi.popularmovies.list;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.alinadi.popularmovies.BaseActivity;
import com.example.alinadi.popularmovies.R;
import com.example.alinadi.popularmovies.details.DetailsActivityFragment;
import com.example.alinadi.popularmovies.details.reviews.ReviewsFragment;
import com.example.alinadi.popularmovies.details.trailers.TrailersFragment;

public class MovieListActivity extends BaseActivity implements DetailsActivityFragment.CallBacks {


    @Override
    protected Fragment createFragment() {
        return new MovieListFragment();
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_movies_list;
    }

    @Override
    public void showReviews(int id) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_details, ReviewsFragment.newInstance(id)).addToBackStack(null).commit();
    }

    @Override
    public void showTrailers(int id) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_details, TrailersFragment.newInstance(id)).addToBackStack(null).commit();
    }
}
