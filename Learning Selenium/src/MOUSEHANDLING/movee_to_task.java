package MOUSEHANDLING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movee_to_task {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapp.skillrary.com/");
 WebElement course = driver.findElement(By.id("course"));
 Actions a1= new Actions(driver);
 a1.moveToElement(course).perform();
 Thread.sleep(3000);
  WebElement selenium = driver.findElement(By.xpath("(//a[text()='selenium']) [2]"));
 a1.click(selenium).perform();
 Thread.sleep(3000);
  WebElement add = driver.findElement(By.id("add"));
  a1.doubleClick(add).build();
  a1.perform();
  Thread.sleep(3000);
  a1.doubleClick(add).build();
  a1.perform();
  Thread.sleep(3000);
  a1.doubleClick(add).build();
  a1.perform();
  Thread.sleep(3000);
  WebElement cart = driver.findElement(By.xpath("//button[text()=' Add to Cart']"));
  a1.click(cart).build();
  a1.perform();
  Thread.sleep(3000);
}
}
