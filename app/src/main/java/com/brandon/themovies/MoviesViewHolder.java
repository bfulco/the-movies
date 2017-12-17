package com.brandon.themovies;

import android.support.v7.widget.RecyclerView;

import com.brandon.themovies.databinding.ItemMovieBinding;

public class MoviesViewHolder extends RecyclerView.ViewHolder {
    private ItemMovieBinding itemMovieBinding;

    public MoviesViewHolder(ItemMovieBinding moviesBinding) {
        super(moviesBinding.getRoot());
        itemMovieBinding = moviesBinding;
        itemMovieBinding.executePendingBindings();
    }

    public void bind(MovieViewModel movieViewModel) {
        itemMovieBinding.setMovieViewModel(movieViewModel);
        itemMovieBinding.executePendingBindings();
    }
}
