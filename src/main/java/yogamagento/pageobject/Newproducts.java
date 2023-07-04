package yogamagento.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponets.Abstrutcomponet;

public class Newproducts extends Abstrutcomponet {

		WebDriver driver;
	
	public Newproducts (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	/*driver.findElement(By.xpath("//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")).click();
	//driver.findElement(By.xpath("//main[@id='maincontent']//ul[1]//li[1]//a[1]")).click();
	 //driver.findElement(By.cssSelector("#ui-id-27")).click();
	//span[normalize-space()='Gear']2nd //nav[@class='navigation']/ul/li[4]
	//span[normalize-space()='Watches']
		//@FindBy(xpath="//span[normalize-space()='Gear']")
		//WebElement gearop;
		
		//@FindBy(xpath="//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")
		//WebElement menuTab;
		//(//ul[@role='menu'])[8]//span[normalize-space()='Watches']  new ////span[normalize-space()='Watches'])[1]
	@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[3]//a[1]")  
	WebElement tab;
	
	//@FindBy(xpath="//main[@id='maincontent']//ul[1]//li[1]//a[1]")
	//WebElement Tab1;*/
		
	
		public void ChoiceProd() {
			goToHeader();
			//tab.click();
		}
			
			
		}


	







