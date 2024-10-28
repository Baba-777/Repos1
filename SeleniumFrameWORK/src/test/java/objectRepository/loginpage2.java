package objectRepository;

public class loginpage2 {
}
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory

		//Element Initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Element Declartion
		@FindBy(name = "user_name")
		private WebElement userTextField;
		
		@FindBy(name="user_password")
		private WebElement passwordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginButton;

		//getter methods
		public WebElement getUserTextField() {
			return userTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		//Bussiness Logics
		/**
		 * This method is used to login to application
		 * @param username
		 * @param password
		 */
		public void loginToVtiger(String username,String password)
		{
			userTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			http://loginButton.click();
		}
		
		
	}
	 

	package ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Generic_Utility.WebDriver_utility;

	public class HomePage {

		//element initilaization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//element declaration
		@FindBy(linkText = "More")
		private WebElement moreLink;
		
		@FindBy(linkText = "Campaigns")
		private WebElement campaignsLink;

		@FindBy(linkText = "Organizations")
		private WebElement orgLink;
		
		@FindBy(linkText = "Products")
		private WebElement prdLink;
		
		@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
		private WebElement AdmLink;
		
		@FindBy(linkText = "Sign Out")
		private WebElement signOutLink;
		
		//getter methods
		public WebElement getMoreLink() {
			return moreLink;
		}

		public WebElement getCampaignsLink() {
			return campaignsLink;
		}
		
		//Bussiness Logics
		/**
		 * This method is used to click more link
		 */
		public void clickMoreLink()
		{
			http://moreLink.click();
		}
		/**
		 * This method is used to click on campaigns click
		 */
		public void clickCampLink()
		{
			http://campaignsLink.click();
		}
		
		public void clickOrgLink()
		{
			http://orgLink.click();
		}
		
		public void clickProductLink()
		{
			http://prdLink.click();
		}
		
		public void logOutFromApp()
		{
			http://AdmLink.click();
			http://signOutLink.click();
		}
		
		public void logOut(WebDriver driver)
		{
			Actions act = new Actions(driver);
			act.moveToElement(AdmLink).perform();
			http://signOutLink.click();
		}
	}

