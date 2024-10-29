package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Forgotten")).click();
	  WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("8977890067");
	driver.findElement(By.partialLinkText("submit")).click();
	driver.close();
	
}
}
