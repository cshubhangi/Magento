package Yoga_Project.Magento;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testcomponents.BaseTest1;

import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Script3 extends BaseTest1 {

	@Test
	public static void ValidateCartMsg () {
		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("cshubhangi73@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shourya123");
		driver.findElement(By.xpath("//button[@name='send']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")).click();//ui-id-3byid
		driver.findElement(By.xpath("//main[@id='maincontent']//ul[1]//li[1]//a[1]")).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId = it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://magento.softwaretestingboard.com/gear/watches.html");
		driver.findElement(By.xpath("//div[@class='filter-options']/div[2]")).click();
		driver.findElement(By.xpath("//a[contains(.,'$40.00 - $49.99 4')]")).click();
		driver.findElement(By.xpath("//div[@class='filter-options']/div[3]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Rubber' )]")).click();
		driver.findElement(By.xpath("//span[@class='product-image-wrapper']")).click();//[1]
		driver.findElement(By.id("product-addtocart-button")).click();
	driver.close();
	driver.switchTo().window(parentWindowId);
	}

}
