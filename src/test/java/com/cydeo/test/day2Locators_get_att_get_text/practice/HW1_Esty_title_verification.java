package com.cydeo.test.day2Locators_get_att_get_text.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_Esty_title_verification {

    public static void main(String[] args) {
      /*  TC #1: Etsy Title Verification
        1. Open Chrome browser
        2. Go to https://www.etsy.com
        3. Search for “wooden spoon”
        4. Verify title:
        Expected: “Wooden spoon | Etsy”

       */


        // manually tested.\ expected title “Wooden spoon" | Etsy NOT PASSED

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://etsy.com");


        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));// to find search block
      searchBox.sendKeys("wooden spoon" + Keys.ENTER);// to send "wooden spoon" request to search box

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("TITLE test PASSED");
        } else  {
            System.out.println("TITLE test NOT PASSED");
        }

        driver.quit();



    }



}
