package com.brandon.themovies.dependencyinjection;

import com.brandon.themovies.MoviesApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {
        MoviesModule.class,
        ViewModule.class
})
public interface ApplicationComponent extends AndroidInjector<MoviesApplication> {
}
