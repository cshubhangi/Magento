package abstractcomponets;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.PageFactory;
public class Abstrutcomponet {
		public WebDriver driver;
	
	public Abstrutcomponet(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")
	WebElement menuTab;
	@FindBy(xpath="//span[normalize-space()='Gear']")
	WebElement gearop;
	@FindBy(xpath="(//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all'])/li[3] ")  //#ui-id-27
	WebElement watch;
	//(//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all'])
	public void NavigationBarTab() {
		 menuTab.click();
	}
	public void goToHeader() {
		Actions a=new Actions (driver);
		a.moveToElement(gearop).build().perform();
		watch.click();		
		}
	
	
	public void ElementToAppear(WebElement ele) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	
	
public void windowswitch () {
	
	 driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId = it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);
		
}

//gear
//(//ul[@role='menu'])[8]//span[normalize-space()='Watches'] 


}
	
//wait or switching window code put