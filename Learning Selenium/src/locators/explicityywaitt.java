package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicityywaitt {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.instagram.com/");
	//STEP:-1
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
	 wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("8328091887");
	 WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("baba@123");
	 WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	wait.until(ExpectedConditions.visibilityOf(submit)).click();
	 WebElement  login = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Episode')]"));
	wait.until(ExpectedConditions.visibilityOf(login)).click();
	System.out.println(driver.getTitle());
	if(driver.getTitle().contains("Instagram")) {
		System.out.println("Test case is passed");
	}
	else {
		System.out.println("Test case is failed");
	}
	Thread.sleep(2000);
	driver.close();

		
	}
}

