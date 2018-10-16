package com.redmart.Screens;

import com.redmart.Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;


public class SignUpActivity extends ScreenBase {


    public SignUpActivity(AndroidDriver<AndroidElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "com.redmart.redmart.fake:id/email")
    public MobileElement emailfield;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/password")
    public MobileElement passwordfield;

    @AndroidFindBy(id = "com.redmart.redmart.fake:id/signup")
    public MobileElement registerbutton;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/gotIt")
    public MobileElement gotit;


    public SignUpActivity enterEmail() {

        String email = RandomStringUtils.randomAlphanumeric(17).toUpperCase();


        emailfield.sendKeys(email + "@gmail.com");
        return this;
    }


    public SignUpActivity enterPassword() {
        passwordfield.sendKeys("12345678");
        return this;

    }


    public SignUpActivity clickRegister() {
        registerbutton.click();
        return this;
    }

    public HomeActivity gotIt()

    {
        gotit.click();
        return new HomeActivity(driver);

    }
}


