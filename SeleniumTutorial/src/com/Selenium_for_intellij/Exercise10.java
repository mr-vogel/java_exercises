package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise10 {

    /*
        Launch new Browser
        Open URL “http://toolsqa.com/automation-practice-table/”
        Get the value from cell ‘Dubai’ with using dynamic xpath
        Print all the column values of row ‘Clock Tower Hotel’
     */

    public static void main(String[] args) throws InterruptedException{

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-table/");

        //Get the value from cell 'Dubai'
        String sRow = "1";
        String sCol = "2";

        //String cellText = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
        String cellText = driver.findElement(By.xpath("//tr[1]/td[2]")).getText(); //Just a different way to get the same thing as above, just using a shorter xpath

        System.out.println(cellText);

        Thread.sleep(1000);

        //Print all the column values of row 'Clock Tower Hotel'
        String sColValue = "Clock Tower Hotel";


         //First loop will find the 'ClOCK TWER HOTEL' in the first column
         for (int i=1;i<=5;i++){
         String sValue = null;
         sValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();

         if(sValue.equalsIgnoreCase(sColValue)){
             for (int j=1;j<=5;j++){
             String sRowValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
             System.out.println(sRowValue);
             }
             break;
         }
        }


        //Close Browser
        driver.close();

    }
}


/*
https://www.guru99.com/selenium-tutorial.html
https://www.toolsqa.com/selenium-tutorial/
https://www.toolsqa.com/selenium-webdriver/xpath-helper/
https://www.toolsqa.com/selenium-webdriver/choosing-effective-xpath/
https://demoqa.com/
 */