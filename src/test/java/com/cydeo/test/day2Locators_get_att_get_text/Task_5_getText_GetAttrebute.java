package com.cydeo.test.day2Locators_get_att_get_text;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5_getText_GetAttrebute {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
T5_getText_getAttribute

         */
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

       // 3- Verify header text is as expected:
       // Expected: Registration form

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedText = "Registration form";
        String actualText = headerText.getText();
        if(actualText.equals(expectedText)){
            System.out.println("HEADER is PASSED");
        }else {
            System.out.println("HEADER is NOT PASSED");
        }

       // 4- Locate “First name” input box

        WebElement firstNameBox = driver.findElement(By.name("firstname"));


       // 5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
       // T5_getText_getAttribute
        String expectedPlaceHolder = "first name";
        String actualvaluePlaceHolder = firstNameBox.getAttribute("placeholder");
        if(actualvaluePlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("VALUE is PASSED");
        }else {
            System.out.println("VALUE is NOT PASSED");
        }

        driver.quit();
    }
}
