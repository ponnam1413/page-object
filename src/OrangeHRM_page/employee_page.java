package OrangeHRM_page;

import java.sql.Driver;
import java.util.List;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;

import UtilsDemo.AppUtils;

public class employee_page extends AppUtils
{
	//create object repository
	@FindBy(linkText = "PIM")
	WebElement pim_element;

	@FindBy(linkText = "Add Employee")
	WebElement add_employee;

	@FindBy(id =  "firstName")
	WebElement firstname_element;

	@FindBy(id = "lastName")
	WebElement lastname_element;
	
	@FindBy(name ="employeeId")
	WebElement emp_id;

	@FindBy(id="empsearch_id")
	WebElement empid_element;

	@FindBy(id ="btnSave")
	WebElement save_element;

	@FindBy(linkText = "Employee List")
	WebElement emplist_element;

	@FindBy(id = "searchBtn")
	WebElement search_button;


	public boolean empRegistration(String fname,String lname) throws Throwable
	{
		pim_element.click();
		add_employee.click();
		firstname_element.sendKeys(fname);
		lastname_element.sendKeys(lname);

		String ponnam=emp_id.getAttribute("value");
		Thread.sleep(2000);
		save_element.click();
		emplist_element.click();
		empid_element.sendKeys(ponnam);
		search_button.click();


		WebElement restable;

		restable=	driver.findElement(By.id("resultTable"));

		List<WebElement>rows= restable.findElements(By.tagName("tr"));


		boolean  isdisplayed=false;

		for(int i=1;i<=rows.size();i++)

		{

			List<WebElement>colm=rows.get(i).findElements(By.tagName("td"));
			if(colm.get(1).getText().equals(ponnam))
			{
				return true;	
			}else
			{

				return false;
			}
		}
		return isdisplayed;
	}


}
