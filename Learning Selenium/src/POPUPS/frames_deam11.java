package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_deam11 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.dream11.com/");
driver.switchTo().frame(0);
driver.findElement(By.id("regEmail")).sendKeys("8328091887");
Thread.sleep(3000);
driver.findElement(By.id("regUser")).click();
Thread.sleep(3000);
driver.close();
	
}
}
