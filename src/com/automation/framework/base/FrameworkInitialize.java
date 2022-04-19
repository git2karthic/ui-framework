package com.automation.framework.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FrameworkInitialize extends Base{

    public void InitializeBrowser(BrowserType browserType){
        WebDriver driver = null;
        switch (browserType){
            case Edge:
            case Firefox:
            case IE:
                break;
            case Chrome:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        DriverContext.DRIVER = driver;
        DriverContext.BROWSER = new Browser(driver);

    }

}
