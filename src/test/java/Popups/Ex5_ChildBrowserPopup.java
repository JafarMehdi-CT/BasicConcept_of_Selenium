package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex5_ChildBrowserPopup
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //click on new tab from main web page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(2000);


        // to get child window address
        Set<String> ids = driver.getWindowHandles();
        ArrayList<String> al =new ArrayList<>(ids);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        String childWindowId = al.get(1);

        // to switch child browser
        driver.switchTo().window(childWindowId);

        driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
