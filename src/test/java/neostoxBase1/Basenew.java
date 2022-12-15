package neostoxBase1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxPOM.Utilitynew;





public class Basenew 
{
	 protected static WebDriver driver;
	public void launchBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinium\\chromedriver.exe");
	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(Utilitynew.readDataFrompropertyFile("url"));
	  Reporter.log("launching browser", true);               
  Thread.sleep(3000);
	}

}
