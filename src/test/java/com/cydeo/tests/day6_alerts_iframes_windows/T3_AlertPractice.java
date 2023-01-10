package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_AlertPractice {
    //TC #3: Information alert practice
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }

    @Test
    public void alert_test3() throws InterruptedException {

        //3. Click to “Click for JS Prompt” button
       WebElement JSPrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

       JSPrompt.click();
       Thread.sleep(2000);

        //4. Send “hello” text to alert
        Alert alert=driver.switchTo().alert();
      alert.sendKeys("hello");

//5. Click to OK button from the alert
        alert.accept();

//6. Verify “You entered:  hello” text is displayed.
        WebElement result= driver.findElement(By.xpath("//p[text()='You entered: hello']"));

        String expectedText="You entered: hello";
        String actualText=result.getText();

        Assert.assertEquals(actualText,expectedText,"Actual result is not as expected!!");
    }

}

