package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class too__ {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
URL url = new URL("https://demoapp.skillrary.com/");
driver.navigate().to(url);

}
}
