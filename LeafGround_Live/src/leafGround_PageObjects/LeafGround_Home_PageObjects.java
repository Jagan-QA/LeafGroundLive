package leafGround_PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeafGround_Home_PageObjects {
	
	
	@FindBy(xpath="//li[@id='menuform:j_idt38']")
	public static WebElement HomePageicon;
	
	@FindBy(xpath="//li[@id='menuform:m_dashboard']//child::a[1]")
	public static WebElement Dashboard_Button;
	
	@FindBy(xpath="//span[text()='Data Table']")
	public static WebElement DataTable;
	

}
