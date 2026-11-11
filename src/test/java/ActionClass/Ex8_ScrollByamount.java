package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex8_ScrollByamount
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
        Thread.sleep(4000);


        Actions act= new Actions(driver);

        //to scroll down and ups
        act.scrollByAmount(0,600).perform();
        Thread.sleep(3000);

        act.scrollByAmount(0 ,-200).perform();

        driver.close();


    }
}
