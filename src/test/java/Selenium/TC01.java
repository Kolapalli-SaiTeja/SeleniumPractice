package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 {

//    **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**
//
//1. Open the URL app.vwo.com/#/login](https://app.vwo.com/#/login)
//2. **Find the Email id** and enter the email as admin@admin.com
//3. **Find the pass inputbox** and enter passwrod as admin.
//4. Find and Click on the submit button

//5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//<input type="email"
// class="text-input W(100%)"
// name="username"
// id="login-username"
// data-qa="hocewoqisi">


    @Test
public void tc01Negative(){


WebDriver driver = new EdgeDriver();

driver.get("https://app.vwo.com/#/login");


WebElement EmailInputBox = driver.findElement(By.id("login-username"));

EmailInputBox.sendKeys("admin@admin.com");

//<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
        WebElement PasswordBox = driver.findElement(By.name("password"));

        PasswordBox.sendKeys("admin");

//<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica"

            WebElement submitbox = driver.findElement(By.id("js-login-btn"));

            submitbox.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//<div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebElement errorBox = driver.findElement(By.className("notification-box-description"));

        String ErrorMsg = errorBox.getText();


        Assert.assertEquals(ErrorMsg, "Your email, password, IP address or location did not match");


        driver.quit();




}
}
