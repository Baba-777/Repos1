package Organisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Create_Organisation {
	@Test
	

	public void Create_Organisation() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Organization')]")).click();
		driver.findElement(By.name("accountname")).sendKeys("INDIUM SOFTWARE16");
		driver.findElement(By.id("phone")).sendKeys("8328091887");
		driver.findElement(By.id("email1")).sendKeys("baba123@gmail.com");
		driver.findElement(By.name("button")).click();
		  WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions ac= new Actions(driver);
	     ac.moveToElement(admin).perform();
	     Thread.sleep(4000);
		 WebElement tex = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		System.out.println(tex.getText());
		//if(tex.equals("[ ACC14 ] INDIUM SOFTWARE09 - Organization Information"))
		if(tex.isDisplayed())
				{
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		
		}
			
		}
	

	}