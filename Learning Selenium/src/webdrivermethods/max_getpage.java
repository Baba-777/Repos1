package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_getpage {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new 	ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
Thread.sleep(5000);
driver.manage().window().minimize();
Thread.sleep(5000);
driver.manage().window().fullscreen();
Thread.sleep(5000);
driver.get("https://www.instagram.com/");
}
}
