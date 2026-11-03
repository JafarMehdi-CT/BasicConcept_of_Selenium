package WebDriverMethod;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_getCurrentUrl
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
        @Nullable String Url = driver.getCurrentUrl();
        System.out.println(Url);

        driver.close();

    }
}
