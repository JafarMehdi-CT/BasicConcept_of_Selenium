package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getSpecificDataFromDynamicTable
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//table[@id='taskTable']//tr/td[text()='Chrome']//following-sibling::td[contains(text(),'Mbps')]")).getText();
        System.out.println(text);
    }
}
