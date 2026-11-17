package PageObjectModuel_ScriptDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_WithoutPOM_DesignPattern
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='login-button']")).click();
        Thread.sleep(2000);

        String actText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
        String expText="Swag Labs";

        if (actText.equalsIgnoreCase(expText))
        {
            System.out.println("Test case pass");
        }
        else
        {
            System.out.println("Test case fail");
        }
        Thread.sleep(3000);

        driver.quit();








    }
}
