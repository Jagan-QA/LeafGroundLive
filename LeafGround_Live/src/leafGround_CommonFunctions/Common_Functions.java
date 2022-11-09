package leafGround_CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common_Functions {

 public static Properties properties;
 public	static WebDriver driver;

	public Properties Load_Property_File() throws IOException {

		FileInputStream filein = new FileInputStream("config.properties");
	    properties = new Properties();
		properties.load(filein);
		return properties;

	}

	@BeforeSuite
	public void launch_Browser() throws IOException {
	Load_Property_File();
    String Browser=	properties.getProperty("Browser");
    String driverlocation = properties.getProperty("ChromeDriver_Location");
    System.out.println(Browser);
    System.out.println(driverlocation);
	if (Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverlocation);
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

	/*@AfterSuite
	public void TearDown() {
    driver.quit();
	}*/
}
