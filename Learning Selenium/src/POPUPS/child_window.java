package POPUPS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
 WebElement buttons = driver.findElement(By.className("whButtons"));
buttons.click();
System.out.println(driver.getWindowHandle());
System.out.println(driver.getWindowHandles());

String parentWindow=driver.getWindowHandle();
   Set<String> childWindow = driver.getWindowHandles();
   
   for(String id:childWindow) {
	   if(!id.equals(parentWindow)) {
		 driver.switchTo().window(id);
		 driver.findElement(By.id("firstName")).sendKeys("babaafrid");
		 Thread.sleep(3000);
		 driver.findElement(By.id("lastName")).sendKeys("shaik");
		 Thread.sleep(3000);
		 driver.findElement(By.id("hindichbx")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("email")).sendKeys("shaikbabaafrid321@gmail.com");
		 Thread.sleep(3000);
		 driver.findElement(By.id("password")).sendKeys("8328091887");
		 Thread.sleep(3000);
		 driver.findElement(By.id("registerbtn")).click();
		 Thread.sleep(3000);
	   }
		 driver.close();
	   
}
}
}