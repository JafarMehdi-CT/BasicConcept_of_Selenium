package Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex1_ScreenShotCode
{
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dist= new File("D:\\IT PROFESSIONAL\\Velocity 29th NOV 2025\\Selenium\\ScreenShot\\image4.png");
        FileHandler.copy(src,dist);
    }
}
