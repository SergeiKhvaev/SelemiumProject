package com.cydeo.test.day2Locators_get_att_get_text.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_Zero_Bank_Header {
    public static void main(String[] args) {
        /*
C #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
         */

        //Manual test passed successfully
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”

        WebElement header = driver.findElement(By.className("page-header"));
        String expecterHeader = "Log in to ZeroBank";
        String actualHeader = header.getText();
        if(actualHeader.equals(expecterHeader)){
            System.out.println("HEADER TEXT PASSED");
        } else {
            System.out.println("HEADER TEXT NOT PASSED");
        }

// close session
        driver.quit();

    }
}
