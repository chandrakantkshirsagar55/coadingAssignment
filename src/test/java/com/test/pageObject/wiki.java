package com.test.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class wiki {
WebDriver driver;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	WebElement releseDate;
	@FindBy(xpath="//td[contains(text(),'India')]")
	WebElement country;
	
	
	
	public String getWikiDate()
	{
		String str=releseDate.getText();
		return str;
	}
	public String getWikiCountry()
	{
		String str=country.getText();
		return str;
	}
	
	public wiki(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	

}
