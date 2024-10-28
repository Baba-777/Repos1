package Campaign;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Campaign {
@Test
    public void createCampaignTest() throws Throwable {
        
        // Step 1: Set the path to your WebDriver (example for ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");  // Replace with the actual path
        
        // Step 2: Initialize the WebDriver (for Chrome)
        WebDriver driver = new ChromeDriver();
        
        // Step 3: Open the application
        driver.get("http://localhost:8888/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 4: Log in to the application (if login is required)
        driver.findElement(By.name("user_name")).sendKeys("admin"); // Replace with actual username
        driver.findElement(By.name("user_password")).sendKeys("admin"); // Replace with actual password
        driver.findElement(By.id("submitButton")).click();

        // Step 5: Navigate to Campaigns module
        WebElement more = driver.findElement(By.xpath("//a[@href='javascript:;']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(more).perform();
        driver.findElement(By.name("Campaigns")).click();

        // Step 6: Create a new Campaign
        driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
        String campaignName = "Dmart Campaign";
        driver.findElement(By.name("campaignname")).sendKeys(campaignName);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Step 7: Verify the campaign name is created
        String createdCampaignName = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
        if (createdCampaignName.equals(campaignName)) {
            System.out.println("Successfully created the campaign: " + createdCampaignName);
        } else {
            System.out.println("Campaign name is not created.");
        }

        // Step 8: Logout of the application
        WebElement userIcon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        actions.moveToElement(userIcon).perform();
        driver.findElement(By.linkText("Sign Out")).click();

        // Step 9: Close the browser
        driver.quit();
    }
}
