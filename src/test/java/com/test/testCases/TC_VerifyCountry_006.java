package com.test.testCases;

import org.testng.annotations.Test;

import com.test.pageObject.imdb;
import com.test.pageObject.wiki;

import junit.framework.Assert;

public class TC_VerifyCountry_006 extends BaseClass {
	
	@Test
	void pushpa() throws InterruptedException
	{
		
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		
		imdb a=new imdb(driver);
		String originCountry=a.getCountry();
		String dateOfRelease=a.getIMDBDate();
		System.out.println(originCountry);
		System.out.println(dateOfRelease);
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
		
		wiki b=new wiki(driver);
		String originCountryW=b.getWikiCountry();
		String dateOfReleaseW=b.getWikiDate();
		System.out.println(originCountryW);
		System.out.println(dateOfReleaseW);
		
		Assert.assertEquals(originCountry, originCountryW);
		Assert.assertEquals(dateOfRelease, dateOfReleaseW);

		

	}

}
