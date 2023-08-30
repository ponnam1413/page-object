package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRM_page.invalidlogin_page;
import UtilsDemo.AppUtils;

public class orangehrmlogin_with_invalide_data extends AppUtils
{
  
	@Test
	public void meth()
	{
		invalidlogin_page ponnam = PageFactory.initElements(driver,invalidlogin_page.class);
		ponnam.invalid("adbs","xyz");
		boolean br=ponnam.isErrMsgDisplayed();
		Assert.assertTrue(br);
	}
	
}
