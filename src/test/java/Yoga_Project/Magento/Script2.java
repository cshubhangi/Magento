package Yoga_Project.Magento;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcomponents.BaseTest1;
import yogamagento.pageobject.homepage;

public class Script2 extends BaseTest1  {


	@Test
	public static void UserloginValidLogin() {  
		
		/*WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver.get("https://magento.softwaretestingboard.com/");*/
		//System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("sid@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sneha1234");
		driver.findElement(By.xpath("//button[@name='send']")).click();	
		driver.findElement(By.xpath("//div[@class='panel header']/ul[1]/li[1]")).click();
	     String UserName =driver.findElement(By.xpath("//span[@class='logged-in']")).getText();
		System.out.println(UserName);
		Assert.assertEquals("Welcome, Goutam chile!",UserName);
		
		driver.findElement(By.xpath("//button[@class='action switch']")).click();
		driver.findElement(By.xpath("(//a)[4]")).click();
		String logoutmsg =driver.findElement(By.cssSelector("span.base")).getText();
		System.out.println(logoutmsg);
		Assert.assertEquals("You are signed out", logoutmsg);
		}
 

	@Test(dataProvider="getData",groups="MultipalData")
	
	
	public static void Errormsg  (String email,String Pw) {
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pw);
		driver.findElement(By.xpath("//button[@name='send']")).click();		
		String error=driver.findElement(By.xpath("//div[@class='message-error error message']")).getText();
		System.out.println(error);
		Assert.assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", error);
	
	}
	@DataProvider  
	public  Object[][] getData () {
		return new Object [] []{{"gid@gmail.com","123"},{"abc@gmail.com","S12"}};
				
				
	}
}
	
	
