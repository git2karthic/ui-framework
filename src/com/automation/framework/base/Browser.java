package com.automation.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {
    public WebDriver _driver;

    public Browser(WebDriver _driver) {
        this._driver = _driver;
    }

    public void GoTo(String URL){
        _driver.navigate().to(URL);
    }

    public void Maximize(){
        _driver.manage().window().maximize();
    }
}
