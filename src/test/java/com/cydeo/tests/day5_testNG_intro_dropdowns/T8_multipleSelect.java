package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_multipleSelect {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dropdown_task8(){
//3. Select all the options from multiple select dropdown.

        Select multipleSelect=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

                java.util.List<WebElement>allOpti0ns=multipleSelect.getOptions();

        for(WebElement each: allOpti0ns){
            each.click();

            System.out.println("all selected values= "+each.getText());
        }
        multipleSelect.deselectAll();
    }
}
//TC #8: Selecting value from multiple select dropdown

//4. Print out all selected values.
//5. Deselect all values.
//
