package com.cydeo.test.day1_navigation_basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Sergei Khvalev"+ Keys.ENTER);
        driver.close();



    }
}
