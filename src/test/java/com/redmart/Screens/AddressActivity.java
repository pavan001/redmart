package com.redmart.Screens;

import com.redmart.Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddressActivity extends ScreenBase {


    public AddressActivity(AndroidDriver<AndroidElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add new Address\")")
    public MobileElement addnewaddress;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"6 Fishery Port Road 619747\")")
    public MobileElement pincodeaddress;

    @AndroidFindBy(id = "com.redmart.redmart.fake:id/address")
    public MobileElement postalcode;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/location")
    public MobileElement location;

    @AndroidFindBy(id = "com.redmart.redmart.fake:id/floor")
    public MobileElement floor;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/unitNumber")
    public MobileElement unitnumber;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/firstName")
    public MobileElement firstname;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/lastName")
    public MobileElement lastname;


    @AndroidFindBy(xpath = "//*[@content-desc='Save']")
    public MobileElement save;


    public AddressActivity addNewAddress() {

        addnewaddress.click();
        return this;
    }

    public AddressActivity PostalCode() {

        postalcode.click();
        return this;
    }


    public void location() throws IOException {

        location.sendKeys("619747");
    }

    public void floor() throws IOException {
        floor.sendKeys("7");
    }


    public void unit() throws IOException {

        unitnumber.sendKeys("1");
    }


    public void firstName() throws IOException {

        firstname.sendKeys("PAVAN");
    }


    public void lastName() throws IOException {

        lastname.sendKeys("KUMAR");
    }

    public void save() throws IOException {

        save.click();


    }


    public void pinCodeAddress() throws IOException {

        pincodeaddress.click();


    }
}


