package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.RunPage;


public class TC_001 extends BaseClass{
	
	@Test
	public void test1() {
		
		
		RunPage run = new RunPage(driver);
		
		run.clickRunBotton();
		Assert.assertTrue(run.checkOutputWindowTextIsDisplayed());
		
		
		
		
	}

}
