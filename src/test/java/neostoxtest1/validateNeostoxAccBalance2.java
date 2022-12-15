package neostoxtest1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neostoxBase1.Basenew;
import neostoxPOM.NeostoxHomePage;
import neostoxPOM.Neostoxloginpage;
import neostoxPOM.Neostoxpasswordpage;
import neostoxPOM.NeostoxsignInpage;
import neostoxPOM.Utilitynew;





@Listeners(neostoxBase1.Listener.class)
public class validateNeostoxAccBalance2 extends Basenew
{
	
	Neostoxloginpage login;
	Neostoxpasswordpage password;
	NeostoxHomePage   Home;
	NeostoxsignInpage signIn;
 @BeforeClass
 public void launchNeostox() throws InterruptedException, IOException
 {
	 launchBrowser();//from base class
	 login= new Neostoxloginpage(driver);
	 password= new Neostoxpasswordpage(driver);
	 Home= new NeostoxHomePage(driver);
	 signIn=new NeostoxsignInpage(driver);
	 
			 
 }
 @BeforeMethod
 public void logintoNeostox() throws EncryptedDocumentException, IOException, InterruptedException
 {
	 signIn.clickonsignInbutton(driver);
	 Thread.sleep(1000);
	 login.sendmobilenum(driver, Utilitynew.readDataFrompropertyFile("mobileNum"));
	 login.clickonSignInbutton(driver);
	 Utilitynew.wait(driver, 3000);
	 password.Enterpassword(driver,Utilitynew.readDataFrompropertyFile("password"));
	Thread.sleep(2000);
	 password.clickonSubmitbutton(driver);
	 Thread.sleep(5000);
	 Home.handlePopup(driver);
	 
 }
	
	@Test
  public void validateaccountbalance() throws EncryptedDocumentException, IOException 
  {
	 Assert.assertNotNull(Home.getaccountbalance(driver),"Tc failed Unable to fetct account balance");
	 Assert.fail();
	
	 
	  
  }
	@Test(priority=-1)
	public void validateuserID() throws EncryptedDocumentException, IOException 
	  {
		 
		  Assert.assertEquals(Home.getActualUserName(driver),Utilitynew.readDataFrompropertyFile("username"));
		  
		 
	  }
	@AfterMethod
	public void logoutFromNeostox()
	{
		Home.logout(driver);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closing browser", true);
		driver.close();
	}
}



