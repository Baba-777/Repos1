package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapp.skillrary.com/");
JavascriptExecutor js= (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,1800)","");
System.out.println(js.executeScript("return window.pageYOffset;"));
Thread.sleep(3000);
//js.executeScript("window.scrollTo(0,1600)","");
//System.out.println(js.executeScript("window.pageYOffset:"));

js.executeScript("window.scrollTo(0,-600)","");
System.out.println(js.executeScript("return window.pageYOffset;"));
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
System.out.println(js.executeScript("return window.pageYOffset;"));



	
}
}
