package SDET_practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.demoblaze.com/");
  List<WebElement> tag = driver.findElements(By.tagName("a"));
 System.out.println(tag.size());
 List<WebElement> image = driver.findElements(By.tagName("img"));
 System.out.println(image.size());
 Thread.sleep(3000);
 driver.findElement(By.linkText("About us")).click();
 Thread.sleep(3000);
 
	driver.close();
}
}
