package yogamagento.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponets.Abstrutcomponet;

public class Cartpage extends Abstrutcomponet {
	public WebDriver driver;
	
	public Cartpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//driver.findElement(By.cssSelector("#qty")).sendKeys("");
	//driver.findElement(By.cssSelector("#product-addtocart-button")).click();
	//String cart = driver.findElement(By.cssSelector("div[data-ui-id='message-success']")).getText();
	
	@FindBy(css="#qty")
	WebElement quantity;
	
	@FindBy(css="#product-addtocart-button")
	WebElement add;
	
	@FindBy(css="div[data-ui-id='message-success']")
	WebElement cartmsg;
	
	public void getAddtocart(String count) {
		quantity.sendKeys("count");
		add.click();
	}
		
		public String SuccessMsg() {
			return cartmsg.getText();
	
		
		}
	
	
	
	
	
}
