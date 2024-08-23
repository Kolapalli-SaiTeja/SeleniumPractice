package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class LinkText_PartialLinkText {


    @Test
    public void ltPt(){


        WebDriver driver = new EdgeDriver();


        driver.get("https://app.vwo.com/#/login");

       //WebElement anchortag=driver.findElement(By.linkText("Start a free trial"));

       // WebElement PartialLink_tag=driver.findElement(By.partialLinkText("free trial"));

        List<WebElement> anchor_list= driver.findElements(By.tagName("a"));

        System.out.println( anchor_list.size());


       // anchor_list.get(1).click(); /// Doubt tukaram


        Iterator<WebElement> i = anchor_list.iterator();

        while (i.hasNext()){
            System.out.println(i.next().getText());
        }


        driver.quit();





    }
}
