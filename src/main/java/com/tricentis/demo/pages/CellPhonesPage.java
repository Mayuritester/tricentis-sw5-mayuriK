package com.tricentis.demo.pages;

import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneTitle;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-viewmode']")
    WebElement listView;

    public String getTitleOfSellPhonesText(){
        String message = getTextFromElement(cellPhoneTitle);
        return message;

    }

    public void selectViewAsList(String option){
        selectByVisibleTextFromDropDown(listView, option);
    }

    public void clickOnYourSelectedProduct(String productName){
        clickOnElement(By.linkText(productName));
    }

}
