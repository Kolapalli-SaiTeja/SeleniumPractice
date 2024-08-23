package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SVG_Map_Proj {


    EdgeDriver driver;


    @Test
    public void testPositive() throws InterruptedException {

        driver = new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");


        List<WebElement> Searchedtitles = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));


        for (WebElement TITLES : Searchedtitles){

            String fillColor   =  TITLES.getAttribute("stroke"); // get attribute practice


            System.out.println(fillColor);

                break;

            }


//        for (WebElement TITLES : Searchedtitles) {
//
//            if (TITLES.getAttribute("aria-label").contains("Manipur")) {
//
//
//                TITLES.click();
//
//                break;
//            }
//        }

        Thread.sleep(3000);

    }

}

