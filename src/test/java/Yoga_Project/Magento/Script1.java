package Yoga_Project.Magento;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testcomponents.BaseTest1;
import yogamagento.pageobject.homepage;


public class Script1 extends BaseTest1  {
	
	
	@Test
	public static void SuccessRegistraionMsg ()  {
	
	
		/*System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		//System.out.println(driver.getTitle());*/
		driver.findElement(By.xpath("//ul[@class='header links']/li[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Goutam");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("chile");
		driver.findElement (By.id("email_address")).sendKeys("hin@gmail.com");
		driver.findElement (By.id("password")).sendKeys("Sneha1234");
		driver.findElement (By.id("password-confirmation")).sendKeys("Sneha1234");
		driver.findElement(By.cssSelector("button[class='action submit primary']")).click();
		String Email=driver.findElement(By.xpath("//div[@data-ui-id='message-success']/div")).getText();  //.message-error.error.message ////div[@data-ui-id='message-success']/div
	    System.out.println(Email);
	    Assert.assertEquals("Thank you for registering with Main Website Store.",Email);

		//Screenshot
	  /*  WebElement name=driver.findElement(By.xpath("//div[@data-ui-id='message-success']/div"));
	    File file=name.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("logo.png"));*/
		}
	    
	    
	       
	
	@Test
	public static void SuccessRegistraionMsgb ()   {
	
		/*System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		//System.out.println(driver.getTitle());*/
		driver.findElement(By.xpath("//ul[@class='header links']/li[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Goutam");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("chile");
		driver.findElement (By.id("email_address")).sendKeys("abc@gmail.com");
		driver.findElement (By.id("password")).sendKeys("Sneha1234");
		driver.findElement (By.id("password-confirmation")).sendKeys("Sneha1234");
		driver.findElement(By.cssSelector("button[class='action submit primary']")).click();
		String Email=driver.findElement(By.xpath("//div[@data-ui-id='message-success']/div")).getText();  //.message-error.error.message ////div[@data-ui-id='message-success']/div
	    System.out.println(Email);
	    Assert.assertEquals("Thank you for registering with Main Website Store.",Email);
	 
	}
	
	@Test(groups= {"ErrorHandling"})
	public static void InValidRegistrionMsg () {
		driver.findElement(By.xpath("//ul[@class='header links']/li[3]")).click();
		driver.findElement(By.cssSelector("#firstname")).sendKeys("");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("");
		driver.findElement (By.id("email_address")).sendKeys("");
		driver.findElement (By.id("password")).sendKeys("");
		driver.findElement (By.id("password-confirmation")).sendKeys("");
		driver.findElement(By.cssSelector("button[class='action submit primary']")).click();
		String PWError2 = driver.findElement (By.xpath("(//fieldset[@data-hasrequired='* Required Fields']/div/div)[1]/div")).getText();
		System.out.println(PWError2);
		//Assert.assertTrue(true,PWError2);
		Assert.assertEquals("This is a required field.",PWError2);
	}

	@Test(groups= {"ErrorHandling"})
		public static void  validatePWErrorMsg () { 
			
		driver.findElement(By.xpath("//ul[@class='header links']/li[3]")).click();
		driver.findElement (By.id("password")).sendKeys("123");
		String PWError= driver.findElement (By.cssSelector("#password-error")).getText();
		System.out.println(PWError);
		Assert.assertEquals("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.", PWError);
		}
	@Test(groups= {"ErrorHandling"})
	public static void  validatePWconfErrorMsg () { 
		driver.findElement(By.xpath("//ul[@class='header links']/li[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Anaya");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Chougale");
		driver.findElement (By.id("email_address")).sendKeys("cshubhangi@gmail.com");
		driver.findElement (By.id("password")).sendKeys("Shourya123");
		driver.findElement (By.id("password")).sendKeys("Shourya123");
		driver.findElement (By.id("password-confirmation")).sendKeys("Shourya");
		driver.findElement(By.cssSelector("button[class='action submit primary']")).click();
		String PWError1 = driver.findElement (By.id("password-confirmation-error")).getText();
		System.out.println(PWError1);
		Assert.assertEquals("Please enter the same value again.",PWError1);}
	
	

}
	
	
				


