package TAKE_screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;  

public class amazon_screenshot_5_images {

public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.amazon.in/");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IPHONE");
driver.findElement(By.xpath("//input[@type='submit']")).click();
  List<WebElement> image = driver.findElements(By.className("s-image"));
  
}
}
