package OrangeHRM_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UtilsDemo.AppUtils;


public class OrangeHRM_Login extends AppUtils
{

	//create object repository
	@FindBy(id = "txtUsername")
	WebElement uid_element;

	@FindBy(id = "txtPassword")
	WebElement pwd_element;

	@FindBy(id = "btnLogin")
	WebElement login_link;

	@FindBy(partialLinkText = "Welcome")
	WebElement welcome_link;

	@FindBy(linkText = "Logout")
	WebElement logout_link;

	@FindBy(linkText = "Admin")
	WebElement Admin_link;

	public void AdminLogin(String uid,String pwd)
	{
		uid_element.sendKeys(uid);
		pwd_element.sendKeys(pwd);
		login_link.click();
	}

	public boolean isAdminModuleDisplay() 
	{
		if(Admin_link.isDisplayed())
		{
			return true;
		}
		else
			return false;	
	}
	
	public void logout()
	{
		welcome_link.click();
		logout_link.click();
	}	
	
	}




