package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.selenium.dev/");
WebElement version = driver.findElement(By.xpath("//p[text()='Java']/../p[1]"));
System.out.println(version.getText());
 WebElement version1= driver.findElement(By.xpath("//p[text()='Ruby']/../p[2]"));
 System.out.println(version1.getText());
 
driver.close();


}
}
