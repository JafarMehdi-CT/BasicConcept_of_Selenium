package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex4_getAllOptionFromList
{
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/welco/OneDrive/Desktop/Country.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
        Select s= new Select(element);
        List<WebElement> result = s.getOptions();

        System.out.println(result.size());

        for (WebElement text:result)
        {
            System.out.println(text.getText());

        }
    }
}
