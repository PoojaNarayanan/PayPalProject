package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountSelection extends ProjectMethods {

	public AccountSelection()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement selectShopper;
	
	public AccountSelection selectRadioShopper()
	{
		if(verifySelected(selectShopper))
	     {
	    	 click(selectShopper);
	     }
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement NextBtn;
	
	public SignupAccount clickNextBtn()
	{
		click(NextBtn);
		return new SignupAccount();
	}
	
	
}
