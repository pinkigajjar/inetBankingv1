package com.inetBanking.qa.page;

import com.inetBanking.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{

    //PageFactory - Object
    @FindBy(name="uid")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="btnLogin")
    WebElement LoginBtn;

    // Initializing PAge object
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    // Actions
    public String validateLoginPageTitle(){
        return driver.getTitle();

    }

    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        LoginBtn.click();

        return new HomePage();


    }






}
