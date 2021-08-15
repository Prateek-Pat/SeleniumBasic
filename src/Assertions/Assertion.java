package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	SoftAssert sassert = new SoftAssert();
	
	@Test(priority =1)
	public void validate_Open_Browser()
	{
		System.out.println("Open Browser");
		System.out.println("Enter Url");
		Assert.assertEquals(true, false);
		//Assert.assertEquals(true, true);
	}
	
	@Test(priority =2)
	public void validaate_Paytm_Login()
	{
		System.out.println("User is logedIn");
		//Assert.assertEquals(true, false);
		Assert.assertEquals(true, true);
	}
	
	@Test(priority =3)
	public void validate_Dashboard()
	{
		System.out.println("User landed on dashboard");
		sassert.assertEquals(true, false, "Landed to different dashboard");
		
		sassert.assertAll();
	}
	
	@Test(priority =4)
	public void validate_SellerDashboard()
	{
		System.out.println("Lnaded on seller dashboard");
		sassert.assertEquals(true, false, "Landed on seller dashboard");
		
		sassert.assertAll();
	}
	
	@Test(priority =5)
	public void validate_ProductAddded()
	{
		System.out.println("Seller added product in Ecomm site");
		System.out.println("Seller updated product price list");
		sassert.assertEquals(true, true);
		
		sassert.assertAll();
	}	
}
