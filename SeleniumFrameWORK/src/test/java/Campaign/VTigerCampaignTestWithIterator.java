package Campaign;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Iterator;
	import java.util.Set;

	public class VTigerCampaignTestWithIterator {
		@Test
		
		public void VTigerCampaignTestWithIterator()
		{
			
	        // Set the path to the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Step 1: Log in to VTiger application
	        driver.get("https://your-vtiger-url.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.name("username")).sendKeys("your_username");
	        driver.findElement(By.name("password")).sendKeys("your_password");
	        driver.findElement(By.id("submitButton")).click();

	        // Step 2: Mouse over the "More" link
	        WebElement moreLink = driver.findElement(By.linkText("More"));
	        Actions action = new Actions(driver);
	        action.moveToElement(moreLink).perform();

	        // Step 3: Click on "Campaigns"
	        driver.findElement(By.linkText("Campaigns")).click();

	        // Step 4: Click on the "Create Campaign" lookup image
	        driver.findElement(By.xpath("//img[@title='Create Campaign']")).click();

	        // Step 5: Enter campaign name
	        driver.findElement(By.name("campaignname")).sendKeys("New Product Campaign");

	        // Step 6: Click on the Product lookup image (plus button)
	        driver.findElement(By.xpath("//img[@title='Select']")).click();

	        // Step 7: Handle the pop-up window using Iterator
	        String parentWindow = driver.getWindowHandle(); // Store parent window handle
	        Set<String> allWindows = driver.getWindowHandles(); // Get all window handles
	        Iterator<String> iterator = allWindows.iterator(); // Create Iterator

	        while (iterator.hasNext()) {
	            String childWindow = iterator.next();
	            if (!parentWindow.equals(childWindow)) {
	                // Switch to the pop-up window
	                driver.switchTo().window(childWindow);

	                // Perform actions in the pop-up, e.g., select a product
	                driver.findElement(By.xpath("//a[text()='Your Product Name']")).click();

	                // Switch back to the parent window
	                driver.switchTo().window(parentWindow);
	                break;
	            }
	        }

	        // Step 8: Verify the product name is added to the Campaign Create page
	        WebElement productField = driver.findElement(By.name("product_id_display"));
	        if (productField.getAttribute("value").equals("Your Product Name")) {
	            System.out.println("Product added successfully.");
	        } else {
	            System.out.println("Product not added.");
	        }

	        // Step 9: Click on the "Save" button
	        driver.findElement(By.name("button")).click();

	        // Step 10: Verify if the campaign is created
	        WebElement campaignInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
	        if (campaignInfo.getText().contains("New Product Campaign")) {
	             System.out.println("Campaign created successfully.");
	        } else {
	            System.out.println("Campaign creation failed.");
	        }

	        // Step 11: Logout from the application
	        driver.findElement(By.linkText("Sign Out")).click();
	        System.out.println("Logged out successfully.");

	        // Close the browser
	        driver.quit();
	    }
	}

