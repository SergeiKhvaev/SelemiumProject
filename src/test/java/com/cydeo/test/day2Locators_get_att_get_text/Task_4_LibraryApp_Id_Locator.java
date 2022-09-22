package com.cydeo.test.day2Locators_get_att_get_text;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4_LibraryApp_Id_Locator {
    public static void main(String[] args) {
        /*
1. Open Chrome browser
2. Go to http://library2.cydeo.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Find and click on signing button
6. Verify: visually “Sorry, Wrong Email or Password”
displayed
         */
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2. Go to http://library2.cydeo.com/login.html
 driver.get("http://library2.cydeo.com/login.html ");

       // 3. Enter username: “incorrect@email.com”
WebElement userNameInput = driver.findElement(By.className("form-control"));// input window located by className, this is ossible here, because class nsme value appirse first time in that web element
userNameInput.sendKeys("incorrect@email.com"); // send incorrect username

        //4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword")); // input window located by id
        passwordInput.sendKeys("incorrect password"); // send incorrect password + use Key.Enter to press login button

        //5. Find and click on signing button
        WebElement signButton = driver.findElement(By.tagName("button"));// located by tagName locator
        signButton.click(); // click on found button // insted we can use +Key.ENTER in PASSWORD step 4

       // 5. Verify: visually “Sorry, Wrong Email or Password”
// do non need code here
       // displayed



    }
}
