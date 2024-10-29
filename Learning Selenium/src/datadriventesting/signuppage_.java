package datadriventesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage_ {

	@FindBy(name="Gender")
	private WebElement name;
	
	@FindBy(id="FirstName")
	private WebElement fn;
	
    @FindBy(id="LastName")
    private WebElement ln;
    
    @FindBy(id="Email")
    private WebElement email;
    
    @FindBy(id="Password")
    private WebElement  pwd;
    
    @FindBy(id="ConfirmPassword")
    private WebElement cpwd;
    
    @FindBy(xpath="(//input[@type='submit']) [2]")
    private WebElement submit;
    
    public signuppage_(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	}
    	
    	//STEP-3
    	
    	public void getname() {
    		name.click();
    	}
    	public void getpass(String data) {
    		pwd.sendKeys(data);
    	}
    	public void getfn(String data) {
    		fn.sendKeys(data);
    	}
    	public void getln(String data) {
    		ln.sendKeys(data); 
    	}
    	public void getcpwd(String data) {
    		cpwd.sendKeys(data);
    	}
    	public void getemail(String data) {
    		email.sendKeys(data);
    	}
    	public void getregister() {
    		submit.click();
}
}