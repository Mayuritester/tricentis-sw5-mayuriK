package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage  extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText ;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer ;


    public String desktopText (){
        getTextFromElement(desktopText);
        String message = getTextFromElement(desktopText);
                return message;

    }

    public void clickOnBuildYourOwnComputer (){
        clickOnElement(buildYourOwnComputer);
        CustomListeners.test.log(Status.PASS,"Click on Build your own Computer");
        Reporter.log("Clicking on Build your own computer" +  buildYourOwnComputer.toString());
    }
}
