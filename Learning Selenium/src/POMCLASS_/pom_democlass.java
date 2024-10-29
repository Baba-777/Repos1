package POMCLASS_;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_democlass {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/login");
	pom_demo_webshop pw = new pom_demo_webshop(driver);
	//STEP-1
FileInputStream fi= new FileInputStream("./Properties/DemoWebShop.Properties");
//STEP-2 
Properties pt= new Properties();
pt.load(fi);
String  UN = pt.getProperty("Username");
String PWD = pt.getProperty("Password");
pw.getemail(UN);
pw.getpassd(PWD);
pw.getsubmit();
Set<Entry<Object, Object>> entry = pt.entrySet();
Iterator<Entry<Object, Object>> ii = entry.iterator();
while(ii.hasNext()) {
	 System.out.println(ii.next());
}





}
}
