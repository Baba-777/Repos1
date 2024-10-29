package dropdowns;

public class demowebshop {
	import java.time.Duration;

	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class task_demoqspiders {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	 WebElement dropdown = driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]"));
	dropdown.click();
	driver.findElement(By.id("phone")).sendKeys("8328091887");
	driver.Element(By.id(null))


	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
}
