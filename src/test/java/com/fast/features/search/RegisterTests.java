package com.fast.features.search;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.Session;

/**
 * Created by cosminciocan on 11/12/2017.
 */
@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerUser(){
        registerSteps.setUserName("AAA");
    }
}
