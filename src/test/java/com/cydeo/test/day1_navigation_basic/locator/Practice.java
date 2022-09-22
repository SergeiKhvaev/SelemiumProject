package com.cydeo.test.day1_navigation_basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        //Test case: check invalid username or password// First of all manual testing!!!

        // enter username provider:abcd

        WebElement userName = driver.findElement(By.id("prependedInput")); // find username input

        userName.sendKeys("abcd"); // enter username "abcd"


        //Enter password provided: abcd
        WebElement password = driver.findElement(By.id("prependedInput2"));// find password input
        password.sendKeys("abcd"); // enter username "abcd"

        //Click on Login button
        WebElement logInButton = driver.findElement(By.id("_submit")); // find login button
        logInButton.click(); // to push login button just use click method


        // Verify the message "Invalid user name or password."

        WebElement alertMessage = driver.findElement(By.className("alert"));

        if(alertMessage.getText().equals("Invalid user name or password.")){ // need compare two strings (getText() + equals) to verify message
            System.out.println("Message is PASSED");
        }else {
            System.out.println("Message is FAILED");
        }

        //verify URL contains "vytrack"
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains("vytrack")){
            System.out.println("URL is PASSED");
        }else {
            System.out.println("URL is FAILD");
        }

        // click "Forgot your password?" link

        driver.findElement(By.partialLinkText("Forgot ")).click(); // found <a> anchor tag, if it hase contain message we can use partialLinkText + click() to click on link

        // verify title is "Forgot Password"

        if(driver.getTitle().equals("Forgot Password")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is NOT CORRECT");
        }

        driver.quit();
    }
}
