package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FacebookTitle {

    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath(("//button[@title='Allow essential and optional cookies']"))).click();

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }


    }
}
