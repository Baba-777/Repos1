package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop_jsscroll { 
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demowebshop.tricentis.com/");
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
}
}
