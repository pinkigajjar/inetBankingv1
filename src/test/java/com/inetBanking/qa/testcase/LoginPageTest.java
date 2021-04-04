package com.inetBanking.qa.testcase;

import com.inetBanking.qa.base.TestBase;
import com.inetBanking.qa.page.HomePage;
import com.inetBanking.qa.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();

    }

    @Test ()
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title,"Guru99 Bank Home Page");
    }
    @Test
    public void loginTest(){
        homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));


    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
