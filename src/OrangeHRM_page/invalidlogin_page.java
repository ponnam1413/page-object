package OrangeHRM_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UtilsDemo.AppUtils;

public class invalidlogin_page extends AppUtils
{
	
	//creating object repository
	 
	@FindBy(id = "txtUsername")
	WebElement uid_element;
	
	@FindBy(id ="txtPassword")
	WebElement pwd_element;
	
	@FindBy(id = "btnLogin")
	WebElement login_element;
	
	@FindBy(id ="spanMessage" )
	WebElement error_element;
	
	public void invalid(String uid,String pwd)
	{
		
	uid_element.sendKeys(uid);	
	pwd_element.sendKeys(pwd);
    login_element.click();
	}	

    public boolean isErrMsgDisplayed()
    {
	String ponnam = error_element.getText();
	if(ponnam.toLowerCase().contains("invalid")||ponnam.toLowerCase().contains("empty"))
	{
    	
    return true;
    
	}else
		
		return false;
    }

    
    
    
    
		
		
	
	
	
	
	
}
