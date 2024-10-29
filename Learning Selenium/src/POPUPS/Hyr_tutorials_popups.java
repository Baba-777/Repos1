package POPUPS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hyr_tutorials_popups {
public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/");
		Robot a1 = new Robot();
		
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Thread.sleep(1000);
		
		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		Actions act = new Actions(driver);
		act.moveToElement(selenium).perform();
		Thread.sleep(3000);
				//act.moveToElement(alertsLink).click().perform();
		
		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement alertsLink = driver.findElement(By.linkText("Alerts"));
		alertsLink.click();
		Thread.sleep(2000);
		
		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);

		WebElement alertbox = driver.findElement(By.id("alertBox"));
		 act.click(alertbox).perform();
		 System.out.println("SIMPLE ALERT");
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("----------");
		System.out.println("CONFIRM ALERT");
		Thread.sleep(2000);
		
		WebElement confr = driver.findElement(By.id("confirmBox"));
		act.click(confr).perform();
		 alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("---------");
		System.out.println("PROMPT ALERT");
		Thread.sleep(2000);
//		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
//		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		
//		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
//		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement propmt = driver.findElement(By.id("promptBox"));
		propmt.click();
		Thread.sleep(2000);
		a1.keyPress(KeyEvent.VK_BACK_SPACE);
		a1.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		
		a1.keyPress(KeyEvent.VK_TAB);
		a1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		a1.keyPress(KeyEvent.VK_TAB);
		a1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		a1.keyPress(KeyEvent.VK_TAB);
		a1.keyRelease(KeyEvent.VK_TAB);
		
//		a1.keyPress(KeyEvent.VK_PAGE_DOWN);
//		a1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		a1.keyPress(KeyEvent.VK_A);
		a1.keyRelease(KeyEvent.VK_A);
		
		a1.keyPress(KeyEvent.VK_F);
		a1.keyRelease(KeyEvent.VK_F);
		
		a1.keyPress(KeyEvent.VK_R);
		a1.keyRelease(KeyEvent.VK_R);
		
		a1.keyPress(KeyEvent.VK_I);
		a1.keyRelease(KeyEvent.VK_I);
		
		a1.keyPress(KeyEvent.VK_D);
		a1.keyRelease(KeyEvent.VK_D);
		Thread.sleep(3000);
		//propmt.click();
		//alert = driver.switchTo().alert();
		//alert.sendKeys("babaafrid");
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
	}
}
