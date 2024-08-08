package org.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc02 {


    @Test
    public void TryingEdgeOptions(){





        WebDriver driver = new ChromeDriver();

        driver.get("https://www.netflix.com/browse");
        System.out.println( driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Netflix");

        driver.close();

    }


}
