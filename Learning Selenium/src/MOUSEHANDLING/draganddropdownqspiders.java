package MOUSEHANDLING;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropdownqspiders {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
 WebElement mobile = driver.findElement(By.xpath("//div[contains(text(),'Mobile Charger')]"));
  WebElement acces = driver.findElement(By.xpath("//div[contains(text(),'Mobile Accessories')]"));
Actions act = new Actions(driver);
act.dragAndDrop(mobile, acces).perform();
WebElement laptop=driver.findElement(By.xpath("//div[contains(text(),'Laptop Charger')]"));
WebElement access=driver.findElement(By.xpath("//div[contains(text(),'Laptop Accessories')]"));
act.dragAndDrop(laptop, access).perform()	;
WebElement mobil =driver.findElement(By.xpath("//div[contains(text(),'Mobile Cover')]"));
WebElement acess =driver.findElement(By.xpath("//div[contains(text(),'Mobile Accessories')]"));
act.dragAndDrop(mobil, acess).perform();
}
}
