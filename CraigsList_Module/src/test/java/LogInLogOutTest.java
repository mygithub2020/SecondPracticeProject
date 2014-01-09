import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Sharma on 1/9/14.
 */
public class LogInLogOutTest extends CraigsBaseFunctions
{
    @BeforeClass(dependsOnMethods = {"setUp"})
    private void go_to_Website()
    {
        //Base.driver.navigate().to(siteUrl);
        driver.navigate().to(siteUrl);
    }

    @Test
    public void logIn_Test()
    {

        clickByXpath(CraigsBaseFunctions.myAccount_Link);
        typeByXpath(CraigsBaseFunctions.emailInput_Box, emailLogIn);
        typeByXpath(CraigsBaseFunctions.passwordInput_Box, pswd);
        clickByXpath(CraigsBaseFunctions.logIn_Button);
        String displayed_User_Name = driver.findElement(By.xpath(CraigsBaseFunctions.username_top_Link)).getText();
        // Assert.assertEquals(displayed_User_Name, "home of " + emailLogIn);

        clickByXpath(CraigsBaseFunctions.logOut_Link);
        //String displayed_Logout_Text = driver.findElement(By.xpath(CraigsBaseFunctions.logged_Out_Display)).getText();
        // Assert.assertEquals(displayed_Logout_Text, "craigslist: Account Log In");

        driver.quit();

    }


}
