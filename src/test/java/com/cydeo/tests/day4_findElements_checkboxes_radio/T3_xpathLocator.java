package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_xpathLocator {
    public static void main(String[] args) {
        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons ");

        //3. Click on Button 1
        WebElement clickButton1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickButton1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        System.out.println("clickButton1.isDisplayed() = " + clickButton1.isDisplayed());
    }
}
