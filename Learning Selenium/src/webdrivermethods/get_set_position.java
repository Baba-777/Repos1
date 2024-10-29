package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_set_position {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");

 Dimension size=driver.manage().window().getSize();
 System.out.println(size.height);
 System.out.println(size.width);
 
 Point cor = driver.manage().window().getPosition();
 System.out.println(cor.x);
 System.out.println(cor.y);
 driver.close();

}
}
