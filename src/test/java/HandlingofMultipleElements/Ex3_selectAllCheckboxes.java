package HandlingofMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_selectAllCheckboxes
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> alldays = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));
        for (WebElement day:alldays)
        {
            day.click();
            Thread.sleep(2000);
        }

    }
}
