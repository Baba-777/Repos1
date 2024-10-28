package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Validate_Organisation {
	public Validate_Organisation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	
	public void validateOrgName(WebDriver driver,String OrgName)
	{
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();

		if (actData.contains(OrgName)) {
			System.out.println("Organization Name is Created");
		} else {
			System.out.println("Organization name not created");
		}
	}
}


