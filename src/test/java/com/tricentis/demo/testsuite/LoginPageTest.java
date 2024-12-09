package com.tricentis.demo.testsuite;

import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.pages.HomePage;
import com.tricentis.demo.pages.LoginPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */



@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity"})
    public void userShouldNavigateToLoginPageSuccessFully() {
//        Click on the login link
        homePage.clickOnLoginLink();
//        verify that the "Welcome, Please Sign In!" message display
        loginPage.getWelcomeText();

    }

    @Test (groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
//        Click on the login link
        homePage.clickOnLoginLink();
//        Enter EmailId
        loginPage.enterEmailId("dance123@gmail.com");
//        Enter Password
        loginPage.enterPassword("prime1234");
//        Click on the Login Button
        loginPage.clickOnLoginButton();
//        Verify that the Error message
        loginPage.getErrorMessage();
    }

    @Test (groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
//        Click on the login link
        homePage.clickOnLoginLink();
//        Enter EmailId
        loginPage.enterEmailId("computer.tester009@gmail.com");
//        Enter Password
        loginPage.enterPassword("tester123");
//        Click on the Login Button
        loginPage.clickOnLoginButton();
//        Verify that the LogOut link is displayed
        homePage.verifyLogOutLink();
    }
    @Test (groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
//        Click on the login link
        homePage.clickOnLoginLink();
//        Enter EmailId
        loginPage.enterEmailId("computer.tester009@gmail.com");
//        Enter Password
        loginPage.enterPassword("tester123");
//        Click on the Login Button
        loginPage.clickOnLoginButton();
//        Click on the LogOut Link
        homePage.clickonLogoutLink();
//        Verify that the LogIn Link Display
        homePage.verifyLoginlink();

    }

    }
