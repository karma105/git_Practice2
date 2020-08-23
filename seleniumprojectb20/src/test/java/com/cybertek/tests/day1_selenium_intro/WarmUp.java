package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Title = " + driver.getTitle());

        System.out.println("===============================");

       /* driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();

*/
        driver.get("https://practice.cybertekschool.com");

        driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();

        String actualUrl=driver.getCurrentUrl();
        System.out.println("Url = " +driver.getCurrentUrl() +actualUrl.contains("cybertekschool"));
        System.out.println("Title = " + driver.getTitle());

        Thread.sleep(3000);

        driver.close();


    }
}
