package com.brandon.themovies;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class TheMoviesActivityTest {

    @Rule
    public ActivityTestRule<TheMoviesActivity> testRule = new ActivityTestRule<>(TheMoviesActivity.class);

    TheMoviesRobot.Hands hands = new TheMoviesRobot.Hands();
    TheMoviesRobot.Eyes eyes = new TheMoviesRobot.Eyes();

    @Test
    public void launchApp_launchesActivity() {
        eyes.seesToolbar()
                .seesToolbarTitle();
    }

    @Test
    public void hasNoMovies() {
        eyes.seesEmptyMovies();
    }
}
