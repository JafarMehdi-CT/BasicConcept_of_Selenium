package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_getDataFromStaticTable
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[3]")).getText();
        System.out.println(text);

    }
}
