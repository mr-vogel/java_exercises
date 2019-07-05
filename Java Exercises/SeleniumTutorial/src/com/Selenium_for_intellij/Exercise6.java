package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Exercise6 {

    /*
        Launch new Browser
        Open “http://toolsqa.com/automation-practice-form/“
        Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
        Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
        Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
     */

    public static void main(String[] args){

        // SET PATH TO CHROME DRIVER
        System.setProperty("webdriver.chrome.driver","/Users/mvdevspace/Selenium Drivers/chromedriver");

        // INSTANTIATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        //Launch browser and go to site
        driver.get("http://toolsqa.com/automation-practice-form/");

        //Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
        List<WebElement> radioBtns = driver.findElements(By.name("sex"));

        boolean btnValue = false;
        btnValue = radioBtns.get(0).isSelected();
        //System.out.println(btnValue);

        if(btnValue){
            radioBtns.get(0).click();
            System.out.println("We selected male, challenge 1 failed");
        }else {
            radioBtns.get(1).click();
            System.out.println("We selected female, challenge 1 complete");
        }

        //Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
        driver.findElement(By.id("exp-2")).click();

        //Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        List<WebElement> checkBoxes = driver.findElements(By.name("profession"));

        int listSize = checkBoxes.size();

        for(int i=0; i < listSize; i++){
            String chkBoxName = checkBoxes.get(i).getAttribute("value");

            if (chkBoxName.equals("Automation Tester")){
                checkBoxes.get(i).click();
                break;
            }

        }

        //Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
        WebElement ch4ChkBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        ch4ChkBox.click();

        driver.quit();
    }
}
