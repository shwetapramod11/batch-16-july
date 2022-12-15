package neostoxPOM;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utilitynew {

	
	public static  String readDataFrompropertyFile(String key) throws IOException
	{//creat object properties file class.....java
		Properties prop=new Properties();
//creat objectfile Inputstream and pass property file path as parameter
	FileInputStream myfile=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\mavenproject\\Neostox.properties");
	prop.load(myfile);
	 String value = prop.getProperty(key);
	
	 Reporter.log("reading "+key+" from property file", true);
	 return value;
	
	
	}
	public static void Screenshot(WebDriver driver,String ScreenShotName) throws IOException
    {
	wait(driver,500);
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\selinium\\screensot\\"+ScreenShotName+".png" );
	FileHandler.copy(src, dest);
	Reporter.log(" taking ScreenShot", true);
    }
public static void scrollIntoview(WebDriver driver,WebElement element)
    {
	wait(driver,500);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoview(true)",element);
	Reporter.log("scrolling in to view", true);
	}
public static void wait(WebDriver driver,int waittime)
   {
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
     Reporter.log("waiting for"+waittime+ "ms",true);
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		