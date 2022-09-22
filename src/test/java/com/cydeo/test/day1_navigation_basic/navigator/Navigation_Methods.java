package com.cydeo.test.day1_navigation_basic.navigator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {
    public static void main(String[] args) throws InterruptedException{

        // set up web driver manager
        WebDriverManager.chromedriver().setup();

        // openning empty browser with creating inctance driver // create  driver for browser
        WebDriver driver = new ChromeDriver(); // creatre session ID as well

        // put maximize window here. so when browser window will opened it will bi miximized
        driver.manage().window().maximize();

        // navigate to certain page

        driver.navigate().to("https://www.tesla.com");

        // navigate back, take us to previece page

        System.out.println("Title of page =" + driver.getTitle()); // get Title of page// return String
        String currentTitle = driver.getTitle(); // we can keep our title in string
        System.out.println("Title of page = " + currentTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current page URL" + currentURL);

        Thread.sleep(3000); // that method come fron JAVA, NOT FROM SELENIUM

        driver.navigate().back(); // in our situation it will back to empty browser


        Thread.sleep(3000);


        // navigate forward -> navigato to

        driver.navigate().forward();

        Thread.sleep(3000);


        // refresh page
        driver.navigate().refresh();



        driver.navigate().to("https://www.google.com");

        // get title of the page
        System.out.println("Title of page =" + driver.getTitle()); // get Title of page// return String
         currentTitle = driver.getTitle(); // we can keep our title in string
        System.out.println("Title of page = " + currentTitle);

        // get current URL

         currentURL = driver.getCurrentUrl();
        System.out.println("Current page URL" + currentURL);


        // close current page
        driver.close(); // BUT driver.quit() -  all open pages, if we use that method it will kill session ID, and we can use that session again, need create new session (new driver object)
        //driver.quit(); if we use that method it will kill session ID, and we can use that session again, need create new session (new driver object)



        // getTitle() - get title of Web page in String

        //getCurrentURL() - get URL of current page, return String

        // driver.manage().window().maximize() - maximize window


    }
}
