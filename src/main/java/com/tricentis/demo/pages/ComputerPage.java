package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText ;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;



    public String verifyComputerText (){
        String message = getTextFromElement(computerText);
        return message;
    }

    public void clickOnDesktopLink (){
        clickOnElement(desktopLink);
        CustomListeners.test.log(Status.PASS,"click on Desktop");
        Reporter.log("Clicking on Desktop Link" + desktopLink.toString());
    }

}
