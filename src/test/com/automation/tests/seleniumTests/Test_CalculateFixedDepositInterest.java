package com.automation.tests.seleniumTests;

import com.automation.framework.base.BrowserType;
import com.automation.framework.base.DriverContext;
import com.automation.framework.base.FrameworkInitialize;
import com.automation.tests.pages.HomePage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Test_CalculateFixedDepositInterest extends FrameworkInitialize {

    @BeforeSuite
    public void Initialize(){
        InitializeBrowser(BrowserType.Chrome);
        DriverContext.BROWSER.GoTo("https://www.moneycontrol.com");
        DriverContext.BROWSER.Maximize();
    }

    @Test
    public void CalculateFixedDepositInterest(){
        CURRENT_PAGE = GetInstance(HomePage.class);
        CURRENT_PAGE = CURRENT_PAGE.As(HomePage.class).NavigateToFixedDepositPage();

    }

}
