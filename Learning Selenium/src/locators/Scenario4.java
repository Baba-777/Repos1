package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.youtube.com/");
//driver.findElement(By.id("search"));
driver.findElement(By.name("search_query")).sendKeys("Doraeman");
driver.findElement(By.id("search-icon-legacy")).click();
driver.close();

	
}
}
