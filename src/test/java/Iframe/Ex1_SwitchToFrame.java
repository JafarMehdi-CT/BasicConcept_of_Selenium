package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchToFrame
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='iFrame']")).click();

        //switch to frame
        driver.switchTo().frame("mce_0_ifr");

        //switch to frame
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));



        String text = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();

        System.out.println(text);
        Thread.sleep(3000);
        driver.close();
    }
}
