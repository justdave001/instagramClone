package com.codepath.oobal.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import static com.parse.Parse.*;
import static com.parse.Parse.Configuration.*;
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zc1YmfY67zxPCkmaga3wS6BSUhiyqcovAOmTdHhW")
                .clientKey("1YMCY2bKWB70I9QVzeNSftW12yodtirMcAPFstde")
                .server("https://parseapi.back4app.com")
                .build()

        );
    }
}