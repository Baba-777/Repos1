package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class google {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
 driver.get("https://www.google.com/");
 driver.findElement(By.id("APjFqb")).sendKeys("java");
 Thread.sleep(2000);
   List<WebElement> auto = driver.findElements(By.xpath("//span[text()='java']"));
   for(WebElement e11:auto) {
	  System.out.println(e11.getText());
   }
	  driver.close();
	   
   }
}
