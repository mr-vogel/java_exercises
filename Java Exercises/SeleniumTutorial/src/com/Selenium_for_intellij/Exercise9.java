package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise9 {

    /*
        Launch new Browser
        Open URL “http://toolsqa.com/automation-practice-table/”
        Get the value from cell ‘Dubai’ and print it on the console
        Click on the link ‘Detail’ of the first row and last column
     */

    public static void main(String[] args) throws InterruptedException{

         // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-table/");

        //Get the value from cell 'Dubai'
        String cellText = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(cellText);

        Thread.sleep(1000);

        //Click on the link 'Detail' of the first row and last column
        driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a")).click();

        Thread.sleep(1000);

        //close browser
        driver.quit();

    }
}
