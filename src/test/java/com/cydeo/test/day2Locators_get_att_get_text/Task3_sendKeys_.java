package com.cydeo.test.day2Locators_get_att_get_text;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_sendKeys_ {
    public static void main(String[] args) {
        /*1- Open a chrome browser
2- Go to: https://google.com/
3- Write УappleФ in search box
4- use Keys.ENTER to start search
5- Verify title:
Expected: Title should start with УappleФ word
         */

        
        //SCRIPT IS CORRECT но вывод может быть неверный, т.к. на момент написани€ настройки ќ— выдавал browser in Russian
//              1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // 3- Write УappleФ in search box
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));// we found search box on google page

       // 3- Write УappleФ in search box
        //4- use Keys.ENTER to start search

        searchBox.sendKeys("apple" + Keys.ENTER); // Webdriver sent text to webelement (put text - "apple" in searchbox by sendKeys() method) + instead of click() method we use +Keys.Enter (equals ENTER button on keybord)


        //5- Verify title:
      //  Expected: Title should start with УappleФ word

        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();

        if(actualInTitle.startsWith(expectedInTitle)){ //startsWith() method should be used according with req
            System.out.println("TITLE is PASSED");
        }else {
            System.out.println("TITLE is NOT PASSED");
        }

        driver.quit();
    }
}
