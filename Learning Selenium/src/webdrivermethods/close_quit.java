package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_quit {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://kseab.karnataka.gov.in/english");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.linkText("Photo Gallery")).click();
driver.close();
driver.quit();

}
}
