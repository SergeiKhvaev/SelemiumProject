package com.cydeo.test.day0_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String webTitle = driver.getTitle();

        System.out.println(webTitle);

        if(webTitle.equals("Google")){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        driver.close();
    }
}
