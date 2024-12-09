package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement clickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[2]/span[2]")
    WebElement firstNameRequiredText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Last name is required.')]")
    WebElement lastNameRequiredText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Email is required.')]")
    WebElement emailRequiredText;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Password is required.')]")
    WebElement passwordRequiredText;

    @CacheLookup
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement confirmPasswordRequiredText;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement selectGender;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPasssword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerSuccessText;


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on register click");

    }

    public void clickOnRegisterButton() {
        clickOnElement(clickOnRegisterButton);
        CustomListeners.test.log(Status.PASS, "Click on register click");

    }

    public String verifyFirstNameRequiredText () {
        String message = getTextFromElement(firstNameRequiredText);
        CustomListeners.test.log(Status.PASS, "get first name requiered text");
        return message;
    }

    public String verifylastNameRequiredText () {
        String message = getTextFromElement(lastNameRequiredText);
        CustomListeners.test.log(Status.PASS, "verify lastname requiered text");
        return message;
    }

    public String verifyEmailRequiredText () {
        String message = getTextFromElement(emailRequiredText);
        CustomListeners.test.log(Status.PASS, "verify email requiered text");
        return message;
    }

    public String verifyPasswordRequiredText () {
        String message = getTextFromElement(passwordRequiredText);
        CustomListeners.test.log(Status.PASS, "verify password requiered text");
        return message;
    }
    public String verifyConfirmPasswordRequiredText () {
        String message = getTextFromElement(confirmPasswordRequiredText);
        CustomListeners.test.log(Status.PASS, "verify confirm password requiered text");
        return message;
    }

    public void selectGander() {
       clickOnElement(selectGender);
        CustomListeners.test.log(Status.PASS, "select Female Gender");

    }
    public void enterFirstName(String name) {
        sendTextToElement(enterFirstName, name);
        CustomListeners.test.log(Status.PASS, "enter First Name" + name);

    }

    public void enterLastName(String lastname) {
        sendTextToElement(enterLastName, lastname);
        CustomListeners.test.log(Status.PASS, "enter last Name" + lastname);

    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, email);
        CustomListeners.test.log(Status.PASS, "enter email" + email);

    }

    public void enterPassword (String password) {
        sendTextToElement(enterPassword, password);
        CustomListeners.test.log(Status.PASS, "enter password" + password);

    }

    public void enterConfirmPassword (String confirmpassword) {
        sendTextToElement(enterConfirmPasssword, confirmpassword);
        CustomListeners.test.log(Status.PASS, "enter password" + confirmpassword);

    }

    public void verifyRegisterSuccessText () {
        getTextFromElement(registerSuccessText);
        CustomListeners.test.log(Status.PASS, "verify Register Success Text" );

    }


}
