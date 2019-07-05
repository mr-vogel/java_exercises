package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Exercise7 {

    /*
        Launch new Browser
        Open “http://toolsqa.com/automation-practice-form/”
        Select ‘Continents’ Drop down ( Use Id to identify the element )
        Select option ‘Europe’ (Use selectByIndex)
        Select option ‘Africa’ now (Use selectByVisibleText)
        Print all the options for the selected drop down and select one option of your choice
        Close the browser
     */

    public static void main(String[] args){

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-form/");

        //Select the 'Continents' drop down, using the ID to identify the element
        Select oSelect = new Select(driver.findElement(By.id("continents")));

        //Select option 'Europe', using selectByIndex
        oSelect.selectByIndex(1);

        //Select option 'Africa', using selectByVisibleText
        oSelect.selectByVisibleText("Africa");

        //Print all the options for the selected drop down
        List<WebElement> elementList = oSelect.getOptions();
        int listSize = elementList.size();

        for(int i=0; i < listSize; i++){
            String sValue = elementList.get(i).getText();
            System.out.println(sValue);
        }

        //Close driver
        driver.quit();


    }
}
