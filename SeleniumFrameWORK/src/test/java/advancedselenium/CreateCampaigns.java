package advancedselenium;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.time.Duration;
	import http://java.util.Properties;
	import java.util.Random;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import http://org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.Excel_Utility;
	import Generic_Utility.File_Utility;
	import Generic_Utility.Java_Utility;
	import Generic_Utility.WebDriver_utility;
	import ObjectRepository.HomePage;
	import ObjectRepository.LoginPage;

	public class CreateCampaigns {
		@Test
		

		public void CreateCampaigns() throws Throwable {
			Generic_utility.File_Utility flib = new File_Utility();
			WebDriver_utility wlib = new WebDriver_utility();
			Java_Utility jlib = new Java_Utility();
			Excel_Utility elib = new Excel_Utility();

			// Reading data from file_utility
			String BROWSER = flib.getKeyAndValuePair("browser");
			String URL = flib.getKeyAndValuePair("url");
			String USERNAME = flib.getKeyAndValuePair("username");
			String PASSWORD = flib.getKeyAndValuePair("password");

			WebDriver driver;
			if (BROWSER.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}

			else if (BROWSER.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}

			else if (BROWSER.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new EdgeDriver();
			}
			driver.get(URL);
			
			//implemented using getter methods
//			LoginPage login = new LoginPage(driver);
//			login.getUserTextField().sendKeys(USERNAME);
//			login.getPasswordTextField().sendKeys(PASSWORD);
//			login.getLoginButton().click();
			
			LoginPage login = new LoginPage(driver);
			login.loginToVtiger(USERNAME, PASSWORD);
			
//			driver.findElement(http://By.name("user_name")).sendKeys(USERNAME);
//			driver.findElement(http://By.name("user_password")).sendKeys(PASSWORD);
//			WebElement loginButton = driver.findElement(http://By.id("submitButton"));
//	        wlib.customizedWait(driver, loginButton);
//	        http://loginButton.click();
			
			
			wlib.maximizeWindow(driver);
			wlib.waitForElementsToLoad(driver);

//			WebElement moreLink = driver.findElement(By.linkText("More"));
//	        wlib.moveToElementCursor(driver, moreLink);
//			driver.findElement(By.linkText("Campaigns")).click();
			
			HomePage home = new HomePage(driver);
			home.clickMoreLink();
			home.clickCampLink();
			
			driver.findElement(By.xpath("//img[@alt=\"Create Campaign...\"]")).click();

			int ranNum = jlib.getRandomNum();

			String CampName = elib.getExcelData("Campaigns", 0, 0) + ranNum;
			System.out.println(CampName);

			driver.findElement(http://By.name("campaignname")).sendKeys(CampName);

			driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
			String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();

			if (actData.contains(CampName)) {
				System.out.println("Campaigns Name is Created");
			} else {
				System.out.println("Campaigns name not created");
			}

			WebElement AmdLink = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));

			wlib.moveToElementCursor(driver, AmdLink);
			driver.findElement(By.linkText("Sign Out")).click();

		}

	}
	 
