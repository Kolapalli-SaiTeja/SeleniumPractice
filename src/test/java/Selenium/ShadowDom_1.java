package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ShadowDom_1 {


    @Test
    public void testPositive() throws InterruptedException {


        WebDriver driver = new EdgeDriver();

        driver.get("https://shop.polymer-project.org/");


        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement element = (WebElement) js.executeScript("return document.querySelector('[page= \\'home\\']').shadowRoot.querySelector('[name=\\'home\\']').shadowRoot.querySelector('[aria-label]')");


        element.click();


        Thread.sleep(3000);


    }

}
