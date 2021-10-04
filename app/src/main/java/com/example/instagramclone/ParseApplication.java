package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0wfQkMVirGoOnIiWSrw3jMzSrbpXZEbvEodlp3Sw")
                .clientKey("6Kg1FpqtJrVDgPwxNbxtWk140jAqnC9fC0ShLyFL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
