package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //xpath by attribute //tagname[@attributename='attribute value']

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abc");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
    }
}
