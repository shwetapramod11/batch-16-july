package neostoxBase1;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neostoxPOM.Utilitynew;




public class Listener extends Basenew  implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	{
		String tcname = result.getName();
		Reporter.log("TC" +tcname+ "failed please try again", true);
		try {
			Utilitynew.Screenshot(driver, tcname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC" +result.getName()+ "success ....", true);
	}

	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC" +result.getName()+ " skipped please check", true);
		
	}
	
	
}

