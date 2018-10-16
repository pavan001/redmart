package com.redmart.Base;

import com.redmart.Utility.AppiumServer;
import com.redmart.Utility.CommonUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;


public class TestBase {


    public static AndroidDriver<AndroidElement> driver;
    public static String loadPropertyFile = "Android_redmart.properties";
    public static Logger log = Logger.getLogger("devpinoyLogger");

    @BeforeSuite
    public void setUp() throws IOException {

        if (driver == null) {


            AppiumServer.start();
            log.debug("Appium server started");


            if (loadPropertyFile.startsWith("Android")) {

                CommonUtility.loadAndroidConfigProp(loadPropertyFile);
                CommonUtility.setAndroidCapabilities();
                driver = CommonUtility.getAndroidDriver();

            } else if (loadPropertyFile.startsWith("IOS")) {

			/*
				CommonUtils.loadIOSConfProp(loadPropertyFile);
				CommonUtils.setIOSCapabilities();
				driver = CommonUtils.getIOSDriver();*/

            }


        }


    }

    @AfterSuite
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
        AppiumServer.stop();
        log.debug("Appium server stopped");

    }


    public void hideKeyboard() {


        driver.hideKeyboard();


    }

}


