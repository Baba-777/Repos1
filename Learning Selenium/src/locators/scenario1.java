package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.navigate().to("https://www.google.co.in/");
driver.findElement(By.linkText("Gmail")).click();
driver.navigate().back();
driver.findElement(By.linkText("Images")).click();
driver.close();

	
}
}
