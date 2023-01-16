 package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.example.stepDefs.Hooks.driver;

public class registerPage


{
public WebElement registerLINK()
    {


        return driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));

    }
    public WebElement selectgender()
    {

        return driver.findElement(By.cssSelector("input[name=\"Gender\"]"));
    }
  public WebElement enterfirstname()
  {
      return driver.findElement(By.cssSelector("input[name=\"FirstName\"]"));

  }

    public WebElement enterlasttname()
    {
        return driver.findElement(By.cssSelector("input[name=\"LastName\"]"));

    }
    public void selectingDay(int arg0) {
        WebElement parentlist = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(parentlist);
        select.selectByValue(String.valueOf(arg0));
    }
    public void selectingMonth(int arg0) {
        WebElement parentlist = driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(parentlist);
        select.selectByValue(String.valueOf(arg0));
    }
    public void selectingYear(int arg0) {
        WebElement parentlist = driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(parentlist);
        select.selectByValue(String.valueOf(arg0));
    }
    public WebElement PassingTheMail(String email) {
        email = email;
        return driver.findElement(By.id("Email"));
    }
    public WebElement PassingTheCompany() {
        return driver.findElement(By.id("Company"));
    }
    public WebElement userEnteringPassword() {
        return driver.findElement(By.id("Password"));
    }
    public WebElement userenterConfirmPassword() {
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement clickOnRegisterButton() {
        return driver.findElement(By.id("register-button"));
    }
    public WebElement message ()
    {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    public WebElement color ()
    {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }


}