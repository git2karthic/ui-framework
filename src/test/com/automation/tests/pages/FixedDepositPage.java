package com.automation.tests.pages;

import com.automation.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FixedDepositPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//input[@id='edulonvalue_1']")
    private WebElement edit_InvestmentAmount;
    @FindBy(how = How.XPATH, using = "//input[@id='edulonvalue_2']")
    private WebElement edit_InvestmentPeriod;
    @FindBy(how = How.XPATH, using = "//input[@id='edulonvalue_3']")
    private WebElement edit_rateOfReturn;
    @FindBy(how = How.XPATH, using = "//input[@id='edulonvalue_4']")
    private WebElement edit_taxRate;
    @FindBy(how = How.XPATH, using = "//a[@class='btn_common MR15']")
    private WebElement btn_Submit;

    public void CalculateFixedDepositInterest(int investmentAmount,
                                              int investmentPeriod,
                                              int rateOfReturn,
                                              int taxRate){
        edit_InvestmentAmount.clear();
        edit_InvestmentAmount.sendKeys(String.valueOf(investmentAmount));
        edit_InvestmentPeriod.clear();
        edit_InvestmentPeriod.sendKeys(String.valueOf(investmentPeriod));
        edit_rateOfReturn.sendKeys(String.valueOf(rateOfReturn));
        edit_taxRate.sendKeys(String.valueOf(taxRate));
        btn_Submit.click();

    }
}
