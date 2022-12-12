package testcases;

import common.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogInTestCase1 extends BaseClass
{
    @Test
    public void verifyLogin()
    {
     init();
     title();
    }
    public void init()
    {
        PageFactory.initElements(driver,LoginPage.class);
        LoginPage.username.sendKeys(prop.getProperty("username"));
        LoginPage.password.sendKeys(prop.getProperty("password"));
        LoginPage.loginSignInButton.click();

    }
    public void title()
    {
        System.out.println(driver.getTitle());
    }


}
