package com.cydeo.test.day0_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1. need setup web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. create instance of chrome driver

        WebDriver driver = new ChromeDriver(); // created webdriver instance

        // 3. test if our driver is working. We do it by instance driver + get() method

        driver.get("https://www.google.com");

    }
}
