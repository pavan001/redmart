package com.redmart.TestCases;

import com.redmart.Base.TestBase;
import com.redmart.Screens.AddressActivity;
import com.redmart.Screens.HomeActivity;
import com.redmart.Screens.OnSale;
import com.redmart.Screens.SignUpActivity;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestScenario extends TestBase {


    HomeActivity homeactivity;
    SignUpActivity signupactivity;
    OnSale onsale;
    AddressActivity addressactivity;

    @BeforeTest
    public void init() {

        homeactivity = new HomeActivity(driver);
        signupactivity = new SignUpActivity(driver);
        onsale = new OnSale(driver);
        addressactivity = new AddressActivity(driver);


    }

    @Test
    public void scenarioOne() throws InterruptedException, IOException {

        homeactivity.clickOnNavigationDrawer();
        homeactivity.myaccount();
        signupactivity.enterEmail();
        signupactivity.enterPassword();
        signupactivity.clickRegister();
        log.info("Registration Successfull");
        Thread.sleep(6000);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        homeactivity.clickOnNavigationDrawer();
        homeactivity.onsale();
        onsale.addCart();
        onsale.deleteFromCart();
        homeactivity.cart();
        onsale.updateItemInCart();
        onsale.checkOut();
        addressactivity.addNewAddress();
        addressactivity.PostalCode();
        addressactivity.location();
        addressactivity.pinCodeAddress();
        addressactivity.floor();
        addressactivity.unit();
        addressactivity.firstName();
        addressactivity.lastName();
        addressactivity.save();


    }

}

