package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

    /*
        Launch new Browser
        Open URL http://toolsqa.com/automation-practice-form/
        Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
        Identify Submit button with ‘tagName’, convert it in to string and print it on the console
        Click on the Link “Link Test” (Use ‘linkTest’ locator)
     */

    public static void main(String[] args){

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-form/");

        //Find and click on "Partial Link Test"
        driver.findElement(By.partialLinkText("Partial")).click();

        //Identify Submit button with ‘tagName’, convert it in to string and print it on the console
        String nameOfTag = driver.findElement(By.tagName("button")).toString();
        System.out.println(nameOfTag);

        //Click on the Link "Link Test", use the 'linkTest' locator
        driver.findElement(By.linkText("Link Test")).click();

        //Close Driver
        driver.close();

    }
}
