package com.brandon.themovies;

import android.app.Application;

import com.brandon.themovies.dependencyinjection.DaggerApplicationComponent;

public class MoviesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder()
                .build();
    }
}
