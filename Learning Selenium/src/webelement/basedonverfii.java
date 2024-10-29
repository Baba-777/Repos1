package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basedonverfii {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
 WebElement upi = driver.findElement(By.id("attended"));
 
 if(upi.isDisplayed() && upi.isEnabled()){
	 upi.click();
	 Thread.sleep(3000);
	 System.out.println(upi.isSelected());
 }else {
	 System.out.println("Not displayed or not enabled :(");
 }
 driver.close();
}
}