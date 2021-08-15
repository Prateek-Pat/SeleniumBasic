package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion {
	
		
	@Test
	public void validate_Ecomm_App()
	{
		System.out.println("Open Browser");
		System.out.println("Enter url");
		//Assert.assertEquals(true, false);//Since applied assertion is false, Hence it won't execcute fruther stesp.
		Assert.assertEquals(true, true); // Since applied assertion is true, Hence it will execcute fruther stesp as well
		
		System.out.println("Enter username");
		System.out.println("Enter Password");
		System.out.println("Click on Singin Button");
		//Assert.assertEquals(false, true); 
		Assert.assertEquals(true, true); 
		
		System.out.println("User landed on homepage");
		System.out.println("User is able to search product");
		//Assert.assertEquals(false, true);
		Assert.assertEquals(true, true);
		
		System.out.println("User is able to add product to cart");
		System.out.println("User is able to make payment");
		System.out.println("Order number is generated");
		Assert.assertEquals(true, true);
		
	}
	
}

