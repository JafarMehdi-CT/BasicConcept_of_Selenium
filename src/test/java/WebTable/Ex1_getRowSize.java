package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Ex1_getRowSize
{
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> Row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int RowSize = Row.size();
        System.out.println(RowSize);



    }
}
