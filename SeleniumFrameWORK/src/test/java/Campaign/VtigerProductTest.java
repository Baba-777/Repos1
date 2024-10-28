package Campaign;
 
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

	public class VtigerProductTest {
		@Test
		
public VtigerProductTest() {
	
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");  // Replace with your actual ChromeDriver path
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        // Step 1: Login to Vtiger application
	        driver.get("http://vtiger-url.com");  // Replace with the actual Vtiger login URL
	        driver.findElement(By.name("username")).sendKeys("your_username");  // Replace with your username
	        driver.findElement(By.name("password")).sendKeys("your_password");  // Replace with your password
	        driver.findElement(By.id("submitButton")).click();

	        // Step 2: Click on 'Products' link
	        driver.findElement(By.linkText("Products")).click();

	        // Step 3: Click on 'Create Product' button
	        driver.findElement(By.xpath("//img[@title='Create Product...']")).click();

	        // Step 4: Enter product name and save
	        String productName = "TestProduct123";
	        driver.findElement(By.name("productname")).sendKeys(productName);
	        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	        // Step 5: Verify whether the product is created on the Product Information page
	        WebElement productInfo = driver.findElement(By.className("lvtHeaderText"));
//	        
//	        if (productInfo.getText().contains(productName)) {
//	            System.out.println("Product created successfully: " + productName);
//	        } else {
//	            System.out.println("Product creation failed.");
//	        }

	        // Step 6: Navigate back to 'Products' page
	        driver.findElement(By.linkText("Products")).click();

	        // Step 7: Select the created product's checkbox
	        driver.findElement(By.xpath("//table//tr[td/a[text()='" + productName + "']]/td[1]/input")).click();

	        // Step 8: Click on 'Delete' button
	        driver.findElement(By.xpath("//input[@value='Delete']")).click();

	        // Step 9: Handle the Alert popup
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        alert.accept();  // Click 'OK' to confirm the deletion

	        // Step 10: Verify the product is deleted
	        public String validatePrd(WebDriver driver1, String PrdName)
	       {
	    	   
	       }
	        
	         =driver1.findElements(By.xpath("//table//tr[td/a[text()='" + productName + "']]")).isEmpty();
//	        if (isDeleted) {
//	            System.out.println("Product deleted successfully.");
//	        } else {
//	            System.out.println("Product deletion failed.");
//	        }

	        // Step 11: Logout from the application
	        driver1.findElement(By.linkText("Sign Out")).click();
	        System.out.println("Logged out successfully.");

	        // Close the browser
	        driver1.quit();
	    }
	}


