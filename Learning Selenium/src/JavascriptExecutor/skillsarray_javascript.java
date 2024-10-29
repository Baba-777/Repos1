package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillsarray_javascript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement email = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','baba')", email);
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','777')", pass);
		WebElement loginbtn = driver.findElement(By.id("last"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", loginbtn);
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("https://demoapp.skillrary.com/login.php")) {
			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}
		driver.close();

	}
}
