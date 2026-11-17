package POM_WithPageFactory_DesignePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLab_HomePage
{
    @FindBy(xpath = "//div[text()='Swag Labs']") private WebElement LogoText;

    public SauceLab_HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public String getlogotext()
    {
        String actText = LogoText.getText();
        return actText;
    }
}
