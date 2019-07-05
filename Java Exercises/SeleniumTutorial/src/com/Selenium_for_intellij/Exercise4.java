package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

    /*
        Launch new Browser
        Open URL http://toolsqa.com/automation-practice-form/
        Type Name & Last Name (Use Name locator)
        Click on Submit button (Use ID locator)
     */

    public static void main(String[] args){

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-form/");

        //find the first element
        //WebElement firstName = ((ChromeDriver) driver).findElementByName("firstname");
        WebElement firstName = driver.findElement(By.name("firstname"));


        //Fill in first name
        firstName.sendKeys("Johnny");

        //find the second element
        //WebElement lastName = ((ChromeDriver) driver).findElementByName("lastname");
        WebElement lastName = driver.findElement(By.name("lastname"));

        //Fill in last name
        lastName.sendKeys("Test");

        //Click submit
        //((ChromeDriver) driver).findElementById("submit").click();
        driver.findElement(By.id("submit")).click();


        //Close driver
        driver.close();
    }
}
