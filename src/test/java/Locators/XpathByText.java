package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //xpath by Text //tagname[text()='text value']
        driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
    }
}