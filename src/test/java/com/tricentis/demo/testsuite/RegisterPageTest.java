package com.tricentis.demo.testsuite;

import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.pages.HomePage;
import com.tricentis.demo.pages.LoginPage;
import com.tricentis.demo.pages.RegisterPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */


@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
//        Click on the Register Link
        registerPage.clickOnRegisterLink();
//        Click on the "Register" button
        registerPage.clickOnRegisterButton();
//        Verify the error message "First name is required."
        registerPage.verifylastNameRequiredText();
//        Verify the error message "Last name is required."
        registerPage.verifylastNameRequiredText();
//        Verify the error message "Email is required."
        registerPage.verifyEmailRequiredText();
//        Verify the error message "Password is required."
        registerPage.verifyPasswordRequiredText();
//        Verify the error message "Password is required."
        registerPage.verifyConfirmPasswordRequiredText();
    }

    @Test (groups = {"smoke", "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
//    Click on the Register Link
        registerPage.clickOnRegisterLink();
//    Select gender "Female"
        registerPage.selectGander();
//    Enter the first name
        registerPage.enterFirstName("Mayuri");
//    Enter the last name
        registerPage.enterLastName("Patel");
//    Enter email
        registerPage.enterEmail("dancer123@gmail.com");
//    Enter password
        registerPage.enterPassword("Prime123");
//    Enter Confirm Password
     registerPage.enterConfirmPassword("Prime123");
//    Click on the "Register" button
       registerPage.clickOnRegisterButton();
//    Verify the message "Your registration completed"
        registerPage.verifyRegisterSuccessText();
    }
}