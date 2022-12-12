package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
    @FindBy(css = "input[name='username']")
    WebElement username;

    @FindBy(css = "input[name='password']")
    WebElement password;

    @FindBy(xpath = "//button[text()=' Sign in ']")
    WebElement loginSignInButton;


}
