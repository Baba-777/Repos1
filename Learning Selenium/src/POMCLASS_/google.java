package POMCLASS_;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.com/");

encapsulation es= new encapsulation(driver);

es.getsearch("selenium");
Thread.sleep(3000);
driver.navigate().refresh();
es.getsearch("manual");
driver.close();


	
}
}
