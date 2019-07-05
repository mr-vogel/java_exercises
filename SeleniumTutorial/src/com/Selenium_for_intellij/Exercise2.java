package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {


    /*
     EXERCISE 2

     1. Launch a new Chrome browser
     2. Open ToolsQA Practice Automation Page for Switch Windows: https://www.toolsqa.com/automation-practice-switch-windows/
     3. Use this statement to click on a New Browser Window button “driver.findElement(By.id(“New Browser Window”)).click();”
     4. Close the browser using close() command

    */

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        //Open Page
        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");

        //Open new browser window
        driver.findElement(By.id("button1")).click();

        //Close the browser
        //driver.close();
        driver.quit();
    }

}
