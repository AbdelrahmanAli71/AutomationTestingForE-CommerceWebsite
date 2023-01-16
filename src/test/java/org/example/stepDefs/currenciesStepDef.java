package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class currenciesStepDef {
    SoftAssert soft = new SoftAssert();
    HomePage homePage = new HomePage();

    @Given("user change current currency to EURO")
    public void userchangecurrentcurrencytoEURO() throws InterruptedException {

        homePage.switchingCurrency(1);
        Thread.sleep(4000);

    }

    @Then("user should found all products prices in EURO")
    public void userShouldFoundAllProductsPricesInEURO() {

        int numberOfProducts = homePage.productPrices().size();
        for (int i = 0; i < numberOfProducts; i++) {

            String actual = homePage.productPrices().get(i).getText();
            System.out.println(actual);
            String expected = "€";
            Assert.assertTrue(actual.contains(expected));
        }

    }

    @Given("user change current currency to US Dollar")
    public void userChangeCurrentCurrencyToUSDollar() throws InterruptedException {
        homePage.switchingCurrency(0);
        Thread.sleep(4000);
    }

    @Then("user should found all products prices in US Dollar")
    public void userShouldFoundAllProductsPricesInUSDollar() {
        int numberOfProducts = homePage.productPrices().size();
        for (int x = 0; x < numberOfProducts; x++) {


            String actual = homePage.productPrices().get(x).getText();
            System.out.println(actual);
            String expected = "$";
            Assert.assertTrue(actual.contains(expected));
        }
    }
}

