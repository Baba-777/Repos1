package SDET_practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task_automation_js {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement name = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','afrid')", name);
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','shaikbaba321@')", email);
		WebElement phone = driver.findElement(By.id("phone"));
		js.executeScript("arguments[0].setAttribute('value','7894561230')", phone);
		WebElement address = driver.findElement(By.id("textarea"));
		//address.sendKeys("pulivenduala");
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='PLVD'",address);
		//js.executeScript("arguments[0].setAttribute('value','pulivendula')", address);
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()", gender);
		WebElement day1 = driver.findElement(By.id("sunday"));
		js.executeScript("arguments[0].click()", day1);
		WebElement day2 = driver.findElement(By.id("friday"));
		js.executeScript("arguments[0].click()", day2);
		WebElement country = driver.findElement(By.id("country"));
		Select st = new Select(country);
		st.selectByVisibleText("India");
		WebElement colors = driver.findElement(By.id("colors"));
		st = new Select(colors);
		st.selectByVisibleText("Green");
		st.selectByVisibleText("White");
		System.out.println(st.isMultiple());
		if (st.isMultiple()) {
			System.out.println("Selected drop is multiple select");
		} else {
			System.out.println("Select valid drop down");
		}
		WebElement date = driver.findElement(By.id("datepicker"));
		js.executeScript("arguments[0].setAttribute('value','07-02-1999')", date);
		WebElement orangehrm = driver.findElement(By.partialLinkText("orange"));
		js.executeScript("arguments[0].click()", orangehrm);
		Thread.sleep(3000);
		 /*WebElement alert = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		 js.executeScript("arguments[0].click()", alert);
		 driver.switchTo().alert();*/
		 
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
		System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		driver.close();

	}
}
