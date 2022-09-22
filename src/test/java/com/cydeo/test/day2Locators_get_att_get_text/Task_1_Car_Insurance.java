package com.cydeo.test.day2Locators_get_att_get_text;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_Car_Insurance {
    public static void main(String[] args) {
        /*
1. Open Chrome browser
2. Go to
https://www.qa1.excelsoirinsurance.com/login
3. Verify URL contains
     Expected: "excelsoirinsurance"
4. Verify title:
       Expected: "Login | Excelsoir Insurance"

CarInsuranceAppVerification
         */


        //0. check step by step manually

//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

 // 2. Go to
        //https://www.qa1.excelsoirinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login ");
        driver.manage().window().maximize();

       // 3. Verify URL contains
       // Expected: "excelsoirinsurance"
        String expectedURL = "excelsoirinsurance";// comes from req
        String actualURL = driver.getCurrentUrl();// comes from browser
        if(actualURL.contains(expectedURL)){
            System.out.println("URL PASSED");
        }else {
            System.out.println("URL NOT PASSED");
        }
//4. Verify title:
//       Expected: "Login | Excelsoir Insurance"
        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("TITLE PASSED");
        }else {
            System.out.println("TITLE FAILED");
        }

        driver.quit();

    }
}
