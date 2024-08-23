package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SVG_Youtube {


    WebDriver driver;


    @Test
    public void testPositive() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        WebElement element = driver.findElement(By.xpath("//input[@id=\"search\"]"));

        element.sendKeys("blackMyth Wukong");


       List <WebElement> Button = driver.findElements(By.xpath("//*[name()='svg']/*[name()='path' and @clip-rule='evenodd']"));

//        Button.get(1).click();



      for (WebElement TITLES : Button){

          System.out.println(TITLES.getAttribute("clip-rule").contains("evenodd"));

          TITLES.click();

      }


    }


}
