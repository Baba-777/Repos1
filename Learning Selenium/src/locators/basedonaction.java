package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basedonaction {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.zeptonow.com/");
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//WebElement search = driver.findElement(By.xpath("(//div[@class='relative'])[1]")); 
wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys("biscuits");
 //search.sendKeys("Biscuits");
 Thread.sleep(3000);
 search.clear();
 search.sendKeys("vegetables");
 Thread.sleep(3000);
 driver.close();

}
}
