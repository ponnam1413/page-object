package testcase;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.OrangeHRM_Login;
import UtilsDemo.AppUtils;

public class LoginWithValidData extends AppUtils
{
	@Test
	public void validData()
	{
	
		
		
		
		OrangeHRM_Login lp = PageFactory.initElements(driver,OrangeHRM_Login.class);
		lp.AdminLogin("Admin", "Qedge123!@#");
	boolean res =	lp.isAdminModuleDisplay();
		Assert.assertTrue(res);
		lp.logout();
		
		
	}	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*OrangeHRM_Login lp = PageFactory.initElements(driver,OrangeHRM_Login.class);
		
		lp.AdminLogin("Admin","Qedge123!@#");
          lp.
		
		
		
		
		
		Assert.assertTrue(res);
		lp.logout();
	}
}*/

		
		
		
		
		
		
		
		
		
		
		
		