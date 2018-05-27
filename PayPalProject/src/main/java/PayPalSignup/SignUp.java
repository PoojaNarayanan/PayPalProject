package PayPalSignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.paypal.com/");
		driver.findElementById("signup-button").click();
		if(!driver.findElementById("radio-personal").isSelected())
		{
			driver.findElementById("radio-personal").click();
		}
		
		driver.findElementByLinkText("Next").click();
		WebElement country = driver.findElementById("country");
		Select cdd=new Select(country);
		cdd.selectByVisibleText("India");
		driver.findElementById("email").sendKeys("npooja.work@gmail.com");
		driver.findElementById("password").sendKeys("TestLeaf");
		driver.findElementById("confirmPassword").sendKeys("TestLeaf");
		driver.findElementById("_eventId_personal").click();
		driver.close();
		
		

	}

}
