package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation_Navigation_Page {
	public Organisation_Navigation_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[alt=\"Create Organization...\"]")
	private WebElement orgPlusSign;

	public WebElement getOrgPlusSign() {
		return orgPlusSign;
	}

	public void clickOrgnization() {
		orgPlusSign.click();
	}

}


