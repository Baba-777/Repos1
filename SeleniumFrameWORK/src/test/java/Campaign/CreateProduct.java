package Campaign;


import java.io.FileInputStream;
		import java.io.IOException;
		import java.time.Duration;
		import http

import java.util.Properties;
//java.util.Properties;
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

		public class CreateProduct {
@Test

			public void CreateProduct()throws Throwable {

				// step1:- get the file path connection
				FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\Properties_Data7am.properties");

				// step2:- load all the keys
				Properties pro = new Properties();
				pro.load(fis);

				// step3:- read key value
				String BROWSER = pro.getProperty("browser");
				String URL = pro.getProperty("url");
				String USERNAME = pro.getProperty("username");
				String PASSWORD = pro.getProperty("password");

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
				driver.findElement(http://By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(http://By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(http://By.id("submitButton")).click();

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				driver.findElement(By.linkText("Products")).click();

				driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();

				// To Avoid Duplicates
				Random ran = new Random();
				int ranNum = ran.nextInt(1000);

				// Step1:-get the connection of physical file
				FileInputStream fis1 = new FileInputStream("./src/test/resources/TestData7am.xlsx");

				// step2:- open workbook in read mode
				Workbook book = WorkbookFactory.create(fis1);

				// step3:-get control of the Sheet
				Sheet sheet = book.getSheet("Product");

				// step4:-get control of the row
				Row row = sheet.getRow(0);

				// step5:-get control of the cell
				Cell cel = row.getCell(0);

				// //step6:-read cell value
				String PrdName = cel.getStringCellValue() + ranNum;
				System.out.println(PrdName);

				driver.findElement(http://By.name("productname")).sendKeys(PrdName);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

				String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();

				if (actData.equals(PrdName)) {
					System.out.println("Product Name is Created");
				} else {
					System.out.println("Product name is not created");
				}

				WebElement AmdLink = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));

				Actions act = new Actions(driver);
				act.moveToElement(AmdLink).perform();
				driver.findElement(By.linkText("Sign Out")).click();
			}

		}
	}

}
