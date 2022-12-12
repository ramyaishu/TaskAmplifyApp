package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass
{
    public  static WebDriver driver;
    public Properties prop;

    public Properties loadPropertyFile() throws IOException {
        FileInputStream file=new FileInputStream("config.properties");
        prop=new Properties();
        prop.load(file);
        return prop;
    }

    @BeforeSuite
    public void openBrowser() throws IOException {
        loadPropertyFile();
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        String url=prop.getProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }

}
