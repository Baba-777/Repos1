package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_iframe {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
driver.findElement(By.xpath("(//a[contains(text(),'Nested')]) [1]")).click();
driver.findElement(By.id("email")).sendKeys("baba@123");
//driver.findElement(By.id("email")).sendKeys("baba111");
 

}
}
