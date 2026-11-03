package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SingleSelectableList
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select s= new Select(element);
        s.selectByVisibleText("Option1");
        Thread.sleep(2000);
        s.selectByValue("option2");
        Thread.sleep(2000);
        s.selectByIndex(3);

        //to check list is multiple or not
        boolean s1 = s.isMultiple();
        System.out.println(s1);


        //get firsttext of single selectable from list box
        WebElement result = s.getFirstSelectedOption();
        String r = result.getText();
        System.out.println(r);
        driver.close();

    }

}
