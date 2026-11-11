package HandlingofMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_getSizeOfAlllLinksFromFacebookWebpage
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        List<WebElement> alllink = driver.findElements(By.xpath("//a"));
        int link = alllink.size();
        System.out.println(link);

    }
}
