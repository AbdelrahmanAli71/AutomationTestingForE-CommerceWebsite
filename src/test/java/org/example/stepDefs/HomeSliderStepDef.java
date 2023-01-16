package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;

import org.testng.asserts.SoftAssert;



public class HomeSliderStepDef {
    SoftAssert soft = new SoftAssert();
    HomePage homePage = new HomePage();

    @When("second slider is clickable")
    public void secondSliderIsClickable() {
        homePage.secondSlider();
    }

    @And("click on second slider")
    public void clickOnSecondSlider() {

        homePage.secondSlider().get(1).click();


    }

    @Then("user should be in the right url of second Slider")
    public void userShouldBeInTheRightUrlOf_second_Slider() {


        String actualUrl = homePage.currentUrl();
        System.out.println(actualUrl+ "= actual url");
        String expectedUrl = "https://demo.nopcommerce.com/iphone-6";
        soft.assertEquals(actualUrl, expectedUrl);
        soft.assertAll();
    }

    @When("first slider is clickable")
    public void firstSliderIsClickable() {
        homePage.firstSlider();
    }

    @And("click on first slider")
    public void clickOnFirstSlider() {
        homePage.locateSliders().get(0).click();

    }

    @Then("user should be in the right url of first slider")
    public void userShouldBeInTheRightUrlOfFirstSlider() {


        String actualUrl = homePage.currentUrl();
        System.out.println(actualUrl+ "= actual url");
        String expectedUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(actualUrl, expectedUrl);
        soft.assertAll();
    }
}
