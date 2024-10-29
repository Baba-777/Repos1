package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookloginscriptXpath {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.instagram.com/");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("baba");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("baba@777");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Episode')]")).click();
System.out.println(driver.getTitle());
if(driver.getTitle().contains("Instagram")) {
	System.out.println("Test case is passed");
}
else {
	System.out.println("Test case is failed");
}
driver.close();

	
}
}