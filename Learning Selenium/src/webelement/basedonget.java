package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basedonget {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.com/");
WebElement search = driver.findElement(By.id("APjFqb"));
 Point loc= search.getLocation();
 System.out.println(loc.x);
 System.out.println(loc.y);
     Dimension size = search.getSize();
     System.out.println(size.width);
     System.out.println(size.height);
     
      Rectangle Rect = search.getRect();
      System.out.println(Rect.x);
      System.out.println(Rect.y);
      System.out.println(Rect.width);
      System.out.println(Rect.height);
      
      driver.close();
      }
}
