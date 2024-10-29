package locators;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium_task {

public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.selenium.dev/");
driver.findElement(By.linkText("Downloads")).click();
 List<WebElement> link = driver.findElements(By.className("card-link"));
 for (WebElement cardLink : link) {
 System.out.println(cardLink.getText()); 

}
 driver.close();
}
}
