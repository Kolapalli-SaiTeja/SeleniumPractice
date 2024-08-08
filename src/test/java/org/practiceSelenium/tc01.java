package org.practiceSelenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class tc01{


@Test
@Description("Verify title of the Google Website")
    public void google(){


   WebDriver driver = new ChromeDriver();


    driver.get("https://www.google.com/");
    System.out.println(driver.getTitle());

    }
}
