package PayPalSignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class SignupWithSeMethods extends ProjectMethods {
	@Test
	public void SignupPayPal()
	{
	    //startApp("chrome","https://www.paypal.com/");	
	    click(locateElement("id","signup-button"));
	     if(verifySelected(locateElement("id","radio-personal")))
	     {
	    	 click(locateElement("id","radio-personal"));
	     }
		click(locateElement("link","Next"));
		
		
		
		selectDropDownUsingText(locateElement("id","country"),"India");
		type(locateElement("id","email"),"npooja.work@gmail.com");
		type(locateElement("id","password"),"password");
		type(locateElement("id","confirmPassword"),"TestLeaf");
		click(locateElement("_eventId_personal"));
		
		
		
		
	}

}
