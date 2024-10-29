package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.facebook.com/");
  WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    button.click();
   WebElement day = driver.findElement(By.id("day"));
   Select s1 = new Select(day);
   s1.selectByIndex(8);
   Thread.sleep(2000);
   
    WebElement mon = driver.findElement(By.id("month"));
    s1=new Select(mon);
    s1.selectByVisibleText("Aug");
    Thread.sleep(2000);
    
    WebElement year = driver.findElement(By.id("year"));
    s1= new Select(year);
    s1.selectByValue("1999");
    Thread.sleep(3000);
    driver.close();
}
}
