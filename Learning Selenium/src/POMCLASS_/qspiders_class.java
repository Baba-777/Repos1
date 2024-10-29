package POMCLASS_;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspiders_class {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
qspiders_assignment qs= new qspiders_assignment(driver);

qs.getname("baba");                              
qs.getemail("shaikbabaafrid321@gmail.com");
qs.getpassword("7777777777");
qs.getregister();
System.out.println(driver.getCurrentUrl());
if(driver.getCurrentUrl().contains("https://demoapps.qspiders.com/ui/login")) {
	System.out.println("Test case is passed");
}
else {      
	System.out.println("Test case is failed");
}
driver.close();

}
}
