package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_RightClickAction
{
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);
        act.contextClick().perform();

    }
}
