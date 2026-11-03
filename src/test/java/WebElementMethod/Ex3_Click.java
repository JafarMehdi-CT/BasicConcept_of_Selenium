package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_Click
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //approach 1
        driver.findElement(By.xpath("//input[@name='email'] ")).sendKeys("abc");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();
        driver.close();


    }
}
