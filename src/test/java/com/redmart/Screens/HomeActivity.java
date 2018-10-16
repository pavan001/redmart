package com.redmart.Screens;

import com.redmart.Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;


public class HomeActivity extends ScreenBase {

    WebDriverWait wait;


    public HomeActivity(AndroidDriver<AndroidElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    @AndroidFindBy(xpath = "//*[@content-desc='Menu opened']")
    public MobileElement navigationdrawer;


    @AndroidFindBy(xpath = "//*[@content-desc='Cart']")
    public MobileElement cart;

    @AndroidFindBy(xpath = "//*[@content-desc='My Account']")
    public String myaccount;



    @AndroidFindBy(xpath = "//*[@content-desc='On Sale']")
    public MobileElement onsale;


    public HomeActivity clickOnNavigationDrawer() {
        navigationdrawer.click();
        return this;

    }


    public HomeActivity onsale() {
        onsale.click();
        return this;

    }


    public HomeActivity cart() {
        cart.click();
        return this;

    }

    public HomeActivity myaccount() {


        wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@content-desc='My Account']"))).click();
        return this;
    }


}
