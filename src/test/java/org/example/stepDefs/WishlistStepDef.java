package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class WishlistStepDef {
    SoftAssert soft = new SoftAssert();
    HomePage homePage = new HomePage();

    @When("user click on the wish list button of the htc product")
    public void userclickonthewishlistbuttonofthehtcproduct() {

        homePage.locateWishlistBtns().get(2).click();
    }

    @Then("user should see success message {string} with green background color")
    public void userShouldSeeSuccessMessageWithGreenBackgroundColor(String expectedSuccessMsg) {
        String actualSuccessMsg = homePage.locateBkgOfSuccessMsgNotification().getText();
        boolean statusOfSuccessMsg = homePage.locateBkgOfSuccessMsgNotification().isDisplayed();
        String actualColorOfBkg = homePage.locateBkgOfSuccessMsgNotification().getCssValue("background-color");
        String expectedColorMsg = "rgba(75, 176, 122, 1)";
        System.out.println("actualColorOfBkg is " + actualColorOfBkg);
        System.out.println("actualSuccessMsg is  "+actualSuccessMsg);
        soft.assertEquals(actualSuccessMsg,expectedSuccessMsg);
        soft.assertEquals(actualColorOfBkg,expectedColorMsg);
        soft.assertTrue(statusOfSuccessMsg);
        soft.assertAll();

    }

    @And("the success message is disappeared")
    public void theSuccessMessageIsDisappeared() {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        explicitWait.until(ExpectedConditions.invisibilityOf(homePage.locateBkgOfSuccessMsgNotification()));
    }

    @And("click on wish list tab")
    public void clickOnWishListTab() {
        homePage.locateWishListTab().click();
    }

    @Then("user should get Qty value and verify it's bigger than zero")
    public void userShouldGetQtyValueAndVerifyItSBiggerThanZero() {
        int numberOfProductsInWishList = homePage.productName().size();

        soft.assertFalse(numberOfProductsInWishList == 0);
        soft.assertAll();
    }
}
