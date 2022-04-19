package com.automation.framework.base;

public class BasePage extends Base {

    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance){
        try{
            return (TPage) this;
        }catch (Exception ex){
            ex.getStackTrace();
        }

        return null;
    }
}
