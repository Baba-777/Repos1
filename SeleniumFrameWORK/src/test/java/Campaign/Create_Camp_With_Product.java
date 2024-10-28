package Campaign;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_utility.File_Utility;
import objectRepository.Excel_Utility;
import objectRepository.Java_Utility;
import objectRepository.WebDriver_utility;

public class Create_Camp_With_Product {
	@Test
	public void Create_Camp_With_Product ()throws Throwable {

		File_Utility flib = new File_Utility();
		WebDriver_utility wlib = new WebDriver_utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();

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
		LoginPage login = new LoginPage(driver);
		login.loginToVtiger(USERNAME, PASSWORD);

		wlib.maximizeWindow(driver);
		wlib.waitForElementsToLoad(driver);

		objectRepository.HomePage home = new objectRepository.HomePage(driver);
		home.clickProductLink();

		ProductLookUp prodImg = new ProductLookUp(driver);
		prodImg.clickOnPlusSign();
		// driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();

		int ranNum = jlib.getRandomNum();

		String PrdName = elib.getExcelData("Product", 0, 0) + ranNum;
		System.out.println(PrdName);

		CreateProductPage prdPage = new CreateProductPage(driver);
		prdPage.enterPrdName(PrdName);
		prdPage.clickSaveButton();
		Assert.assertEquals(actdata, prdName, "Product is not created");
		System.out.println("Product name is created");
	}
}


