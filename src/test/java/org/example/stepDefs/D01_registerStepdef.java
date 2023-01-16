package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;


public class D01_registerStepdef


{
    registerPage register = new  registerPage();
    registerPage register2 = new  registerPage();
    SoftAssert soft = new SoftAssert();

    String gender = "";

    @Given("user go to register page")
    public void goRegisterpage()
    {
register. registerLINK().click();

    }


    @When("user select gender type")
    public void userSelectGenderType()
    {
        register.selectgender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1)
    {
    register.enterfirstname().sendKeys(arg0);
    register2.enterlasttname().sendKeys(arg1);
    }


    @And("user selecting day of birth {int}")
    public void userSelectingDayOfBirth(int arg0)
    {
        register.selectingDay(arg0);

    }

    @And("user selecting month {int}")
    public void userSelectingMonth(int arg0)
    {
        register.selectingMonth(arg0);

    }

    @And("user selecting year {int}")
    public void userSelectingYear(int arg0)
    {
        register.selectingYear(arg0);

    }

    @And("user entering {string} his email")
    public void userEnteringHisEmail(String validEmail)
    {
        register.PassingTheMail(validEmail).sendKeys(validEmail);
    }

    @And("user entering {string} his company")
    public void userEnteringHisCompany(String arg0)
    {
        register.PassingTheCompany().sendKeys(arg0);
    }

    @And("user entering {string} is password")
    public void userEnteringPassword(String arg0)
    {
        register.userEnteringPassword().sendKeys(arg0);
    }

    @And("user reentering {string} is Confirmation password")
    public void userEnteringConfirmationPassword(String arg0)
    {
        register.userenterConfirmPassword().sendKeys(arg0);
    }

    @And("user click on Register Button")
    public void userClickOnRegisterButton()
    {
        register.clickOnRegisterButton().click();
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String arg0)
    {
        String actualMsg = register.message().getText();
        String expectedMsg = "Your registration completed";


        soft.assertTrue(expectedMsg.contains(actualMsg));
        soft.assertAll();

    }

    @And("user should see color of text green")
    public void userShouldSeeColorOfTextGreen()
    {
        String actualColor = register.color().getCssValue("color");
        System.out.println(actualColor);
        String expectedColor = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actualColor,expectedColor);
        soft.assertAll();
    }
}