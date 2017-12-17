package com.brandon.themovies;

import android.support.v7.widget.RecyclerView;

public class MoviesRecyclerViewModel {

    private final MoviesAdapter moviesAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public MoviesRecyclerViewModel() {
        super();
        moviesAdapter = new MoviesAdapter();

    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        return layoutManager;
    }

    public MoviesAdapter getMoviesAdapter() {
        return moviesAdapter;
    }
}
