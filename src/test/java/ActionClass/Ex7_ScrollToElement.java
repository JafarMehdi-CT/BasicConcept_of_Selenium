package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_ScrollToElement
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement cookies = driver.findElement(By.xpath("//a[text()='Cookies']"));
        Actions act=new Actions(driver);
        act.scrollToElement(cookies).perform();
        act.click(cookies).perform();



    }
}
