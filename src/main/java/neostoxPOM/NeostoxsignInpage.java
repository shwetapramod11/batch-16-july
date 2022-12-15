package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;




public class NeostoxsignInpage 
{
@FindBy(xpath = "(//a[text()='Sign In'])[1]")private WebElement signInbutton;
public NeostoxsignInpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickonsignInbutton(WebDriver driver)
{
Utilitynew.wait(driver,1000 );
Reporter.log("clicking on sign In button", true);
signInbutton.click();
}
}
