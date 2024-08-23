package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MiniProject {



@Test
    public void project() throws InterruptedException {


    WebDriver driver = new EdgeDriver();

    //<a id="btn-make-appointment"
    // href="./profile.php#login"
    // class="btn btn-dark btn-lg">
    // Make Appointment</a>

    driver.get("https://katalon-demo-cura.herokuapp.com/");
    driver.manage().window().fullscreen();


//    WebElement makeAppointment = driver.findElement(By.xpath("//a[@id ='btn-make-appointment']"));
//    WebElement element_ID = driver.findElement(By.className("btn btn-dark btn-lg"));
    WebElement element_Ltext = driver.findElement(By.linkText("Make Appointment"));

    element_Ltext.click();

    Thread.sleep(3000);

    Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");


    //<input type="text" class="form-control"
    // id="txt-username"
    // name="username"
    // placeholder="Username"
    // value=""
    // autocomplete="off">

    WebElement element_username = driver.findElement(By.name("username"));

    element_username.sendKeys("John Doe");

    //<input type="password" class="form-control" id="txt-password" name="password" placeholder="Password" value="" autocomplete="off">

    //WebElement element_Password = driver.findElement(By.id("txt-password"));

   List <WebElement> element_Password = driver.findElements(By.xpath("//input[@placeholder ='Password']"));

    element_Password.get(1).sendKeys("ThisIsNotAPassword");

    //button[@id ="btn-login"]

    WebElement Login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));

    Login_button.click();
    

    driver.quit();



    }



}
