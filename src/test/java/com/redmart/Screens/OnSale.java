package com.redmart.Screens;

import com.redmart.Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnSale extends ScreenBase {
    public OnSale(AndroidDriver<AndroidElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/productGridButton")
    public List<MobileElement> addcart;


    @AndroidFindBy(id = "com.redmart.redmart.fake:id/minus")
    public List<MobileElement> deletefromcart;

    @AndroidFindBy(id = "com.redmart.redmart.fake:id/add")
    public List<MobileElement> updateitemincart;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CHECKOUT\")")
    public MobileElement checkout;


    public OnSale addCart() {

        addcart.get(0).click();
        addcart.get(1).click();
        addcart.get(2).click();

        return this;
    }


    public OnSale deleteFromCart() {

        deletefromcart.get(0).click();

        return this;
    }

    public OnSale updateItemInCart() {

        updateitemincart.get(2).click();

        return this;

    }

    public AddressActivity checkOut() {

        checkout.click();

        return new AddressActivity(driver);

    }

}
