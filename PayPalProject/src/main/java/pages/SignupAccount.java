package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignupAccount extends ProjectMethods{
	
	public SignupAccount()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="country")
	private WebElement CountryDD;
	
	public SignupAccount selectCountry()
	{
		selectDropDownUsingText(CountryDD,"India"); 
		return this;
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement email;
	
	public SignupAccount typeemail()
	{
		type(email,"npooja.work@gmail.com");
		return this;
	}
	
	
	@FindBy(how=How.ID,using="password")
	private WebElement password;
	
	public SignupAccount typepswd()
	{
		type(password,"TestLeaf");
		return this;
	}
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement cpassword;
	
	public SignupAccount typecpswd()
	{
		type(cpassword,"TestLeaf");
		return this;
	}
	
	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement submit;
	
	public SignupAccount clickSubmit()
	{
		click(submit);
		return this;
	}
	
	
}
