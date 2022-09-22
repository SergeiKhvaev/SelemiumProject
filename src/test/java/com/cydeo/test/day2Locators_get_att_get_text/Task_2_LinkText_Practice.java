package com.cydeo.test.day2Locators_get_att_get_text;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2_LinkText_Practice {
    public static void main(String[] args) {
         /*
    1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
     */


//    1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

   //   2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com");
        driver.manage().window().maximize();

        //3- Click to A/B Testing from top of the list.
        WebElement link = driver.findElement(By.linkText("A/B Testing"));// located element - link first by linkText locator

        link.click(); // then click()

      //  4- Verify title is:
      //  Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("TITLE PASSED");
        }else {
            System.out.println("TITLE NOT PASSED");
        }

        //5- Go back to home page by using the .back();

        driver.navigate().back();// navigate method


        //6- Verify title equals:
        //  Expected: Practice

         expectedTitle = "Practice";
         actualTitle = driver.getTitle();

         if(actualTitle.equals(expectedTitle)){
             System.out.println("Practice page TITLE PASSED");
         } else {
             System.out.println("Practice page TITLE NOT PASSED");
         }

         driver.quit();

    }
}
