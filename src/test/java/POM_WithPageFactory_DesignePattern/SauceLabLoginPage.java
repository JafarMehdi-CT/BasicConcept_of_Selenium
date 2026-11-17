package POM_WithPageFactory_DesignePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabLoginPage
{
    @FindBy(xpath = "//input[@name='user-name']") private WebElement UN;
   @FindBy(xpath = "//input[@name='password']") private WebElement PWD;
    @FindBy(xpath = "//input[@name='login-button']") private WebElement LoginButton;

    public SauceLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void EnterUN(String username)
    {
        UN.sendKeys(username);
    }
    public void EnterPwd(String password)
    {
        PWD.sendKeys(password);
    }
    public void ClickLogin()
    {
        LoginButton.click();
    }
}
