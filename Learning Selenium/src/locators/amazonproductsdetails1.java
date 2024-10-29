package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonproductsdetails1 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPHONE");
driver.findElement(By.id("nav-search-submit-button")).click();
 WebElement apple = driver.findElement(By.xpath("((//span[contains(text(),'Apple ')])[2]"));
System.out.println(apple.getText());
driver.close();
}
}
