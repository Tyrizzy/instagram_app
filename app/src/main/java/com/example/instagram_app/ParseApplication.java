package com.example.instagram_app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zkZENXyQEuhNHSzLn9350ZdKskEscArR2MI8jhYK")
                .clientKey("uEk5p9urJEPoUf0LIjlr7mTmofU3eGUFv422MZ3B")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
