package HandlingofAutosugestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex3_DynamicElement
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();


        //pass the text in text field
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("iphone 17");
        Thread.sleep(2000);

        //click on submit search button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);


        String rating = driver.findElement(By.xpath("((//div[@class='ZFwe0M row'])[1]//span)[4]")).getText();
        System.out.println(rating);

        String review = driver.findElement(By.xpath("((//div[@class='ZFwe0M row'])[1]//span)[6]")).getText();
        System.out.println(review);

    }
}
