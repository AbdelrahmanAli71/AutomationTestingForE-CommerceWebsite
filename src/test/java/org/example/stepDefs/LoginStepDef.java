package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.registerPage;
import org.testng.asserts.SoftAssert;
import org.example.pages.Loginpage;

public class LoginStepDef {

        SoftAssert soft = new SoftAssert();
        Loginpage login = new Loginpage();

        @Given("user go to home page")
        public void userNavigateToHomepage()
        {
            login.navigateToLoginPage();
        }

        @And("user click on log in")
    public void userClickOnLogIn()
        {
            login.navigateToLoginPage().click();
        }

    @And("user fill his or her email {string}")
    public void userFillHisOrHerEmail(String arg0)
    {

        login.emailField().sendKeys(arg0);
    }

    @And("user fill his or her password {string}")
    public void userFillHisOrHerPassword(String arg0)
    {
        login.passwordField().sendKeys(arg0);

    }

    @And("user click on log in button")
    public void userClickOnLogInButton() {
        login.loginButton().click();
    }

    @Then("user should login successfully and see log out appears at the top right")
    public void userShouldLoginSuccessfullyAndSeeLogOutAppearsAtTheTopRight() throws InterruptedException {

        String actualUrl = login.currentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/";
        soft.assertEquals(actualUrl, expectedUrl);

        soft.assertTrue(login.myAccountTab().isDisplayed());

        boolean actualStatus = login.logOutButton().isDisplayed();
        Thread.sleep(4000);
        soft.assertTrue(actualStatus);
        soft.assertAll();

    }

    @Then("user click on log out button")
    public void userClickOnLogOutButton() {
        login.logOutButton().click();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() throws InterruptedException
    {
        boolean actualStatus = login.errorMsg().isDisplayed();
        String actualMsg = login.errorMsg().getText();
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        soft.assertTrue(actualMsg.contains(expectedMsg));
        String actualColor = login.errorMsg().getCssValue("color");
        String expectedColor = "rgba(228, 67, 75, 1)";
        soft.assertEquals(actualColor,expectedColor);
        Thread.sleep(4000);

        soft.assertTrue(actualStatus);
        soft.assertAll();
    }



}



