package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Mini2 {


    EdgeDriver driver;


    @BeforeMethod
    public void before() {

        EdgeOptions driver1 = new EdgeOptions();

        driver1.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new EdgeDriver(driver1);
    }


    @Test
    public void testPositive() throws InterruptedException {


        driver.get("https://www.amazon.in/");
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("mac mini");

        //<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">
        WebElement Button = driver.findElement(By.id("nav-search-submit-button"));

        Button.click();

        Thread.sleep(3000);

        List<WebElement> Searchedtitles = driver.findElements(By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']"));


        for (WebElement Titles : Searchedtitles) {

            System.out.println(Titles.getText());

        }

    }

    @AfterMethod
    public void closing() {

        driver.quit();


    }


}
