package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {

    public static void main(String[] args) {

        //TC#3: Back and forth navigation
        //1-Open a chrome browser
        //setting up the browser driver
        WebDriverManager.chromedriver().setup();

        //open browser and create an instance of the driver
        WebDriver driver = new ChromeDriver();

        //2-Go to: https://google.com
        driver.get("https://www.google.com");

        //3-Click to Gmail from top right.
        //we are locating the Gmail link web element using findElement method and linkText Locator
        driver.findElement(By.linkText("Почта")).click();

        //4-Verify title contains:
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification Passed!");
        } else {
            System.out.println("Title verification Failed!!!");
        }

        //5-Go back to Google by using the .back();
        driver.navigate().back();
        //Thread.sleep(3000);
        driver.close();

        //6-Verify title equals:
        //Expected: Google

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification Passed!");
        } else {
            System.out.println("Google title verification Failed!!!");
        }
    }
}
