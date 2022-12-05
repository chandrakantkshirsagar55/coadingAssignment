package com.test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imdb {

	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'December 17, 2021 (United States)')]")
	WebElement releseDate;
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/section[10]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement country;
	
	
	
	public String getIMDBDate()
	{
		String str=releseDate.getText();
		return str;
	}
	public String getCountry()
	{
		String str=country.getText();
		return str;
	}
	
	public imdb(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	
}
