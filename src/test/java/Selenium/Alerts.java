package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {


    // JS Alert
    @Test
    public void alerts() {


        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement element = driver.findElement(By.xpath("//button[@onclick= 'jsAlert()']"));

        element.click();


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        wait.until(ExpectedConditions.alertIsPresent());


        Alert alert = driver.switchTo().alert();

        alert.accept();


        String text = driver.findElement(By.id("result")).getText();


        Assert.assertEquals(text, "You successfully clicked an alert");


        driver.quit();
    }


    @Test
    public void confirmationAlert() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement element = driver.findElement(By.xpath("//button[@onclick= 'jsConfirm()']"));

        element.click();


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


        wait.until(ExpectedConditions.alertIsPresent());


        Alert alert = driver.switchTo().alert();


        alert.accept();
        //alert.dismiss();

        String text = driver.findElement(By.id("result")).getText();


        System.out.println(text);

        Assert.assertEquals(text, "You clicked: Ok");


        driver.quit();

    }

@Test
    public void JSPrompt(){

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement element = driver.findElement(By.xpath("//button[@onclick= 'jsPrompt()']"));

        element.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.sendKeys("Rama");

        alert.accept();


        String text = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(text, "You entered: Rama");

    }





}
