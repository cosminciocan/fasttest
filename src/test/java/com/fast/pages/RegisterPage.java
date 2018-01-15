package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

/**
 * Created by cosminciocan on 11/12/2017.
 */

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject{

//Some comment here


    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(className = "page-title")
    private WebElementFacade pageTitle;

    public void checkRegisterPage(){
        pageTitle.shouldContainText("CREATE N ACCOUNT");
    }


    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }


}
