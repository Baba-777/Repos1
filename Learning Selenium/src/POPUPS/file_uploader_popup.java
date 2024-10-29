package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_uploader_popup {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
 WebElement file = driver.findElement(By.name("file"));
 file.sendKeys("C:\\Users\\hp\\Desktop\\MANUAL TESTING - REAL TIME QUESTIONS.pdf");
 Thread.sleep(3000);
 driver.close();
	
}
}
