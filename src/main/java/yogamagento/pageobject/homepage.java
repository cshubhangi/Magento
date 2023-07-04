package yogamagento.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponets.Abstrutcomponet;

public class homepage extends Abstrutcomponet {
	public	WebDriver driver;
	
	public homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
//Register Element
	@FindBy(xpath="//ul[@class='header links']/li[3]")
	WebElement creatacc;
	
	@FindBy(css="#firstname")
	WebElement username;
	@FindBy(css="#lastname")
	WebElement lastname;
	@FindBy(id="email_address")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="password-confirmation")
	WebElement confPw;
	@FindBy(css="\"button[class='action submit primary']")
	WebElement submit;
//SignIn Element
	
	@FindBy(xpath="//ul[@class='header links']/li[2]")
	WebElement signIn;
	
	@FindBy(xpath="//input[@name='login[username]']")
	WebElement Uemail;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Passw;	
	
	@FindBy(xpath="//button[@name='send']")
	WebElement login;
	
	//driver.findElement(By.xpath("//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")).click();
	
	//@FindBy(xpath="//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")
	//WebElement menuTab;
	
	@FindBy(xpath="//li[@class='level0 nav-1 category-item first level-top ui-menu-item']")
	WebElement menuTab;
	
	public void Selectmenu() {

		menuTab.click();
	}
	
	public void CreatAcc (String Username,String Lastname1,String Email,String  Password, String ConfPw) {
		creatacc.click();
		username.sendKeys(Username);
		lastname.sendKeys(Lastname1);
		 email.sendKeys(Email);
		 password.sendKeys(Password);
		 confPw.sendKeys(ConfPw);
		 submit.click();
		 //menuTab.click();
	}
	public void SignIn(String Email,String Pass) {
		signIn.click();
		Uemail.sendKeys(Email);
		Passw.sendKeys(Pass);
		login.click();
		//NavigationBarTab();
		 //menuTab.click();
		goToHeader();
	}
	
	
	
	
	
	public void   goTo() 
		 {
			 driver.get("https://magento.softwaretestingboard.com/");
		 }
	
	}

