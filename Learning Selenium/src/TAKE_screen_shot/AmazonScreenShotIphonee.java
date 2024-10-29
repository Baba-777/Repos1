package TAKE_screen_shot;


	import java.io.File;  
	import java.io.IOException;
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	public class AmazonScreenShotIphonee {
	    public static void main(String[] args) throws InterruptedException, IOException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IPHONE");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Thread.sleep(3000);

	        List<WebElement> images = driver.findElements(By.className("s-image"));
	        
	        // Loop through the first 5 images
	        
	        for (int i = 0; i < 5; i++) {
	        
	        	//Get the image element
	           
	          WebElement image = images.get(i);
	           
	          //Capture the screenshot of the image element
	            
	        	File temp = image.getScreenshotAs(OutputType.FILE);
	            System.out.println(temp);
	            
	            //Create a permanent file to save the screenshot
	            
	            File perm = new File("./IPHONES/babaiphones.png" + (i + 1) + ".png");
	            System.out.println(perm);
	            
	            //Copy the temporary file to the permanent file
	            
	            FileHandler.copy(temp, perm);
	        }

	        driver.close();
	    }
	}

