package HandlingofAutosugestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_Sample1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iphone");
        Thread.sleep(3000);

       // List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));

        List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li//div[@class='wM6W7d']"));

        System.out.println(alloption.size());



        for (WebElement s1:alloption)
        {
            System.out.println(s1.getText());

        }
    }
}
