package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Waits {



@Test
    public void project() throws InterruptedException {


    WebDriver driver = new EdgeDriver();

    //<a id="btn-make-appointment"
    // href="./profile.php#login"
    // class="btn btn-dark btn-lg">
    // Make Appointment</a>

    driver.get("https://katalon-demo-cura.herokuapp.com/");
    driver.manage().window().fullscreen();



    WebElement element_Ltext = driver.findElement(By.linkText("Make Appointment"));

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    element_Ltext.click();


    WebElement element_username = driver.findElement(By.name("username"));

    element_username.sendKeys("John Doe");


   List <WebElement> element_Password = driver.findElements(By.xpath("//input[@placeholder ='Password']"));

    element_Password.get(1).sendKeys("ThisIsNotAPassword");

    //button[@id ="btn-login"]

    WebElement Login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));

    Login_button.click();
    

    driver.quit();

    }





    @Test

    public void appvwo(){



    WebDriver driver = new ChromeDriver();


    driver.get("https://app.vwo.com/#/login");


    //id="login-username"

       WebElement element =  driver.findElement(By.xpath("//input[@id='login-username']"));

       element.sendKeys("john");

        //input[@id='login-password']

        WebElement element2  = driver.findElement(By.xpath("//input[@id='login-password']"));
                element2.sendKeys("awdawdwad");

         ////button[@id='js-login-btn']
        WebElement element3= driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        element3.click();



       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


       // implementing own logic
        Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {

               return webDriver.findElement(By.xpath("//div[@id='js-notification-box-msg']")).isDisplayed();

            }
        };


        wait.until(f);




     //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='js-notification-box-msg']")));



        //Fluent wait


        wait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10));







































    }



}
