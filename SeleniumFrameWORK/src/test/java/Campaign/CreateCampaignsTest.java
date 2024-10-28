package Campaign;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.time.Duration;
	import java.util.Properties;
	import java.util.Random;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
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
	import ObjectRepository.CampaignCreateNavigationPage;
	import ObjectRepository.CreateCampaignPage;
	import ObjectRepository.HomePage;
	import ObjectRepository.LoginPage;
	import ObjectRepository.ValidateCampaigns;

	public class CreateCampaignsTest {
@Test

		public void CreateCampaignsTest() throws Throwable {
			Generic_utility.File_Utility flib = new Generic_utility.File_Utility();
			objectRepository.WebDriver_utility wlib = new objectRepository.WebDriver_utility();
			objectRepository.Java_Utility jlib = new objectRepository.Java_Utility();
			objectRepository.Excel_Utility elib = new objectRepository.Excel_Utility();

			// Reading data from file_utility
			//String BROWSER = flib.getKeyAndValuePair("browser");
			String URL = flib.getKeyAndValuePair("url");
			String USERNAME = flib.getKeyAndValuePair("username");
			String PASSWORD = flib.getKeyAndValuePair("password");

			WebDriver driver;
			String BROWSER;
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
			LoginPage login = new LoginPage();
			login.loginToVtiger(USERNAME, PASSWORD);

			wlib.maximizeWindow(driver);
			wlib.waitForElementsToLoad(driver);

			objectRepository.HomePage home = new objectRepository.HomePage(driver);
			home.clickMoreLink();
			home.clickCampLink();

			CampaignCreateNavigationPage camp = new CampaignCreateNavigationPage();
			camp.clickCampPlus();

			int ranNum = jlib.getRandomNum();

			String CampName = elib.getExcelData("Campaigns", 0, 0) + ranNum;
			System.out.println(CampName);

			CreateCampaigns campPage = new CreateCampaigns();
			campPage.enterCampName(CampName);
			campPage.clickSaveButton();

			ValidateCampaigns valid = new ValidateCampaigns();
			valid.validateCampName(driver, CampName);
			home.logOut(driver);
		}

		private void clickSaveButton() {
		
		}

		private void enterCampName(String campName) {			
		}

	}
	