package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Log in")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Shopping cart")).click();
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Wishlist")).click();
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.close();
	
	
}
}
