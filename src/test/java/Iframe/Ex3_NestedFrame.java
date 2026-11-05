package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_NestedFrame
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

        //switch to parent frame
        driver.switchTo().frame("frame-top");

       //Switch to left frame
        driver.switchTo().frame("frame-left");

        String text = driver.findElement(By.tagName("body")).getText();
        System.out.println(text);

        // Return to parent frame
        driver.switchTo().parentFrame();

        // Switch to middle frame
        driver.switchTo().frame("frame-middle");

        String text1 = driver.findElement(By.id("content")).getText();
        System.out.println(text1);

        // Return to parent frame
        driver.switchTo().parentFrame();

        // Switch to right frame
        driver.switchTo().frame("frame-right");

        String text2 = driver.findElement(By.tagName("body")).getText();
        System.out.println(text2);

        // Return to main webpage
        driver.switchTo().defaultContent();

        driver.quit();




    }
}
