package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonproductalldetails {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPHONE");
	driver.findElement(By.id("nav-search-submit-button")).click();
	 List<WebElement>  apples = driver.findElements(By.xpath("//span[contains(text(),'Apple')]"));
	for(WebElement e1:apples) {
	System.out.println(e1.getText());
	
	
		
}
}
}