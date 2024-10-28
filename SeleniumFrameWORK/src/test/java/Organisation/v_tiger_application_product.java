package Organisation;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class v_tiger_application_product {
	@Test
	

		public void v_tiger_application_product() throws Throwable {

	        //Step 1 : Fetch the Data from Excel
	        FileInputStream file = new FileInputStream("./Excel/Advancedselenium.xlsx");
	        Workbook book = WorkbookFactory.create(file);
	        Sheet sheet = book.getSheet("productname");
	        Row row = sheet.getRow(0);

	        //get the VTiger URL
	        Cell url_cell = row.getCell(0);
	        String Url = url_cell.getStringCellValue();
	        System.out.println("URL : " + Url);

	        //get the product Name
	        Cell product_name = row.getCell(1);
	        String name = product_name.getStringCellValue();
	        System.out.println("product name: " + name);

	        //get the Phone Number
	        Cell Ph_Cell = row.getCell(2);
	        String phone = Ph_Cell.getStringCellValue();
	        System.out.println("Phone Number :  " + phone);

	        //get the Email
	        Cell Email_Cell = row.getCell(3);
	        String email = Email_Cell.getStringCellValue();
	        System.out.println("Email : " + email);

	        file.close();

	        //Step 2 : Launch the Browser and VTiger Application
	        ChromeDriver driver = new ChromeDriver();
	        driver.get(Url);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        System.out.println("Login Page Title : " + driver.getTitle());

	        //Step 3 : Enter the login credentials of VTiger Application
	        driver.findElement(By.name("user_name")).sendKeys("admin");
	        driver.findElement(By.name("user_password")).sendKeys("admin");
	        driver.findElement(By.id("submitButton")).click();

	        //Step 4 : Navigate to product page and enter the productName
	        driver.findElement(By.linkText("Products")).click();
	        driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
	        driver.findElement(By.name("productname")).sendKeys("shoes");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        
	        
	        //Step 5 : Check whether record is created or not
	        WebElement text = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
	        String msg = text.getText();
	        System.out.println("Record Created Message : " + msg);
	        if (text.isDisplayed()) {
	            System.out.println("Record is Created Successfully - Test Case Passed");
	        } else {
	            System.out.println("Record is not Created - Test Case Failed");
	        }

	        driver.quit();

		}
	}
	
