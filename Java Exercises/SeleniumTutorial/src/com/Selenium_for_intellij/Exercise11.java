package com.Selenium_for_intellij;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise11 {

    /*
    1) Launch new Browser
    2) Open URL “http://toolsqa.com/automation-practice-switch-windows/”
    3) Click on the Button “Timing Alert”
    4) Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)
     */

    public static void main(String[] args){

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");

        //Click on the button "Timing Alert"
        driver.findElement(By.xpath("//button[@id='timingAlert']")).click();

        //Need to wait for the alert to display, and then click accept
        WebDriverWait wait = new WebDriverWait(driver, 10);

        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

        //accept the alert
        myAlert.accept();

        //close the driver
        driver.quit();

    }
}
