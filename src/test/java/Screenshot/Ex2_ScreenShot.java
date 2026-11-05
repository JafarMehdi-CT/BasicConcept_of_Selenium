package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex2_ScreenShot
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();


        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.xpath("//div[@class='grid-formation grid-column-6']"));

        File src = logo.getScreenshotAs(OutputType.FILE);
        File dist=new File("D:\\IT PROFESSIONAL\\Velocity 29th NOV 2025\\Selenium\\ScreenShot\\image2.png");
        FileHandler.copy(src,dist);

        driver.close();

    }
}
