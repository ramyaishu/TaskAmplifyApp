package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TaskPage;

public class TaskTest
{
    WebDriver driver;
    TaskPage taskPage = new TaskPage();

    @Test
    public void taskEntry() throws InterruptedException {
        PageFactory.initElements(driver,TaskPage.class);
        taskPage.enterTaskDetails("Selenium","It's Automation Tool","12/03/2022");
        WebElement titleText = driver.findElement(By.xpath("//h5[text()='Selenium']"));
        String s = titleText.getText();
        Assert.assertEquals(s,"Selenium");
    }

}
