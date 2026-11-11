package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Ex4_LeftClickOnElement
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions act=new Actions(driver);
        act.moveToElement(login).perform();


        WebElement giftcard = driver.findElement(By.xpath("//a[@title='Gift Cards']"));
//        act.moveToElement(giftcard).perform();
//        act.click();

        act.moveToElement(giftcard).click().perform();

    }
}
