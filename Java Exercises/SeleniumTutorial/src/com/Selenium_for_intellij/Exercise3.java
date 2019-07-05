package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    /* EXERCISE 3
    - Launch new Browser
    - Open DemoQA.com website
    - Click on Sortable link
    - Come back to Home page (Use ‘Back’ command)
    - Again go back to Registration page (This time use ‘Forward’ command)
    - Again come back to Home page (This time use ‘To’ command)
    - Refresh the Browser (Use ‘Refresh’ command)
    - Close the Browser
    */

    public static void main(String[] args){

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //OPEN WEBSITE
        driver.navigate().to("http://www.DemoQA.com");

        //Click on this link
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();

        //Go back to home page
        driver.navigate().back();

        //Go forward to the Sortable page again
        driver.navigate().forward();

        //Again come back to Home page (This time use ‘To’ command)
        driver.navigate().to("http://www.DemoQA.com");

        //Refresh the browser
        driver.navigate().refresh();


        //CLOSE DRIVER
        driver.close();

    }
}
