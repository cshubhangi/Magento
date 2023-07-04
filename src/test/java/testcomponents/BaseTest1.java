
package testcomponents;										
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import yogamagento.pageobject.homepage;

public class BaseTest1 {
	public static WebDriver driver;
	public static homepage lp;
	
	public  WebDriver InitialiseDriver() throws IOException {
	Properties prop= new Properties();
	FileInputStream fis = new FileInputStream("\\Users\\Dhananjay Gavali\\eclipse-workspace\\Magento\\src\\main\\java\\resources\\GlobalData.properties");
	prop.load(fis);           
	//System.getProperty("User.dir")+"\\src\\main\\java\\resources\\GlobalData.properties"
	String browserName =prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	}
	
	else if(browserName.equalsIgnoreCase("edge")) {  
		System.setProperty("webdriver.edge.driver","G:\\Drivers\\edgedriver_win32 (2)\\edgedriver.exe");
		 driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "G:\\Drivers\\geckodriver-v0.31.0-_win32 (2)\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		}

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	return driver;
	
}

	public String getScreenshot(String testcaseName ,WebDriver driver) throws IOException {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File file = new File(System.getProperty("user.dir") + "\\reports\\" + testcaseName + ".png");
	    FileUtils.copyFile(source, file);
	    return System.getProperty("user.dir") + "\\reports\\" + testcaseName + ".png";
	}

	
	
	
	
@BeforeMethod(alwaysRun=true)
public homepage lounchapp() throws IOException {
	
		driver= InitialiseDriver(); 
	lp=new homepage(driver);     
		lp.goTo();
		return lp;
		
}

@AfterMethod(alwaysRun=true)
public void closeapp() {
	driver.close();
}

}








		






//System.getProperty("User.dir")+"\\src\\main\\java\\resources\\GlobalData.properties"
//System.getProperty("User.dir")+"\\src\\main\\java\\resources\\GlobalData.properties"

//\\Users\\Dhananjay Gavali\\eclipse-workspace\\Magento\\src\\main\\java\\resources\\GlobalData.properties

