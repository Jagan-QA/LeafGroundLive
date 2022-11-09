package leafGround_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import leafGround_CommonFunctions.Common_Functions;
import leafGround_PageObjects.LeafGround_Home_PageObjects;

public class Dashboard extends Common_Functions {
    
	@Test
	public void Homeicon() {
		PageFactory.initElements(driver, LeafGround_Home_PageObjects.class);
		LeafGround_Home_PageObjects.HomePageicon.click();
		LeafGround_Home_PageObjects.Dashboard_Button.click();
	    String PageTitle=driver.getTitle();
	    System.out.println(PageTitle);
	    if(PageTitle.contains("Dashboard")) {
	    	System.out.println("You are landed on the Dashboard Page");
	    }
	    

	    	
	    }
	
	@Test
	public void ScrollTest() {
		
		PageFactory.initElements(driver, LeafGround_Home_PageObjects.class);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", LeafGround_Home_PageObjects.DataTable );
		//executor.executeScript("arguments[0].scrollIntoView(true);", HelpText);

				
		
	}
}
