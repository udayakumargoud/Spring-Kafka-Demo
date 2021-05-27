package respositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePage {
	
	public RediffHomePage(WebDriver driver)
	
	{
		
		this.driver=driver;
	}
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@class='homesrchbox']")
	WebElement searchbox;
	
	
	public WebElement searchbox()
	{
		return searchbox;
	}

}
