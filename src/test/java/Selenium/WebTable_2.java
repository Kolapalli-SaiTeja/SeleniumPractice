package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTable_2 {



    @Test
    public void webtable() {

        WebDriver driver = new EdgeDriver();

        driver.get("https://awesomeqa.com/webtable1.html");


        int row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")).size();

        int col = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[1]/td")).size();


        String firstPath = "//table[@class='tsc_table_s13']/tbody/tr[";

        String secondPath = "]/td[";

        String thirdPath = "]";


        for (int i = 1; i <= row; i++) {


            for (int j = 1; j <= col; j++) {


                String dynamic = firstPath + i + secondPath + j + thirdPath;


             String data =   driver.findElement(By.xpath(dynamic)).getText();

                System.out.println(data + " " );


            }

        }


    }


}
