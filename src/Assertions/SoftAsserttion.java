package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserttion {

	SoftAssert soft = new SoftAssert();  
	
	@Test
	public void validate_Flight_booking()
	{
		
		System.out.println("Open Browser");
		System.out.println("Enter url");
		//Assert.assertEquals(true, false);//Since applied assertion is false, Hence it won't execcute fruther stesp.
		//Assert.assertEquals(true, true); // Since applied assertion is true, Hence it will execcute fruther stesp as well
		
		System.out.println("Enter username");
		System.out.println("Enter Password");
		System.out.println("Click on Singin Button");
		soft.assertEquals(true, false, "Unable to click on Login");
		 	
		System.out.println("User landed on homepage");
		System.out.println("User is able to search product");
		soft.assertEquals(true, false, "Unable to search product");// Even when the assertions is failed softAssertexecuting and passing all cases
		
		//soft.assertAll(); // Since we applied this asertion here just before last test it'll not include below test in result
		
		System.out.println("User is able to add product to cart");
		System.out.println("User is able to make payment");
		System.out.println("Order number is generated");
		
		soft.assertAll();// this assert should be applied after all the test in one method for proper verification
	}	
}
