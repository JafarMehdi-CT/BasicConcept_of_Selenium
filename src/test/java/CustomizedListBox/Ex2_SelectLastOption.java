package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_SelectLastOption
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/ ");
        driver.findElement(By.xpath("//span[text()='Create new account']")).click();
        Thread.sleep(3000);

        Actions act=new Actions(driver);
        WebElement month = driver.findElement(By.xpath("//span[text()='Month']"));
        act.click(month).perform();
        for (int i=1;i<=12;i++)
        {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(2000);

        }
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        driver.close();
    }
}
