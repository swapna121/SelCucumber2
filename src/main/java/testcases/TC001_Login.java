package testcases;

import org.junit.Test;

import cucumber.api.java.Before;

//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;


public class TC001_Login extends ProjectMethods{

	@Before
	public void setData() {
		testCaseName="TC001_Login";
		testDescription="Login to Flipkart";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Gopi";
	}

	@Test
	public void createLead()
		{
		new LoginPage();  
		}

	
			
}
