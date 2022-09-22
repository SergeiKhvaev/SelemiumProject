package com.cydeo.test.day1_navigation_basic.navigator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();// static method, called by class name WebDriverMAnager
        WebDriver driver = new ChromeDriver(); // polimorphism here/ created dtiver Object of ChromeDriver class, new CromeDriver -> our class constractor

        // first navigate method -> loading wed URL (page) in browser
        driver.get("https://www.google.com");


    }
}
