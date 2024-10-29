package TAKE_screen_shot;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	public class amazon_web_page {
    public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");

	TakesScreenshot ts = (TakesScreenshot)driver;

	Thread.sleep(3000);

	File temp=ts.getScreenshotAs(OutputType.FILE);
	System.out.println(temp);

	File perm=new File("./demo/amazon.png");
	System.out.println(perm);

	 FileHandler.copy(temp, perm);
	 driver.close();
	}
	}

