package com.tricentis.demo.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {


    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@onclick='Billing.save()']")
    WebElement btnContinueBillingSave;

    @CacheLookup
    @FindBy(xpath = "//input[@onclick='Billing.save()']")
    WebElement btnContinueShippingSave;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAir;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement twoNdDayAir;


    @CacheLookup
    @FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
    WebElement btnContinueShippingMethodNextStep;

    @CacheLookup
    @FindBy(id = "paymentmethod_2")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
    WebElement btnContinuePayment;


    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement selectYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement ccCode;

    @CacheLookup
    @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
    WebElement btnContinuePaymentInfo;


    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement getCardType;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement getShippingMethod;


    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Confirm']")
    WebElement btnConfirm;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYou;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfullyMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@class='button-2 order-completed-continue-button']")
    WebElement btnContinueCompleted;


    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS, "Enter name" + name);

    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
        CustomListeners.test.log(Status.PASS, "Enter Surname" + name);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddress, email);
        CustomListeners.test.log(Status.PASS, "Enter email ID" + email);
    }

    public void selectCountryFromDropdown(String countryName) {
        sendTextToElement(country, countryName);
        CustomListeners.test.log(Status.PASS, "Enter country Name" + countryName);
    }

    public void enterCityName(String cityName) {
        sendTextToElement(city, cityName);
        CustomListeners.test.log(Status.PASS, "Enter cityname" + cityName);
    }

    public void enterShippingAddress(String addressOfShipping) {
        sendTextToElement(address1, addressOfShipping);
        CustomListeners.test.log(Status.PASS, "Enter shipping address" + addressOfShipping);
    }

    public void enterZipCode(String code) {
        sendTextToElement(zipCode, code);
        CustomListeners.test.log(Status.PASS, "Shipping ZipCode" + code);
    }

    public void enterPhoneNumber(String number) {
        sendTextToElement(phoneNumber, number);
        CustomListeners.test.log(Status.PASS, "Enter phone Number" + number);
    }

    public void clickOnContinueBillingSaveButton() {
        clickOnElement(btnContinueBillingSave);
        CustomListeners.test.log(Status.PASS, "click on save continue Billing saving Button" );
    }

    public void clickOnContinueShippingSaveButton() {
        clickOnElement(btnContinueShippingSave);
        CustomListeners.test.log(Status.PASS, "click on continue shipping save Button" );
    }

    public void clickOnShippingMethodOnNextDayAir() {
        clickOnElement(nextDayAir);
        CustomListeners.test.log(Status.PASS, "click on continue shipping method on next day air" );
    }

    public void clickOnShippingMethodOn2ndDayAir() {
        clickOnElement(twoNdDayAir);
        CustomListeners.test.log(Status.PASS, "click on continue shipping method on 2nd day air" );
    }

    public void clickOnContinueShippingMethodNextStep() {
        clickOnElement(btnContinueShippingMethodNextStep);
        CustomListeners.test.log(Status.PASS, "click on continue shipping method next Step" );
    }

//    public void clickOnCreditCard() {
//        clickOnElement(waitUntilVisibilityOfElementLocated(creditCard, 2));
//        CustomListeners.test.log(Status.PASS, "click on credit card" );
//    }

    public void clickOnContinuePayment() {
        clickOnElement(btnContinuePayment);
        CustomListeners.test.log(Status.PASS, "click on continue payment" );
    }

    public void selectCardTypFromDropdown(String card) {
        selectByVisibleTextFromDropDown(cardType, card);
        CustomListeners.test.log(Status.PASS, "select card type from drop down " );

    }

    public void enterCardholderName(String name) {
        sendTextToElement(cardHolderName, name);
        CustomListeners.test.log(Status.PASS, "Enter card holder name" + name );
    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumber, number);
        CustomListeners.test.log(Status.PASS, "Enter card number" + number);
        //}
    }

//    public void selectMonthOfExpiry(String month) {
//        selectByVisibleTextFromDropDown(selectMonth, month);
//    }
//
//    public void selectYearOfExpire(String year) {
//        selectByVisibleTextFromDropDown(selectYear, year);
//    }
//
//    public void enterCardCode(String code) {
//        sendTextToElement(ccCode, code);
//    }
//
//    public void clickOnContinuePaymentInfoButton() {
//        clickOnElement(btnContinuePaymentInfo);
//    }
//
//    public String getPaymentCardType() {
//        return getTextFromElement(getCardType);
//    }
//
//    public String getShippingMethod() {
//        return getTextFromElement(getShippingMethod);
//    }
//
//    public String getTotalPrice() {
//        return getTextFromElement(totalPrice);
//    }
//
//    public void clickOnConfirmButton() {
//        clickOnElement(btnConfirm);
//    }
//
//    public String getTitleOfThankYou() {
//        return getTextFromElement(thankYou);
//    }
//
//    public String getSuccessMessageOfOrderSuccessfullyProcessed() {
//        return getTextFromElement(successfullyMessage);
//    }
//
//    public void clickOnContinueOrderCompleteButton() {
//        clickOnElement(btnContinueCompleted);
//    }
//
//
//}
    }