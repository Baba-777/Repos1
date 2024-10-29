package POMCLASS_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomclassfb {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();

fbsigup fb= new fbsigup(driver);

fb.getFirstname("baba");
fb.getLastname("afrid");
fb.getMail("shaikbabaafrid321@gmail.com");
fb.getPasswd("baba123");
fb.getDay("7");
fb.getMonth("May");
fb.getGender();
//driver.close();

}
}
