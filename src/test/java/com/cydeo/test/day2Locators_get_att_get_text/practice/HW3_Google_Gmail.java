package com.cydeo.test.day2Locators_get_att_get_text.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_Google_Gmail {
    public static void main(String[] args) {
        /*
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
         */
// Manual test passed successfully
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // open https:// www.google.com
        driver.get("https://www.google.com");
        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.className("gb_d"));// to find gmail button top rigth
        gmailButton.click();// click on gmail button

        // 4- Verify title contains:
        //Expected: Gmail
        String expectedTitleContains = "Gmail";
        String actualTitle = driver.getTitle();// to find title text

        if (actualTitle.contains(expectedTitleContains)) {
            System.out.println("TITLE contains Gmail");
        } else {
            System.out.println("TITLE NOT contains Gmail");
        }

        // 5- Go back to Google by using the .back();
        driver.navigate().back();// to command driver step on previse page

        // 6- Verify title equals
        //  Expected: Google
        String expectedTitle = "Google";
        String actuallTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle)) {
            System.out.println("TITLE VERIFICATION PASSED");
        } else {
            System.out.println("TITLE VERIFICATION NOT PASSED");
        }

        //close session
        driver.quit();
    }
}
