package HandlingofMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getAllLinksFromFacebookWebpage
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        List<WebElement> alllinks = driver.findElements(By.xpath("//a"));

        for (WebElement link:alllinks)
        {
            String text = link.getText();
            System.out.println(text);
        }
    }
}
