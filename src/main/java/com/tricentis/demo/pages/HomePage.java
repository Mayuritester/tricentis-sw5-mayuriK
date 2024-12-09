package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement verifyLoginlink;

//    By loginLink = By.linkText("Log in");

    //    By registerLink = By.linkText("Register");
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText= "Log out")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu']//a[normalize-space()='Computers']")
    WebElement computerLink ;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Clicking on Login Link");
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Clicking on register Link");
    }

    public String verifyLogOutLink() {
        String message = getTextFromElement(logoutLink);
        CustomListeners.test.log(Status.PASS, "verify loutout link is present");
        System.out.println("link displayed is " + message);
        return message;

    }

    public void clickonLogoutLink (){
        clickOnElement(logoutLink);
        CustomListeners.test.log(Status.PASS, "click on logout link " + logoutLink);
    }
    public String verifyLoginlink() {
        String message1 = getTextFromElement(verifyLoginlink);
        CustomListeners.test.log(Status.PASS, "Get login link ");
        System.out.println("Name of link displayed is " + message1);
        return message1;
    }

    public void clickOnComputerLink (){
        clickOnElement(computerLink);
        CustomListeners.test.log(Status.PASS, "Click on Computer");
        Reporter.log("Clicking on Desktop Link" + computerLink.toString());
    }
}


