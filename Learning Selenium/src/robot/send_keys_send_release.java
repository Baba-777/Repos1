package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_keys_send_release {
public static void main(String[] args) throws AWTException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
driver.get("https://www.facebook.com/");
Robot rb= new Robot();

rb.keyPress(KeyEvent.VK_SHIFT);
rb.keyPress(KeyEvent.VK_B);

rb.keyRelease(KeyEvent.VK_B);
rb.keyRelease(KeyEvent.VK_SHIFT);

rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);

rb.keyPress(KeyEvent.VK_B);
rb.keyRelease(KeyEvent.VK_B);

rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);

rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);

rb.keyPress(KeyEvent.VK_SHIFT);
rb.keyPress(KeyEvent.VK_B);

rb.keyRelease(KeyEvent.VK_B);
rb.keyRelease(KeyEvent.VK_SHIFT);

rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);

rb.keyPress(KeyEvent.VK_B);
rb.keyRelease(KeyEvent.VK_B);

rb.keyPress(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_A);

rb.keyPress(KeyEvent.VK_TAB);
rb.keyRelease(KeyEvent.VK_TAB);


rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

if(driver.getTitle().contains("Facebook ")) {
	System.out.println("Test case is passed");
}
else {
	System.out.println("Test case is failed");
}

		


	
}
}
