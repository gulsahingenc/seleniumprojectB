package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_SelectingValue {



    //TC #7: Selecting value from non-select dropdown
    //1. Open Chrome browser
    //3. Click to non-select dropdown
    //4. Select Facebook from dropdown
    //5. Verify title is “Facebook - Log In or Sign Up”

     WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


    }

    @Test
    public void iframeTest() throws InterruptedException {
        //3. Click to non-select dropdown

        Thread.sleep(200);
        WebElement selectAWebSiteDropDown=driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        selectAWebSiteDropDown.click();

        //4. Select Facebook from dropdown

        WebElement selectBrowser=driver.findElement(By.xpath("//a[.='Facebook']"));
        selectBrowser.click();

        Thread.sleep(4000);
        WebElement facebookAcceptLink=driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']"));
        facebookAcceptLink.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle="Facebook – log in or sign up";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);


    }




}
//5. Verify title is “Facebook - Log In or Sign Up”
//