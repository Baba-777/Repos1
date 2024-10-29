package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	Thread.sleep(2000);
	 List<WebElement> laptop = driver.findElements(By.xpath("//div[text()='laptop']"));
	 for(WebElement e11: laptop) {
		 System.out.println(e11.getText());
	 }
		 driver.close();
	 }
}

