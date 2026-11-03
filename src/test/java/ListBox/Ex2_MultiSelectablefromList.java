package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex2_MultiSelectablefromList
{
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/welco/OneDrive/Desktop/Country.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
        Select s= new Select(element);
        s.selectByVisibleText("India");
        s.selectByIndex(2);
        s.selectByValue("aus");


        // to get all text from multiselectlist
        List<WebElement> s1 = s.getAllSelectedOptions();

        for (WebElement address:s1)
        {
            System.out.println(address.getText());
        }

        // to check list is multiple
        boolean result = s.isMultiple();
        if (result)
        {
            System.out.println("list is multiple");
        }
        else
        {
            System.out.println("list is not multiple");
        }


    }
}
