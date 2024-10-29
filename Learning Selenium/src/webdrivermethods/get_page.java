package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_page {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
System.out.println(driver.getPageSource());
}
}
