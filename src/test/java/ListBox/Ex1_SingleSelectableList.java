package ListBox;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Ex1_SingleSelectableList
{
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select s= new Select(element);
        s.selectByVisibleText("Option1");
        Thread.sleep(2000);
        s.selectByValue("option2");
        Thread.sleep(2000);
        s.selectByIndex(3);

        //to check list is multiple or not
        boolean s1 = s.isMultiple();
        System.out.println(s1);

        //TakeScreenshot code
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dist= new File("D:\\IT PROFESSIONAL\\Velocity 29th NOV 2025\\Selenium\\ScreenShot\\image1.png");
        FileHandler.copy(src,dist);



        //get firsttext of single selectable from list box
        WebElement result = s.getFirstSelectedOption();
        String r = result.getText();
        System.out.println(r);
        driver.close();

    }

}
