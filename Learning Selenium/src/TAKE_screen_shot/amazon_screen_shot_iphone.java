package TAKE_screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class amazon_screen_shot_iphone {
public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IPHONE");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
  WebElement image = driver.findElement(By.className("s-image"));
  
  File temp= image.getScreenshotAs(OutputType.FILE);
  System.out.println(temp);
  
  File perm= new File("./demo/iphone.png");
  System.out.println(perm);
  
  FileHandler.copy(temp, perm);
  driver.close();
  
}
}
 