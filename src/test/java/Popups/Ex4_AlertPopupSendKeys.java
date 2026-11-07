package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_AlertPopupSendKeys
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        add.click();
        Thread.sleep(2000);
        Alert al = driver.switchTo().alert();
        al.sendKeys("Jafar is my Boss");
        Thread.sleep(2000);
        al.accept();
        driver.close();

    }
}
