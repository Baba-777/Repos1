package MOUSEHANDLING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapp.skillrary.com/");
 WebElement course = driver.findElement(By.id("course"));
 Actions a1= new Actions(driver);
 a1.moveToElement(course).perform();
 Thread.sleep(3000);
  WebElement skilltest = driver.findElement(By.xpath("(//a[text()='SkillTesting'])[1]"));
  a1.click(skilltest).perform();
  Thread.sleep(3000);
   WebElement cart = driver.findElement(By.xpath("(//button[@type='submit']) [2]"));
  a1.doubleClick(cart).perform();
  Thread.sleep(3000);
}
}