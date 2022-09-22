package com.cydeo.test.day0_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //driver.manage().window().maximize();

        // maximize() = fullscreen()

        driver.manage().window().fullscreen();

        driver.close();
    }
}
