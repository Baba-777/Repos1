package POMCLASS_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qspiders_assignment {
	
	//STEP-1
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement  password;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement register;
	
	//STEP-2
	
	public qspiders_assignment(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//STEP-3
	
	public void getname(String data) {
		name.sendKeys(data);
	}
	public void getpassword(String data) {
		password.sendKeys(data);
	}
	public void getemail(String data) {
		email.sendKeys(data);
	}
	public void getregister() {
		register.click();
		
	}
}