package POPUPS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra_popup {
public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.yatra.com/");
Robot rt= new Robot();

rt.keyPress(KeyEvent.VK_TAB);
rt.keyRelease(KeyEvent.VK_TAB);
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

rt.keyPress(KeyEvent.VK_ENTER);
rt.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(3000);

driver.close();

}
}
