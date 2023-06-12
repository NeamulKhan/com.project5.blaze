package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass_project5 {
	
public static Properties project5_prop;
	
	public static WebDriver driver;
	
	public BaseClass_project5() {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\project5\\blaze\\config\\com.project5.blaze.Properties " );
			
			project5_prop = new Properties();
			
			project5_prop.load(files);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
public void blazebrowserinit() {
		
		String blazebrowser = project5_prop.getProperty("Browser1");
		
		if (blazebrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData_project5.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData_project5.pageLoadwait));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
						
		}
		
		else if (blazebrowser.equalsIgnoreCase("FireFox")) {
			
		}
		
	}
	
	public void launchURL(String URL) {
		
		driver.get(project5_prop.getProperty("URL"));
		
	}
	}



