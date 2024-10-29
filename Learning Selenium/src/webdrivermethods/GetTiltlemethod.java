package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTiltlemethod {
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");
    System.out.println(driver.getTitle());
    String url = driver.getCurrentUrl();
    System.out.println(url);
}
}
