package yogamagento.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponets.Abstrutcomponet;

public class FilterOtions extends Abstrutcomponet {

		WebDriver driver;
	
	public FilterOtions(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	/*driver.findElement(By.xpath("//div[@class='filter-options']/div[2]")).click();//nko
	//driver.findElement(By.xpath("//a[contains(.,'$40.00 - $49.99 4')]")).click();
	//driver.findElement(By.xpath("//div[@class='filter-options']/div[3]")).click();
	//driver.findElement(By.xpath("//a[contains(.,'Rubber' )]")).click();*/
	
	@FindBy(xpath="//div[@class='filter-options']/div[2]")//3
	WebElement price;
	
	@FindBy(xpath="//a[contains(.,'$40.00 - $49.99 4')]")
	WebElement subprice;
	
	
	public void filterOptions() {
		price.click();
		subprice.click();
	
	
	
	}
	
}
