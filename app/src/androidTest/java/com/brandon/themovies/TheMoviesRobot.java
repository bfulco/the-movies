package com.brandon.themovies;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public interface TheMoviesRobot {

    class Hands {

    }

    class Eyes {

        public Eyes seesToolbar() {
            onView(withId(R.id.movies_toolbar))
                   .check(matches(isDisplayed()));
            return this;
        }

        public Eyes seesToolbarTitle() {
            onView(withId(R.id.movies_toolbar))
                    .check(matches(isDisplayed()));
            return this;
        }

        public Eyes seesEmptyMovies() {
            onView(withId(R.id.movies_list))
                .check(matches(isDisplayed()));
            return this;
        }
    }
}
