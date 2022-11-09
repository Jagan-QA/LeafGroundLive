package leafGround_TestCases;

import java.util.Properties;

import org.testng.annotations.Test;

import leafGround_CommonFunctions.Common_Functions;

// Go to LeafGround Website
public class Launch_Leafground extends Common_Functions {
    @Test
	public void LaunchLeaf_Ground() {
	String leafGroundsite=	properties.getProperty("Site_URL");
	System.out.println(leafGroundsite);
	driver.get(leafGroundsite);
		
	}
	
}
