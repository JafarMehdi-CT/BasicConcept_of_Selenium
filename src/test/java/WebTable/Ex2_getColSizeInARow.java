package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_getColSizeInARow
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> Col = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
        int colsize = Col.size();
        System.out.println(colsize);

    }
}
