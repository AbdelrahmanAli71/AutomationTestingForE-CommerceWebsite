package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.testng.asserts.SoftAssert;

public class followusStepDef {
    SoftAssert soft = new SoftAssert();
    HomePage homePage = new HomePage();

    @When("user opens facebook link")
    public void user_opens_facebook_link() throws InterruptedException {
        Thread.sleep(2000);

        homePage.locateFacebookBtn().click();

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        homePage.manageWindows();
        String actualUrl = homePage.currentUrl();
        System.out.println(actualUrl+ "= actual url");
        String expectedUrl = arg0;
        soft.assertEquals(actualUrl, expectedUrl);
        soft.assertAll();

    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        Thread.sleep(3000);
        homePage.locateTwitterBtn().click();

    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {

        Thread.sleep(3000);
        homePage.locateRssBtn().click();

    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        Thread.sleep(300);
        homePage.locateYoutubeBtn().click();
    }
}

