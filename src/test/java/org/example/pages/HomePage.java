package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class HomePage{
    public void switchingCurrency(int num) {


        //create object from Select class
        WebElement parentlist = driver.findElement(By.id("customerCurrency"));
        Select select = new Select(parentlist);
        select.selectByIndex(num);


    }


    public List<WebElement> productPrices() {
        List<WebElement> productPrices = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productPrices;
    }

    public WebElement searchField() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton() {
        return driver.findElement(By.cssSelector("button[class*=search-box-button]"));
    }

    public List<WebElement> productTitles() {

        List<WebElement> productTitles = driver.findElements(By.cssSelector("[class=\"product-title\"]"));
        return productTitles;

    }

    public String currentUrl() {

        return driver.getCurrentUrl();
    }

    public WebElement numberLabel() {
        return driver.findElement(By.cssSelector("input[class*=enter-price-input]"));
    }

    public List<WebElement> subCategoriesOfComputers() {
        // first we will hover th the main category
        Actions actions = new Actions(driver);
        actions.moveToElement(locateMainCatComp()).perform();

        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]+div[class=\"sublist-toggle\"]+ul[class=\"sublist first-level\"] a[href]"));

    }

    public WebElement assertThatIsTheRightPage() {
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));

    }

    public WebElement locateMainCatComp() {
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }

    public void firstSlider() {
        List<WebElement> sliders = driver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]"));

        // create new object from WebDriverWait
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        explicitWait.until(ExpectedConditions.attributeContains(sliders.get(0), "style", "display: block;"));
    }

    public List<WebElement> locateSliders() {
        List<WebElement> sliders = driver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]"));
        return sliders;

    }

    public List<WebElement> secondSlider() {
        List<WebElement> sliders = driver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]"));

        // create new object from WebDriverWait
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.attributeContains(sliders.get(1), "style", "display: block;"));
        return sliders;
    }

    public WebElement locateFacebookBtn(){
        return driver.findElement(By.cssSelector("li[class=\"facebook\"]"));
    }
    public WebElement locateTwitterBtn(){
        return driver.findElement(By.cssSelector("li[class=\"twitter\"]"));
    }
    public WebElement locateRssBtn(){
        return driver.findElement(By.cssSelector("li[class=\"rss\"]"));
    }
    public WebElement locateYoutubeBtn(){
        return driver.findElement(By.cssSelector("li[class=\"youtube\"]"));
    }
    public void manageWindows(){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
    public List<WebElement> locateWishlistBtns(){
        List<WebElement> wishlistBtns = driver.findElements(By.cssSelector("button[class*=add-to-wishlist-button]"));
        return wishlistBtns;
    }
    public WebElement locateTextOfWishListSuccessMsg(){
        return driver.findElement(By.cssSelector("p[class]"));
    }
    public WebElement locateBkgOfSuccessMsgNotification(){
        return driver.findElement(By.cssSelector("div[class*=success]"));
    }
    public WebElement locateWishListTab(){
        return  driver.findElement(By.cssSelector("[class=\"wishlist-label\"]"));
    }
    public List<WebElement> productName ()
    {
        List <WebElement> productName = driver.findElements(By.cssSelector("div[class=\"table-wrapper\"] table[class=\"cart\"] tbody tr"));
        return productName;
    }

}


