package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage
{

    @FindBy(id = "taskTitleInput")
    WebElement taskTitle;

    @FindBy(id = "taskBodyInput")
    WebElement taskBody;

    @FindBy(id = "datepickerduedate")
    WebElement calenderIcon;

    @FindBy(xpath = "//button[text()=' Create task ']")
    WebElement buttonCreateTask;



    public void enterTaskDetails(String title,String body,String date) throws InterruptedException {
        taskTitle.sendKeys(title);
        Thread.sleep(1000);
        taskBody.sendKeys(body);
        Thread.sleep(1000);
        calenderIcon.sendKeys(date);
        Thread.sleep(1000);
        buttonCreateTask.click();
    }
}
