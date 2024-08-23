package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


import java.util.List;

public class SVG {


    EdgeDriver driver;


    @Test
    public void testPositive() throws InterruptedException {

        driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement element = driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]"));

        element.sendKeys("mac mini");


       List <WebElement> Button = driver.findElements(By.xpath("//*[name()='svg']"));

        Button.get(0).click();



      List<WebElement> Searchedtitles = driver.findElements(By.xpath("//*[@class=\"wjcEIp\"]"));


      for (WebElement TITLES : Searchedtitles){

          System.out.println(TITLES.getText());

      }


    }


}


//<a href="/mobile-accessories/power-banks/pr?sid=tyy,4mr,fu6&amp;otracker=categorytree&amp;otracker=nmenu_sub_Electronics_0_Power%20Banks&amp;fm=neo%2Fmerchandising&amp;iid=M_3f49f0b0-525c-4d67-b803-6a3a61eab755_1_372UD5BXDFYS_MC.SUDNEM7MT757&amp;otracker=hp_rich_navigation_10_1.navigationCard.RICH_NAVIGATION_Electronics~Powerbank_SUDNEM7MT757&amp;otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_10_L1_view-all&amp;cid=SUDNEM7MT757" class="_1BJVlg _11MZbx">Powerbank<span class="_3Pzn-c"></span></a>