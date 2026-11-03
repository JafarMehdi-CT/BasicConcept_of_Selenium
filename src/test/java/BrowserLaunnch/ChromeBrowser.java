package BrowserLaunnch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser
{
    public static void main(String[] args)
    {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");

//        Thread.sleep(5000);
//
//        FirefoxDriver driver1 = new FirefoxDriver();
//        driver1.get("www.facebook.com");
    }
}
