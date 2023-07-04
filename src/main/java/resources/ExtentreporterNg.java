package resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreporterNg {
   
	
	static ExtentReports extent;
@BeforeTest
    public static ExtentReports getreportObject() {
      
            String path = System.getProperty("user.dir") + "\\reports\\index.html";
            ExtentSparkReporter reporter = new ExtentSparkReporter(path);
            reporter.config().setDocumentTitle("Test Results");
            reporter.config().setReportName("Automation of Magento");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Shubhangi");
        
        return extent;
    }

  /*  @Test
    public void SuccessLoginValidation() {
        extent = getreportObject(); // Initialize extent object

        ExtentTest test = extent.createTest("SuccessLoginValidation");
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");

        driver.get("https://magento.softwaretestingboard.com/");
        test.info(driver.getTitle());
        extent.flush();*/

        // Rest of your test code
    }



