package Selenium;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Actions_MakeMyTrip {

    @Test
    public void Actions() throws InterruptedException {


        WebDriver driver = new EdgeDriver();

        driver.get("https://www.makemytrip.com/");

        // WebElement element = driver.findElement(By.id("fromCity"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnit.SECONDS.toSeconds(6)));


        //span[@data-cy ='closeModal']
        Actions actions = new Actions(driver);

        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy ='closeModal']")));

        actions.moveToElement(element1).click();

        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fromCity']")));


        actions.moveToElement(element2).click().sendKeys("mumbai").build().perform();


        List<WebElement> element3 = driver.findElements(By.xpath("//ul[ @class=  'react-autosuggest__suggestions-list']/li"));


        for (WebElement list : element3) {

            if (list.getText().contains("Mumbai")) {


                list.click();

                break;

            }
        }

        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Search')]")));

        actions.moveToElement(element4).click().build().perform();

        driver.quit();

    }

}
