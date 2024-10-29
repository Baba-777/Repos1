            package robot;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillarray_robot {
public static void main(String[] args) throws AWTException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapp.skillrary.com/login.php?type=login");
Robot rb= new Robot();
driver.findElement(By.id("email")).click();
rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);

rb.keyPress(KeyEvent.VK_D);
rb.keyRelease(KeyEvent.VK_D);

rb.keyPress(KeyEvent.VK_M);
rb.keyRelease(KeyEvent.VK_M);

rb.keyPress(KeyEvent.VK_I);
rb.keyRelease(KeyEvent.VK_I);

rb.keyPress(KeyEvent.VK_N);
rb.keyRelease(KeyEvent.VK_N);

rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);

driver.findElement(By.id("password")).click();

rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);

rb.keyPress(KeyEvent.VK_D);
rb.keyRelease(KeyEvent.VK_D);

rb.keyPress(KeyEvent.VK_M);
rb.keyRelease(KeyEvent.VK_M);

rb.keyPress(KeyEvent.VK_I);
rb.keyRelease(KeyEvent.VK_I);

rb.keyPress(KeyEvent.VK_N);
rb.keyRelease(KeyEvent.VK_N);

rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);

rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);

rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);

rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
System.out.println(driver.getTitle());
if(driver.getTitle().contains("SkillRary Ecommerce")) {
	System.out.println("Test case is passed");
}
	else {
		System.out.println("Test case is failed");
	}


}
}