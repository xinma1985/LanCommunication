package com.palmer.lancommunication;

import android.app.Application;

public class LanCommunicationApp extends Application {

    public static LanCommunicationApp app = null;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
