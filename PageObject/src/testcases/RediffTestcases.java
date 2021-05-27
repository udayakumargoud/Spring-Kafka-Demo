package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import respositories.RediffHomePage;
import respositories.RediffLoginPage;

public class RediffTestcases {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rl = new RediffLoginPage(driver);
		rl.login().sendKeys("hello");
		rl.HomeLink().click();
		
		RediffHomePage rh = new RediffHomePage(driver);
		
		rh.searchbox().sendKeys("Uday");
		
		Select s = new Select(null);
		driver.switchTo().alert().accept();
		Actions act = new Actions(driver);
		
		
//		driver.getWindowHandle()
		
		

	}

}
