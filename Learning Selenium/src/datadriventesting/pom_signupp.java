package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

import POMCLASS_.pom_demo_webshop;

public class pom_signupp {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/register");
		signuppage_ sg= new signuppage_(driver);
		//STEP-1
	FileInputStream fi= new FileInputStream("./Properties/demowebshopsigup.properties");
	//STEP-2
	Properties pt= new Properties();
	pt.load(fi);
	String Firstname= pt.getProperty("Firstname");
	
	sg.getname();	
	sg.getfn(Firstname);
	sg.getln(pt.getProperty("Lastname"));
	sg.getpass(pt.getProperty("password"));
	sg.getemail(pt.getProperty("Email"));
	sg.getcpwd(pt.getProperty("confirmpasssword"));
	sg.getregister();
	
	//String Lastname= pt.getProperty("Firstname");
	//String = pt.getProperty("Firstname");
	
	Set<Entry<Object, Object>> entry = pt.entrySet();
	Iterator<Entry<Object, Object>> ii = entry.iterator();
	while(ii.hasNext()) {
		 System.out.println(ii.next());
	}
}
}
