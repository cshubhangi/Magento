package yogamagento.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponets.Abstrutcomponet;

public class Productcatalog extends Abstrutcomponet {

	public WebDriver driver;
	public Productcatalog(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//List <WebElement> Products=  driver.findElements(By.cssSelector(".name"));
	@FindBy(css=".name")
	List<WebElement> items;
	//its not (driver.)
	By addtoCart= By.xpath("(//strong[@class='product name product-item-name'])[1]");
	
	public List<WebElement> getproductlist() {
	
							return items;
								}

	public WebElement getproductbyname (String ProductName) {
		
		WebElement prod =getproductlist().stream().filter(Product->
		Product.findElement(By.xpath("(//strong[@class='product name product-item-name'])[1]")).getText().equals("Bolo Sport Watch")).findFirst().orElse(null);
		return prod;
											}
	 
	public void addtoCart(String ProductName) {
		  WebElement prod = getproductbyname (ProductName);
			prod.findElement(addtoCart).click();
			  
			  
		  }
	  }
	
	
