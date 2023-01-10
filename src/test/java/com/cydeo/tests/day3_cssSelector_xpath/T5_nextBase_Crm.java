package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class T5_nextBase_Crm {

    public static void main(String[] args) {

    //1- Open a chrome browser
       WebDriver driver= WebDriverFactory.getDriver("chrome");
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

              //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement userNameLoginBox= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameLoginBox.sendKeys("incorrect");


        //4- Click to `Reset password` button
        WebElement resetPassword= driver.findElement(By.xpath("//button[@class='login-btn']"));

        resetPassword.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement error= driver.findElement(By.xpath("//div[@class='errortext']"));
        String expected="Login or E-mail not found";
        String actual=error.getText();

        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(actual,expected);









    }


}
