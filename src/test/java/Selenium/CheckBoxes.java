package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {


    //  https://the-internet.herokuapp.com/checkboxes

    @Test
    public void checkboxes() throws InterruptedException {


        WebDriver driver = new EdgeDriver();


        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //input[@type = "checkbox"]

//        List<WebElement> element = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
//
//
//        WebElement h1 = element.get(0);
//
//        h1.click();
//
//        WebElement h2 = element.get(1);
//
//
//        // driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
//
//        h2.click();
//        h2.click();





        // Iterating through FOR loop

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // Iterate through the checkbox elements
        for (WebElement checkbox : checkboxes) {
            // Check the checkbox if it is not already checked
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        Thread.sleep(5000);


    }


}
