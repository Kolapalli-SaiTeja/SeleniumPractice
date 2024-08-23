package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ShadowDom_2 {


    @Test
    public void testPositive() throws InterruptedException {


        WebDriver driver = new EdgeDriver();

        driver.get("https://shop.polymer-project.org/");

        //This Element is inside 2 nested shadow DOM.

        String cssSelectorForHost1 = "shop-app[page='home']";
        String cssSelectorForHost2 = ".iron-selected";

        Thread.sleep(1000);

        SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();

        Thread.sleep(1000);

        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();

        Thread.sleep(1000);

       WebElement fin= shadow1.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]"));

        fin.click();


        Thread.sleep(3000);


    }

}
