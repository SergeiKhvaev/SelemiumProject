package com.cydeo.test.day0_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitBrowser  {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //
        driver.get("https://practice.cydeo.com/open_new_tab");
       // driver.get("https://www.google.com");

        // wait 5 sec
        Thread.sleep(5000);


        // closing any current opened tab
       driver.close();

       // driver.quit();





    }
}
