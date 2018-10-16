package com.redmart.Utility;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {

    public static AppiumDriverLocalService appiumService;
    public static String appiumServiceUrl;


    public static void start() {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - " + appiumServiceUrl);


    }

    public static void stop() {
        appiumService.stop();


    }
}
