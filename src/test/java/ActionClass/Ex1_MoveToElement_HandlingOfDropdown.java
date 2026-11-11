package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Ex1_MoveToElement_HandlingOfDropdown
{
    public static void main(String[] args)
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Hovers']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement profile = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

        Actions act =new Actions(driver);
        act.moveToElement(profile).perform();

        driver.findElement(By.xpath("(//a[text()='View profile'])[3]")).click();


    }

}
