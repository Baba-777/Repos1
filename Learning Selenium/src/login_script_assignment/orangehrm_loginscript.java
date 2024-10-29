package login_script_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm_loginscript {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[ @type ='submit']")).click();
	System.out.println(driver.getTitle());
	if(driver.getTitle().contains("OrangeHRM")) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is failed");

	}
	driver.close();
}
}
