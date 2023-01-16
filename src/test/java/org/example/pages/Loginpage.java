package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class Loginpage {
    public void navToLoginPage() {
        if (!(Hooks.driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/"))) {
            Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        }
    }

    public WebElement navigateToLoginPage()
    {
        return driver.findElement(By.className("ico-login"));
    }
    public WebElement emailField()
    {
        return driver.findElement(By.id("Email"));
    }
    public WebElement passwordField()
    {
        return driver.findElement(By.id("Password"));
    }
    public WebElement loginButton(){
        return driver.findElement(By.cssSelector("button[class*=login-button]"));
    }
    public WebElement logOutButton(){
        return driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));
    }
    public WebElement errorMsg(){
        return driver.findElement(By.cssSelector("div[class*=message-error]"));
    }
    public String currentUrl(){
        return driver.getCurrentUrl();
    }
    public WebElement myAccountTab(){
        return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
}