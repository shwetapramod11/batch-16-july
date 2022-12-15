package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;





public class Neostoxpasswordpage
{
	@FindBy(id = "txt_accesspin") private WebElement passwordField;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement Submitbutton;
	public Neostoxpasswordpage (WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	
	}
	public void Enterpassword(WebDriver driver ,String pass) 
	{
		Utilitynew.wait(driver, 3000);
	passwordField.sendKeys(pass);
	Reporter.log("entering password", true);
	}
	
  public void clickonSubmitbutton(WebDriver driver)
 
 {
	  Utilitynew.wait(driver,3000 );
	Submitbutton.click();
	Reporter.log("clicking on submitbutton", true);
 }
}
