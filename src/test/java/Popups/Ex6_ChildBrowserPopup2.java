package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex6_ChildBrowserPopup2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //click on new tab from main web page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(2000);

        // to get child window id
        Set<String> allids = driver.getWindowHandles();
        ArrayList<String> al= new ArrayList<>(allids);

        // switch to childwindow
        driver.switchTo().window(al.get(1));

        //click on Training link from child window
        driver.findElement(By.xpath("//span[text()='Training']")).click();

        //switch to main page
        driver.switchTo().window(al.get(0));
        Thread.sleep(5000);

        //click on newWindow link from main page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
