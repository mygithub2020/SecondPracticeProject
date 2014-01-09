import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharma on 1/9/14.
 */
public class Base
{
    public static WebDriver driver = null;
    @BeforeClass
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void clickByXpath(String locator)
    {
        driver.findElement(By.xpath(locator)).click();
    }
    public void typeByXpath(String locator, String value)
    {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

}
