package POM_WithPageFactory_DesignePattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab_loginTest
{
    private static final Logger log = LogManager.getLogger(SauceLab_loginTest.class);

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        SauceLabLoginPage login=new SauceLabLoginPage(driver);
        login.EnterUN("standard_user");
        Thread.sleep(2000);
        login.EnterPwd("secret_sauce");
        Thread.sleep(2000);
        login.ClickLogin();

        SauceLab_HomePage home=new SauceLab_HomePage(driver);
        String acttext = home.getlogotext();
        String exptext="Swag Labs";

        if (acttext.equalsIgnoreCase(exptext))
        {
            System.out.println("TC pass");
        }
        else
        {
            System.out.println("TC fail");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
