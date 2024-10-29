package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshopjs {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demowebshop.tricentis.com/");
 WebElement send = driver.findElement(By.name("q"));
 JavascriptExecutor js= (JavascriptExecutor)driver;
 
 js.executeScript("arguments[0].setAttribute('value','java')" ,send);
  WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
  js.executeScript("arguments[0].click()",submit);
  
  
 
	
}
}
