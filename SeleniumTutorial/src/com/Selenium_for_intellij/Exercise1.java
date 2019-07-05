package com.Selenium_for_intellij;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise1 {

    public static void main(String[] args){

        String expectedURL = "https://testautomationu.applitools.com/";

        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationu.applitools.com/");

        //get the page title
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        //get tht length of the title
        int titleLength = title.length();
        System.out.println("Title length: " + titleLength);

        //get the page url
        String currentURL = driver.getCurrentUrl();

        //verify the correct URL opened
        if (expectedURL.equals(currentURL)){
            System.out.println("Pass: This is the correct page URL.");
        } else {
            System.out.println("Fail: This is not the correct page URL");
        }

        //get page source
        String pageSource = driver.getPageSource();

        //print page length
        System.out.println("Page length: " + pageSource.length());

        //close driver with open window
        driver.close();




    }
}


