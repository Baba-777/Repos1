package TAKE_screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class demo_screen {
public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapp.skillrary.com/");
Actions act= new Actions(driver);
 WebElement course = driver.findElement(By.id("course"));
act.moveToElement(course).perform();
Thread.sleep(3000);
WebElement selenium = driver.findElement(By.linkText("selenium"));
selenium.click();
Thread.sleep(3000);
  WebElement zoomm = driver.findElement(By.className("zoom"));
  
  File temp= zoomm.getScreenshotAs(OutputType.FILE);
  System.out.println(temp);
  
  File perm= new File("./demo/image1.png");
  System.out.println(perm);
  
  FileHandler.copy(temp, perm);
  driver.close();
  
 
 

	
}
}
