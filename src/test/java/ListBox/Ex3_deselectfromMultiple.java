package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_deselectfromMultiple
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/welco/OneDrive/Desktop/Country.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
        Select s= new Select(element);
        s.selectByVisibleText("India");
        s.selectByIndex(2);
        s.selectByValue("aus");
        Thread.sleep(3000);
        s.deselectAll();
        Thread.sleep(3000);
        driver.close();

    }
}
