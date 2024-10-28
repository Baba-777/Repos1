package Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
@Parameters("BROWSER")
public class BaseClass {

	public static Object sdriver;
	public WebDriver driver;
	@BeforeSuite(groups="Smoke test")
	public void bs()
	{
		System.out.println("DataBase connection");
	}
	
	@BeforeTest(groups="Smoke test")
	public void bt()
	{
		System.out.println("Parallel execution");
	}
	
	@BeforeClass(groups="Smoke test")
	public void bc() throws Throwable
	{
		File_Utility flib = new File_Utility();
		String BROWSER = flib.getKeyAndValuePair("browser");
		
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
		
		
		System.out.println("launching Browser");
	}
	
	
	@BeforeMethod(Group="Regression test")
	public void bm  ()
	{
		Generic_utility.File_Utility flib = new Generic_utility.File_Utility();
		objectRepository.WebDriver_utility wlib = new objectRepository.WebDriver_utility();
		objectRepository.Java_Utility jlib = new objectRepository.Java_Utility();
		objectRepository.Excel_Utility elib = new objectRepository.Excel_Utility();

		// Reading data from file_utility
		//String BROWSER = flib.getKeyAndValuePair("browser");
		String URL = flib.getKeyAndValuePair("url");
		String USERNAME = flib.getKeyAndValuePair("username");
		String PASSWORD = flib.getKeyAndValuePair("password");
		System.out.println("login to application");
	}
	public void Create_contacts_test_page extends BaseClass()
	{
		
		Generic_utility.File_Utility flib = new Generic_utility.File_Utility();
		objectRepository.WebDriver_utility wlib = new objectRepository.WebDriver_utility();
		objectRepository.Java_Utility jlib = new objectRepository.Java_Utility();
		objectRepository.Excel_Utility elib = new objectRepository.Excel_Utility();

		// Reading data from file_utility
		//String BROWSER = flib.getKeyAndValuePair("browser");
		String URL = flib.getKeyAndValuePair("url");
		String USERNAME = flib.getKeyAndValuePair("username");
		String PASSWORD = flib.getKeyAndValuePair("password");
		System.out.println("login to application");
	}
	
	@AfterMethod(groups="Smoke test")
	public void am()
	{
		System.out.println("logout from application");
	}
	
	@AfterClass(groups="Smoke test")
	public void ac()
	{
		System.out.println("close the browser");
	}
	
	@AfterTest(groups="Smoke test")
	public void at()
	{
		System.out.println("Parallel execution done");
	}
	
	@AfterSuite(groups="Smoke test")
	public void as()
	{
		System.out.println("Close database connection");
	}
}
