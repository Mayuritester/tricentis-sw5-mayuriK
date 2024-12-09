package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(id = "product_attribute_16_5_4")
    WebElement selectprocessor;

    @CacheLookup
    @FindBy(id = "product_attribute_16_6_5")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath= "//input[@type='radio'][@name='product_attribute_16_3_6']")
    WebElement selecthdd;

    @CacheLookup
    @FindBy(xpath = "//input[@type='radio'][@name='product_attribute_16_4_7']")
    WebElement selectOS;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox'][@name='product_attribute_16_8_8']")
    WebElement selectSoftware;

    @CacheLookup
    @FindBy (xpath = "//input[@class='button-1 add-to-cart-button']")
    WebElement clickAddtoCart;

    @CacheLookup
    @FindBy (xpath = "//p[@class='content']")
    WebElement verifyProductaddedToCart;



    public void selectProcessor(String processor) {
        Reporter.log("Select Processor" + processor + "from processor dropdown " + selectprocessor.toString() + "<br>");
        selectByVisibleTextFromDropDown(selectprocessor,processor);
    }

    public void selectRam (String ram){
        Reporter.log("Select Ram" + ram + "from ram dropdown " + selectRam.toString() + "<br>");
        selectByVisibleTextFromDropDown(selectRam,ram);
    }

    public void selectHDD (String hdd) {
        Reporter.log("Select hdd" + hdd + "from hdd options " + selecthdd.toString() + "<br>");
        clickOnElement(selectRam);
    }
    public void selectos (String os) {
        clickOnElement(selectOS);
        Reporter.log("Select OS" + os + "from OS options " + selecthdd.toString() + "<br>");
        }

    public void selectSoftware (String software) {
        clickOnElement(selectSoftware);
        Reporter.log("Select software" + software + "from softwareoptions " + selectSoftware.toString() + "<br>");
        }

        public void clickonAddToCart (){
            clickOnElement(clickAddtoCart);
            CustomListeners.test.log(Status.PASS, "click on Add to Cart ");
            Reporter.log("click on add to cart" + clickAddtoCart + "from cart page " + clickAddtoCart.toString() + "<br>");
        }
    public String verifyProductAddedToCart (){
       String message =  getTextFromElement(verifyProductaddedToCart);
        CustomListeners.test.log(Status.PASS, "click on Add to Cart ");
        Reporter.log("Select software" + verifyProductaddedToCart + "from softwareoptions " + verifyProductaddedToCart.toString() + "<br>");
        return message;
    }

    }
