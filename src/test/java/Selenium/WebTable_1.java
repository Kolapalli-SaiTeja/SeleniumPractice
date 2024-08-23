package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTable_1 {
    @Test
    public void Webtable() {

        WebDriver driver = new EdgeDriver();
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();


        // Here we are getting row size
        ////table[@id = 'customers']/tbody/tr

        int row = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr")).size();


        int col = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[2]/td")).size();


        System.out.println(row);
        System.out.println(col);


        String firstPath = "//table[@id = 'customers']/tbody/tr[";


        String SecondPath = "]/td[";

        String thirdPath = "]";


        for (int i = 2; i <= row; i++) {


            for (int j = 1; j <= col; j++) {


                String dynamicPath = firstPath + i + SecondPath + j + thirdPath;

                String data = driver.findElement(By.xpath(dynamicPath)).getText();


                System.out.println(data + " ");


                if (data.equals("Helen Bennett")) {


                    System.out.println( i +":"+ j  );

                    break;

//                    String countryPath = dynamicPath + "/following-sibling::td";
//
//
//
//                    String Countrytext = driver.findElement(By.xpath(countryPath)).getText();
//
//                    System.out.println("------");
//                    System.out.println("Helen Bennett is In - " + Countrytext);


                }


            }


        }

        driver.quit();


    }


}
