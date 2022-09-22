package com.cydeo.test.day1_navigation_basic.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();




        //navigate to page
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

     // WebElement element = driver.findElement(By.id("SIvCob"));

    // String valueOfAtt = element.getAttribute("value");

     // checking - Сервисы Google доступны на этих языках:

     //if(valueOfAtt.equals("Сервисы Google доступны на этих языках:  ")){
     //    System.out.println("Test is PASSED");
    // }else {
        // System.out.println("Test is FAILED");
    // }

driver.close();



    }
}
