package com.tricentis.demo.testsuite;

import com.tricentis.demo.customlisteners.CustomListeners;
import com.tricentis.demo.pages.*;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Jay Vaghani
 */




@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ComputerPage computerPage= new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    //Utility utility = new Utility();
    @BeforeMethod(alwaysRun = true)
  //  @Parameters("browser")

    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
       // utility = new Utility();
    }

    @Test(groups = {"sanity"})

public void verifyUserShouldNavigateToComputerPageSuccessfully(){
//    Click on the COMPUTER tab
     homePage.clickOnComputerLink();
//    Verify "Computer" text
       computerPage.verifyComputerText();
    }

    @Test (groups = {"smoke", "regression"})
  public void  verifyUserShouldNavigateToDesktopsPageSuccessfully() {
//        Click on the COMPUTER tab
        homePage.clickOnComputerLink();
//        Click on the Desktops link
         computerPage.clickOnDesktopLink();
//        Verify "Desktops" text
         desktopsPage.desktopText();
    }
    @Test ( dataProvider = "computers", dataProviderClass = TestData.class)
  public void  verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
//    Click on the COMPUTER tab
        homePage.clickOnComputerLink();
//    Click on the Desktops link
        computerPage.clickOnDesktopLink();
//    Click on the product name "Build your own computer"
       desktopsPage.clickOnBuildYourOwnComputer();
//    Select processor "processor"
        buildYourOwnComputerPage.selectProcessor(processor);
//    Select RAM "ram"
       buildYourOwnComputerPage.selectRam(ram);
//    Select HDD "hdd"
        buildYourOwnComputerPage.selectHDD(hdd);
//    Select OS "os"
         buildYourOwnComputerPage.selectos(os);
//    Select Software "software"
          buildYourOwnComputerPage.selectSoftware(software);
//    Click on "ADD TO CART" Button
       buildYourOwnComputerPage.clickonAddToCart();
//    Verify the message "The product has been added to your shopping cart"
       buildYourOwnComputerPage.verifyProductAddedToCart();
    }


    }
