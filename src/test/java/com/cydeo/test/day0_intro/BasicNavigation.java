package com.cydeo.test.day0_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

      //1. driver.get("https://www.google.com"); // open given URL, but it is shorter then navigate().to("URL");

       driver.navigate().to("https://www.google.com");// open given URL

        //2. navigate back - close web page in browser, which was open in driver.navigate().to("URL")
     driver.navigate().back();


        //3. navigate forward - open same page (as URL in navigate().to() again
        driver.navigate().forward(); //

        //4. navigate refresh - refresh opened page before
        driver.navigate().refresh();




    }
}
