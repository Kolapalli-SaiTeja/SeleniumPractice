package org.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class tc03_Adblock {



    @Test
    public void AddingAdBlock(){


        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addExtensions(new File("C:\\Users\\Lycan\\Downloads\\AdBlock.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);


        driver.get("https://www.youtube.com/");










    }

}
