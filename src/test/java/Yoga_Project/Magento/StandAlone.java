package Yoga_Project.Magento;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;


public class StandAlone {
public static void main(String[] args)  {

	
	System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//ul[@class='header links']/li[2]")).click();
	driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("cshubhangi73@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shourya123");
	driver.findElement(By.xpath("//button[@name='send']")).click();	
	driver.findElement(By.xpath("//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")).click();
	driver.findElement(By.xpath("//main[@id='maincontent']//ul[1]//li[1]//a[1]")).click();
	//driver.findElement(By.xpath("//li[@class='item']/a/span[2])[2]")).click();//(//li[@class='item']/a/span[2])[2]
	driver.findElement(By.xpath("//*[contains(@aria-label,'XS')][1]")).click();
	driver.findElement(By.xpath("//div[@class='filter-options']/div[2]")).click();
	//List<WebElement> prodct= driver.findElements(By.cssSelector(".name"));
	List <WebElement> Products=  driver.findElements(By.cssSelector(".name"));//.product-image-photo
//System.out.println(Products);
	WebElement prod =Products.stream().filter(Product->
Product.findElement(By.xpath("//*[contains(text(),'Cassia Funnel Sweatshirt')]")).getText().equals("Cassia Funnel Sweatshirt")).findFirst().orElse(null);	//.name//.product-item-link

//product.details.product-item-details
	prod.click();//#option-label-size-143-item-166
	driver.findElement(By.cssSelector("#option-label-size-143-item-166")).click();
	//WebDriverWait w= new WebDriverWait(driver,10);
	//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#option-label-color-93-item-56"))));
	driver.findElement(By.xpath("//div[@class='swatch-option color'][1]")).click();
	driver.findElement(By.cssSelector("#qty")).sendKeys("");
	driver.findElement(By.cssSelector("#product-addtocart-button")).click();
	String cart = driver.findElement(By.cssSelector("div[data-ui-id='message-success']")).getText();
Assert.assertEquals(cart,"You added Circe Hooded Ice Fleece  your ");
	
	
}}
