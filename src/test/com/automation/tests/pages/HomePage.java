package com.automation.tests.pages;

import com.automation.framework.base.BasePage;
import com.automation.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='PF']")
    private WebElement link_PF;
    @FindBy(how = How.XPATH, using = "//a[@title='Fixed Deposit Interest Calculator']")
    private WebElement link_fixedDepositInterestCalculator;

    public FixedDepositPage NavigateToFixedDepositPage(){
        Actions actions = new Actions(DriverContext.DRIVER);
        actions.moveToElement(link_PF).build().perform();
        link_fixedDepositInterestCalculator.click();
        return GetInstance(FixedDepositPage.class);
    }


}
