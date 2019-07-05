package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Exercise8 {

    /*
        Launch new Browser
        Open “http://toolsqa.com/automation-practice-form/”
        Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
        Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
        Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
        Print and select all the options for the selected Multiple selection list.
        Deselect all options
        Close the browser
     */

    public static void main(String[] args) throws InterruptedException{

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-form/");

        //Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
        Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));

        //Select option ‘Browser Commands’ (selectByIndex)
        oSelect.selectByIndex(0);

        //Wait so we can see what is happening
        Thread.sleep(2000);

        oSelect.deselectByIndex(0);

        //Deselect option 'Browser Commands' (deselectByIndex)
        Thread.sleep(2000);

        //Select option ‘Navigation Commands’ (selectByVisibleText)
        oSelect.selectByVisibleText("Navigation Commands");
        Thread.sleep(2000);

        //Deselect option 'Navigation Commands' (deselectByVisibleText)
        oSelect.deselectByVisibleText("Navigation Commands");
        Thread.sleep(2000);


        //Print all the options for the selected drop down
        List<WebElement> elementList = oSelect.getOptions();
        int listSize = elementList.size();

        for(int i=0; i < listSize; i++){
            //String sValue = elementList.get(i).getText();
            String sValue = oSelect.getOptions().get(i).getText();
            oSelect.selectByIndex(i);
            System.out.println(sValue);
        }

        Thread.sleep(1000);

        //Deselect all options
        oSelect.deselectAll();

        Thread.sleep(1000);

        //Close the browser
        driver.quit();





    }
}
