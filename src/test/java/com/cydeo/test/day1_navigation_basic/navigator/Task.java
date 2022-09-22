package com.cydeo.test.day1_navigation_basic.navigator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {


        //1. set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // create session ID

        //2.maximize windod
        driver.manage().window().maximize();


        // BUT BEFORE CHECK TITLE MANUALLY
        //3. navigate to www.cydeo.com
        driver.get("https://www.cydeo.com");

        //4. het title
        String expectedTitle = "Cydeo";// came from our req (from US)
        String actuallTitle = driver.getTitle(); // came from driver
        System.out.println(actuallTitle);


        if(actuallTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
        } else {
            System.out.println("Title verification is FAILED");
        }
        driver.close(); // driver.quit();

    }
}
