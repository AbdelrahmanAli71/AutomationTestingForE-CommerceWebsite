package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


    public class Hooks {
      public static WebDriver driver;
        @Before
        public void openBrowser()
        {
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.navigate().to("https://demo.nopcommerce.com/");

        }
        @After
        public void userQuitDriver()
                throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();


        }





    }

