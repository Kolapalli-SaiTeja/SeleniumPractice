package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebtTable_3 {


    @Test
    public void webtable() throws InterruptedException {


            WebDriver driver = new EdgeDriver();

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        WebElement element= driver.findElement(By.xpath("//input[@placeholder='Username']"));
//
//        element.sendKeys("Admin");

//        WebElement element1= driver.findElement(By.xpath("//*[@name='password']"));
//
//        element1.sendKeys("admin123");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).sendKeys("Admin");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("admin123");



        WebElement element2= driver.findElement(By.xpath("//button[@type='submit']"));

        element2.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href ='/web/index.php/pim/viewPimModule']"))).click();


       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);


//        List <WebElement> checkboxes = driver.findElements(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
//
//
////      WebElement h1=  checkboxes.get(1);
////        h1.click();
//
//        for (WebElement checkbox : checkboxes){
//
//            if (!checkbox.isSelected()){
//
//
//                checkbox.click();
//            }
//
//        }
//
     


      int row = driver.findElements(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div")).size();

      int col = driver.findElements(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div")).size();


        System.out.println(row);
        System.out.println(col);


        //   //*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[2]


        String firstPath = "//div[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[";

        String secondPath = "]/div/div[";

        String thirdPath = "]";


        for (int i =1; i<=row; i++){

            for (int j=1; j<=col; j++){


            String dynamic = firstPath+i+secondPath+j+thirdPath;

           String text =  driver.findElement(By.xpath(dynamic)).getText();

                System.out.println(text + " ");

            }

        }

















    }
}
