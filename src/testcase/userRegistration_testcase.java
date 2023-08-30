package testcase;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.OrangeHRM_Login;
import OrangeHRM_page.userRegistration_page;
import UtilsDemo.AppUtils;

public class userRegistration_testcase extends AppUtils
{
	@Test
	public void userRegi() throws Throwable 
	{
	OrangeHRM_Login goud=PageFactory.initElements(driver, OrangeHRM_Login.class);
	goud.AdminLogin("Admin", "Qedge123!@#");
	
	userRegistration_page usergoud=PageFactory.initElements(driver,userRegistration_page .class);
	boolean uer = usergoud.userReg("ESS", "pravalika goud","chintu123", "Goud123!@#");
	Assert.assertTrue(uer);

	
	}
	

	
	





}
