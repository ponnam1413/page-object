package OrangeHRM_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import UtilsDemo.AppUtils;

public class userRegistration_page extends AppUtils
{

	@FindBy(linkText ="Admin" )
	WebElement Admin_element;

	@FindBy(id="btnAdd")
	WebElement add_element;

	@FindBy(id="systemUser_userType")
	WebElement role_link;

	@FindBy(id="systemUser_employeeName_empName")
	WebElement empid_element;

	@FindBy(id="systemUser_userName")
	WebElement username_element;

	@FindBy(id="systemUser_password")
	WebElement password_element;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmpassword_element;

	@FindBy(id = "btnSave")
	WebElement save_element;

	@FindBy(id="searchBtn")
	WebElement search_element;

	@FindBy(id="searchSystemUser_userName")
	WebElement username_element1;

	public boolean userReg(String role, String empname,String uname,String password) throws InterruptedException
	{
		Admin_element.click();
		add_element.click();  
		Select ss=new Select(role_link);
		ss.selectByVisibleText(role);
		
		empid_element.sendKeys(empname);
		username_element.sendKeys(uname);
		password_element.sendKeys(password);
		confirmpassword_element.sendKeys(password);
		Thread.sleep(1000);
		save_element.click();
		username_element1.sendKeys(uname);
		search_element.click();


		WebElement restb;
		restb= driver.findElement(By.id("resultTable"));
		List<WebElement>tr=restb.findElements(By.tagName("tr"));

		boolean result=false;
		for(int i=1;i<=tr.size();i++)
		{

			List<WebElement>cols=tr.get(i).findElements(By.tagName("td")) ; 
			if(cols.get(i).getText().equals(uname))
			{
				result=true;
				break;
			}
		}
		return result;

	}
}
