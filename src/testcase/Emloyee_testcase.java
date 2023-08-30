package testcase;

import org.apache.poi.xssf.usermodel.examples.FillsAndColors;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.OrangeHRM_Login;
import OrangeHRM_page.employee_page;
import UtilsDemo.AppUtils;




public class Emloyee_testcase extends AppUtils
{
	@Test	
	public void addemp() throws Throwable 
	{
		OrangeHRM_Login san =PageFactory.initElements(driver,OrangeHRM_Login.class);
		san.AdminLogin("Admin","Qedge123!@#");
		
		employee_page ponnam=PageFactory.initElements(driver, employee_page.class);
		boolean br=ponnam.empRegistration("pravalika"," goud");
		Assert.assertTrue(br);
		
		
		
	}
}