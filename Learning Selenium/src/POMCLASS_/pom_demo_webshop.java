package POMCLASS_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_demo_webshop {

	@FindBy(id="Email")
	private WebElement email; 
	
	@FindBy (id="Password")
	private WebElement passd;
	
	@FindBy (xpath="(//input[@type='submit']) [2]")
	private WebElement submit;
	
	public pom_demo_webshop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void getemail(String data) {
	email.sendKeys(data);
}
public void getpassd(String data) {
	 passd.sendKeys(data);
}
public void getsubmit() {
	submit.click();
}
	

}