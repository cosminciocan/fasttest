package com.fast.steps.serenity;

import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by cosminciocan on 11/12/2017.
 */
public class RegisterSteps extends ScenarioSteps{

    RegisterPage registerPage;

    @Step
    public void setUserName(String name){
        registerPage.open();
        registerPage.checkRegisterPage();
        registerPage.setFirstNameField(name);
    }

}
