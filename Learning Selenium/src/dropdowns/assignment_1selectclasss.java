package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_1selectclasss {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://www.facebook.com/");
 WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
 button.click();
 WebElement fnname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
 fnname.sendKeys("Baba");
  WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
 surname.sendKeys("shaik"); 
 WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
 mobile.sendKeys("8328091887");
 WebElement passnew = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
 passnew.sendKeys("baba@777");
 WebElement day = driver.findElement(By.id("day"));
 Select s1= new Select(day);
 Thread.sleep(3000);
 s1.selectByIndex(8);
 WebElement month = driver.findElement(By.id("month"));
  Select  s2= new Select(month);
  s2.selectByVisibleText("Feb");
  Thread.sleep(3000);
     WebElement year = driver.findElement(By.id("year"));
     Select  s3=new Select(year);
     s3.selectByValue("1999");
     Thread.sleep(3000);
 WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
 radio.click();
   WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
   signup.click();
   Thread.sleep(3000);
    System.out.println(driver.getTitle()) ;
    if(driver.getTitle().contains("Facebook – log in or sign up")) {
    	System.out.println("Test case is passed");
    }
    else {
    	System.out.println("Test case is failed");
    }
   driver.close();
}
}
