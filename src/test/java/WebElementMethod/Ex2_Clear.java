package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Clear
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //approach 1
//        driver.findElement(By.xpath("//input[@name='email'] ")).sendKeys("abc");

        //approach 2
        WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
        un.sendKeys("abcd");
        Thread.sleep(2000);
        un.clear();
        Thread.sleep(3000);

        un.sendKeys("efgh");
        Thread.sleep(3000);
        driver.close();


    }
}

