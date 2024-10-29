package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_netflix {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.netflix.com/browse/genre/5480");
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();
driver.findElement(By.className("submit")).click();
driver.findElement(By.className("header-login-link")).click();
driver.navigate().to("https://www.youtube.com/");
driver.navigate().refresh();
driver.findElement(By.name("search_query")).sendKeys("V the techee");
driver.findElement(By.className("yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded")).click();
driver.close();

	
}
}
