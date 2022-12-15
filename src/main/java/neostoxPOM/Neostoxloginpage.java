package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;





public class Neostoxloginpage 
{
@FindBy(id = "MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumfield;
@FindBy(xpath = "(//a[text()='Sign In'])[2]")private WebElement signInButton;
public Neostoxloginpage(WebDriver driver) 
{
PageFactory.initElements(driver, this);	
}
public void sendmobilenum(WebDriver driver, String mobnum)
{
	Utilitynew.wait(driver, 3000);
mobileNumfield.sendKeys(mobnum);
Reporter.log("entering mobile number", true);
}
public void clickonSignInbutton(WebDriver driver) 
{
	Utilitynew.wait(driver,3000 );
	signInButton.click();
	Reporter.log("clicking on sign in button", true);
}
}
