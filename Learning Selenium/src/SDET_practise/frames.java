package SDET_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://ui.vision/demo/webtest/frames/");
WebElement frame2 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
driver.switchTo().frame(frame2);
driver.findElement(By.name("mytext5")).sendKeys("selenium");
driver.findElement(By.linkText("https://a9t9.com")).click();
driver.switchTo().defaultContent();
 WebElement innerframe = driver.findElement(By.xpath("(//div[@class='row'])[1]"));
driver.switchTo().frame(innerframe);
driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']"));
if(driver.getTitle().contains("UI Vision by a9t9 software - Image-Driven Automation")) {
	System.out.println("Text is present");
}
else {
	System.out.println("Text is not present");
	driver.close();
}
}
}
