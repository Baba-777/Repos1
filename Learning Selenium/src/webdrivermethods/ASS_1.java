package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASS_1 {
public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.facebook.com/");
   Dimension size = driver.manage().window().getSize();
   System.out.println(size.height);
   System.out.println(size.width);
        Point cor = driver.manage().window().getPosition();
       System.out.println(cor.x);
       System.out.println(cor.y);
           String wid = driver.getWindowHandle();
           System.out.println(wid);
            driver.close();
            
   

}
}
