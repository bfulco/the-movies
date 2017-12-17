package com.brandon.themovies.dependencyinjection;

import com.brandon.themovies.TheMoviesActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ViewModule {
    @ContributesAndroidInjector
    abstract TheMoviesActivity bindMoviesActivity();
}
