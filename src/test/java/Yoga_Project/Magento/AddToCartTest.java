
package Yoga_Project.Magento;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import abstractcomponets.Abstrutcomponet;
import testcomponents.BaseTest1;
import yogamagento.pageobject.Cartpage;
import yogamagento.pageobject.FilterOtions;
import yogamagento.pageobject.Newproducts;
import yogamagento.pageobject.Productcatalog;
import yogamagento.pageobject.homepage;

import java.io.IOException;
import java.time.Duration;
public class AddToCartTest extends BaseTest1 {

	
		@Test 
		public void SubmitOrder() throws IOException {
		String productName= "Bolo Sport Watch ";
		homepage lp= lounchapp();
		/*System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage lp=new homepage(driver);
		lp.goTo();
		System.out.println(driver.getTitle());*/
		
		lp.SignIn("sid@gmail.com", "Shourya123");
		//lp.CreatAcc("Anaya", "Chougale", "Cshubhangi73@gmail.com", "Shourya123", "Shourya123");
		//lp.Selectmenu();
		Newproducts np= new Newproducts(driver);
		np.goToHeader();
		
		FilterOtions ft= new FilterOtions(driver);
		ft.filterOptions();
		
		Productcatalog pl = new Productcatalog(driver);
		List <WebElement> Products=pl.getproductlist();
		pl.getproductbyname("productName");
		pl.addtoCart("ProductName");
		Cartpage cp=new Cartpage(driver);
		cp.getAddtocart("");
	 String match=cp.SuccessMsg();
	Assert.assertEquals("You added Bolo Sport Watch to your shopping cart.", match);
		
	
	//String cart = driver.findElement(By.cssSelector("div[data-ui-id='message-success']")).getText();		
	
	}

		

	
	}
	



	
	

//driver.findElement(By.xpath("//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")).click();menu w click
		//driver.findElement(By.xpath("//main[@id='maincontent']//ul[1]//li[1]//a[1]")).click();hoodie click
		 // driver.findElement(By.cssSelector("#ui-id-27")).click();
		//String ur = driver.getCurrentUrl();
		/* driver.switchTo().newWindow(WindowType.WINDOW);
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			String parentWindowId = it.next();
			String childWindow =it.next();
			driver.switchTo().window(childWindow);*/
			//driver.get("URL");
			 
			/*driver.findElement(By.xpath("//div[@class='filter-options']/div[2]")).click();//nko
			//driver.findElement(By.xpath("//a[contains(.,'$40.00 - $49.99 4')]")).click();
			//driver.findElement(By.xpath("//div[@class='filter-options']/div[3]")).click();
			//driver.findElement(By.xpath("//a[contains(.,'Rubber' )]")).click();
			//driver.findElement(By.xpath("//span[@class='product-image-wrapper']")).click();*/
/*List <WebElement> Products=  driver.findElements(By.cssSelector(".name"));
WebElement prod =Products.stream().filter(Product->
Product.findElement(By.xpath("(//strong[@class='product name product-item-name'])[1]")).getText().equals("Endurance Watch ")).findFirst().orElse(null);	//.name//.product-item-linkprod.click();//#option-label-size-143-item-166
//(//strong[@class='product name product-item-name'])[2]
//prod.click();*/


//driver.findElement(By.cssSelector("#qty")).sendKeys("");
//driver.findElement(By.cssSelector("#product-addtocart-button")).click();	
//String cart = driver.findElement(By.cssSelector("div[data-ui-id='message-success']")).getText();
