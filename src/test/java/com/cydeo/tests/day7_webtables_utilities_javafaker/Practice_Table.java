package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice_Table {


    WebDriver driver;
    @BeforeMethod

    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );

        //Go to : https://practice.cydeo.com/windows

    }

    @Test
    public void tableTest(){

        driver.get(" https://practice.cydeo.com/tables ");
        WebElement table= driver.findElement(By.xpath(" //table[@id='table1']/tbody//td[.='$50.00']/preceding-sibling::td[1]\n" +
                "\n "));

        System.out.println(table.getText());
    }
}
