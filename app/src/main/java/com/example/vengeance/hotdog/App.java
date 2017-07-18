package com.example.vengeance.hotdog;

import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // added so cold launches take some time(show off splash image)
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));
    }
}
