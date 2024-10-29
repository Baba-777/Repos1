package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_name {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/login");
WebElement email = driver.findElement(By.cssSelector("input[name='Email']"));
  email.sendKeys("shaikbabaafrid321@gmail.com");
  WebElement password = driver.findElement(By.className("password"));
  password.sendKeys("Afrid@000");
  WebElement RememberMe = driver.findElement(By.id("RememberMe"));
  RememberMe.click();
  WebElement login = driver.findElement(By.cssSelector("input[value ='Log in'"));
  login.click();
  if(driver.getTitle().contains("Demo Web Shop")) {
	  System.out.println("Test case is pass");
	  driver.close();
  }
  else {
	  System.out.println("Test case is failed");
  }
}
}
