package com.cydeo.test.day1_navigation_basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesla.com");

        Thread.sleep(3000);

        //identify and save ""  element
       WebElement helpText = driver.findElement(By.className("pHiOh"));


        Thread.sleep(3000);

if(helpText.getText().equals("Условия")){
    System.out.println("Test PASSED");
} else {
    System.out.println("Test FAILED");
}

        // close the browser
        Thread.sleep(3000);

      driver.quit();


    }
}
