package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_drop_down_Assign {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]")).click();
driver.findElement(By.partialLinkText("Multi")).click();
Thread.sleep(3000);
driver.findElement(By.name("ph")).sendKeys("8328091887");
 WebElement gender = driver.findElement(By.id("select40"));
 Select s1= new Select(gender);
 s1.selectByVisibleText("Male");
 Thread.sleep(3000);
  WebElement country = driver.findElement(By.id("select-multiple-native"));
  s1= new Select(country);
  s1.selectByVisibleText("India");
  Thread.sleep(3000);
  WebElement state = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]"));
  s1= new Select(state);
  //s1.selectByValue("Telangana");
  s1.selectByValue("Andhra Pradesh");
  s1.selectByValue("Telangana");
  Thread.sleep(3000);
   WebElement quantity = driver.findElement(By.xpath("(//select[contains(@class,'text-blueGray-600 bg-white rounde')])[2]"));
  s1= new Select(quantity);
  s1.selectByValue("2");
  Thread.sleep(3000);
  driver.findElement(By.xpath("//button[@type='submit']")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//input[@type='radio'])[8]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//input[@type='radio'])[9]")).click();
  Thread.sleep(3000);
  driver.findElement(By.id("btn")).click();
  Thread.sleep(3000);
  driver.findElement(By.id("domain1")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//input[@type='checkbox']) [6]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//input[@type='checkbox']) [9]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  Thread.sleep(3000);
  WebElement order = driver.findElement(By.id("togglers"));
  order.click(); 
  String text = driver.findElement(By.xpath("//p[text()='ORDER PLACED']")).getText();
  //System.out.println(driver.getTitle());
  if(text.equals("ORDER PLACED")) {
	  System.out.println("Your Order has been successfully placed!");
  }
  else {
	  System.out.println("Test case is failed:)");
  }
 driver.close();

}
}
