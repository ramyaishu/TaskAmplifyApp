package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
    @FindBy(css = "input[name='username']")
    public static WebElement username;

    @FindBy(css = "input[name='password']")
    public  static WebElement password;

    @FindBy(xpath = "//button[text()=' Sign in ']")
    public static  WebElement loginSignInButton;


}
