package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;



public class TC001_Signup extends ProjectMethods{

	@Test
	public void loginAndLogout() {
		try
		{
		new HomePage()
		.clickSignup()
		.selectRadioShopper()
		.clickNextBtn()
		.selectCountry()
		.typeemail()
		.typepswd()
		.typecpswd()
		.clickSubmit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
