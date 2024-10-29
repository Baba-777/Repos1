package POPUPS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
public static void main(String[] args) throws InterruptedException, AWTException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
driver.findElement(By.xpath("//section[contains(text(),'Frames')]")).click();
driver.switchTo().frame(0);
driver.findElement(By.name("username")).sendKeys("baba");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("7777");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);

if(driver.getCurrentUrl().contains("https://demoapps.qspiders.com/ui/frames?sublist=0")) {
	System.out.println("Test case is passed");
}
else {
	System.out.println("Test case is failed");
	driver.close();
}

	
}
}
