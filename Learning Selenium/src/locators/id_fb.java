package locators;

import java.net.URL;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class id_fb {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("8328091887");
    WebElement pass = driver.findElement(By.id("pass"));
    pass.sendKeys("8977890067");
    driver.findElement(By.name("login")).click();
    String title = driver.getTitle();
    System.out.println(title);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    if(title.contains("Facebook – log in or sign up")&& url.contains("https://www.facebook.com/"))
    {
   
    System.out.println("Test case passed");
} 
else 
{
    System.out.println("Test case failed");
}

driver.close();
}
}
   