package POPUPS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hyr_tutorials_windowhandles_assignment__ {

	    public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/");
        Robot rt= new Robot();
	    WebElement selenium = driver.findElement(By.xpath("(//a[normalize-space()='Selenium Practice'])[1]"));
	    rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Actions act = new Actions(driver);
		act.moveToElement(selenium).perform();
		Thread.sleep(3000);
		
		WebElement window = driver.findElement(By.xpath("//a[normalize-space()='Window Handles']"));
		act.moveToElement(window).click().perform();
		Thread.sleep(3000);
		 WebElement button = driver.findElement(By.xpath("(//button[@class='whButtons'])[2]"));
	     Thread.sleep(3000);
		 button.click();
	     
		String parentwindow = driver.getWindowHandle();
		 Set<String> childwindow = driver.getWindowHandles();
		 for(String id:childwindow) {
			 if(!id.equals(parentwindow)) {
				driver.switchTo().window(id);
			System.out.println(driver.getWindowHandle());
			System.out.println(driver.getWindowHandles());
			Thread.sleep(3000);
		      WebElement alert = driver.findElement(By.id("alertBox"));
			  alert.click();
			  Thread.sleep(3000);
				System.out.println("SIMPLE ALERT");
			Alert alertt = driver.switchTo().alert();
			System.out.println(alertt.getText());
			alertt.accept();
			System.out.println("--------");
			System.out.println("CONFIRM ALERT");
			Thread.sleep(3000);
			 WebElement confr = driver.findElement(By.id("confirmBox"));
			 act.click(confr).perform();
			 Thread.sleep(3000);
			 Alert alerttt = driver.switchTo().alert();
				System.out.println(alertt.getText());
				alertt.accept();
				System.out.println("--------");
				
			System.out.println("PROMPT ALERT");
			Thread.sleep(3000);
			 WebElement promp = driver.findElement(By.id("promptBox"));
			 act.click(promp).perform();
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_BACK_SPACE);
			 rt.keyRelease(KeyEvent.VK_BACK_SPACE);
			 
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_TAB);
			 rt.keyRelease(KeyEvent.VK_TAB);
			 
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_TAB);
			 rt.keyRelease(KeyEvent.VK_TAB);
			 
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_TAB);
			 rt.keyRelease(KeyEvent.VK_TAB);
			 
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_B);
			 rt.keyRelease(KeyEvent.VK_B);
			 
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_A);
			 rt.keyRelease(KeyEvent.VK_A);
			 
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_B);
			 rt.keyRelease(KeyEvent.VK_B);
			 Thread.sleep(3000);
			 
			 rt.keyPress(KeyEvent.VK_A);
			 rt.keyRelease(KeyEvent.VK_A);
			 Thread.sleep(3000);
			 System.out.println(alert.getText());
			 alertt.accept();
			 driver.close();
			 }
		 }
	    }
}
