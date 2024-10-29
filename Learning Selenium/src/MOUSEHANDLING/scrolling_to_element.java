package MOUSEHANDLING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolling_to_element {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demowebshop.tricentis.com/");
 WebElement search = driver.findElement(By.linkText("Search"));
 Actions act = new Actions(driver);
 Thread.sleep(3000);
 
 act.scrollToElement(search).perform();
 
 Thread.sleep(3000);
 
 act.click(search).perform();
 
 
}
}
