package com.redmart.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScreenBase {

    public AndroidDriver<AndroidElement> driver;


    public ScreenBase(AndroidDriver<AndroidElement> driver) {


        this.driver = driver;
    }


}
