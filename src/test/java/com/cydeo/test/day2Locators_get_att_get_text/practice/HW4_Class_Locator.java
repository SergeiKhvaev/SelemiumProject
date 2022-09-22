package com.cydeo.test.day2Locators_get_att_get_text.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_Class_Locator {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator

         */



       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //manual test passed successfully

       // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

       // 3- Click to “Home” link
       // WebElement linkHome = driver.findElement(By.linkText("Home"));// to find webelement home top left side of page
       // linkHome.click();// to hit on that link

        // locate "Home" button by class name
        WebElement linkHome = driver.findElement(By.className("nav-link"));// to find element - "Home" button by classname
        linkHome.click();// to click on "Home" button

        //4- Verify title is as expected:
       // Expected: Practice

        String expectedTitle1 = "Practice";
        String actualTitle1 = driver.getTitle();

        if (expectedTitle1.equals(actualTitle1)) {
            System.out.println("TITLE text PASSED");
        } else {
            System.out.println("TITLE text NOT PASSED");
        }
// close session
        driver.quit();

       // PS: Locate “Home” link using “className” locator




    }
}
