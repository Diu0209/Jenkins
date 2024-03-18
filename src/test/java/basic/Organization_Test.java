package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class Organization_Test
{
	@Test
	public void CreateOrganizationsTest() throws IOException, InterruptedException
	{
		
		
		
		PropertyFileUtil putil = new PropertyFileUtil();
		WebDriverUtil wutil = new WebDriverUtil();
		WebDriver driver = new ChromeDriver();
		
			
			//To maximize the window.(call method from WebDriverUtil class)
			wutil.Maximize(driver);
			
			
			//To read data from property file.
			String URL=putil.getDataFromPropertyFile("Url");
			
			//To read data from property file.
			String USER=putil.getDataFromPropertyFile("Username");
			
			//To read data from property file.
			String PASS=putil.getDataFromPropertyFile("Password");
			
			
			//To display url & enter the username & password from external property file.
			driver.get(URL);
			wutil.ImpliciteWait(driver);
			driver.findElement(By.name("user_name")).sendKeys(USER);
			driver.findElement(By.name("user_password")).sendKeys(PASS);
			Thread.sleep(4000);
			
			//To click on login button.
			driver.findElement(By.id("submitButton")).click();
			
	}
}
