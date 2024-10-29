package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart_auto {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("AC");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
 List<WebElement > AC = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
  for(WebElement e11: AC) {
	  System.out.println(e11.getText());
  }
  driver.close();	  
  }
}