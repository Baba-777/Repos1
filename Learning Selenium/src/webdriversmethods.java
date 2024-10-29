import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriversmethods {
public static void main(String[] args) throws InterruptedException {
	new FirefoxDriver();
	Thread.sleep(5000);
	new ChromeDriver();
}
}
