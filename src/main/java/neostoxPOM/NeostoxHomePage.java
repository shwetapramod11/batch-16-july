package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;





public class NeostoxHomePage
{
@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement okbutton;
@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closebutton;
@FindBy(id = "lbl_username")private WebElement userName;
@FindBy(id="lbl_curbalancetop")private WebElement accountbalance;
@FindBy(xpath = "//span[text()='Logout']")private WebElement logoutbutton;
public NeostoxHomePage(WebDriver driver)
    {
	PageFactory.initElements(driver, this);
	}
public void handlePopup(WebDriver driver) throws InterruptedException
   {
	if(okbutton.isDisplayed())
	{
		//utility.wait(driver, 1000);
		Thread.sleep(2000);
		okbutton.click();
		Reporter.log("Handeling Popup", true);
		Reporter.log("clicking on ok button of Popup", true);
		//utility.wait(driver, 1000);
		Thread.sleep(4000);
		closebutton.click();
		Reporter.log("clicking on close button of Popup", true);
		}
	else
	{
		Reporter.log("there is no popup", true);
	Thread.sleep(4000);	
	}
	}
	
public String getActualUserName(WebDriver driver)
{
	Utilitynew.wait(driver, 1000);
	String actualUserName = userName.getText();
	Reporter.log("getting actualUserName", true);
	Reporter.log("Actual User Name is"+actualUserName, true);
	return actualUserName;
	
}
public String getaccountbalance(WebDriver driver) 
{
	Utilitynew.wait(driver,1000);
	String acbalance = accountbalance.getText();
	Reporter.log("getting acbalance", true);
	Reporter.log("Account Balance is"+acbalance,true);
	return acbalance;
}
public void logout(WebDriver driver)
{
	Utilitynew.wait(driver, 1000);
	userName.click();
	Utilitynew.wait(driver,1000);
	logoutbutton.click();
	Reporter.log("logging out", true);
}
}
