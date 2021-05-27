package respositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	public RediffLoginPage(WebDriver driver) {
		
		
		this.driver=driver;
	}



	
	WebDriver driver;
	By name =By.name("login");
	By HomeLink = By.linkText("Home");
	
	
	
	public WebElement login()
	{
		return driver.findElement(name);
	}
	
	public WebElement HomeLink()
	{
		return driver.findElement(HomeLink);
	}
}



