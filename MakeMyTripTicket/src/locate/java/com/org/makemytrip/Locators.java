package com.org.makemytrip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Resource {


	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")

	private WebElement clicklogin;

	

	@FindBy(xpath = "//input[@id='username']")

	private WebElement textusername;



	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")

	private WebElement clickcontinuebtn;

	

	@FindBy(xpath="//input[@id='password']")

	private WebElement textpassword;

	

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")

	private WebElement clickloginbutton;

	

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")

	private WebElement searchfromcity;

	

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")

	private WebElement entercity;

	

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]")

	private WebElement selectfromcity;

	

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")

	private WebElement selectto;

	

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")

	private WebElement searchtocity;

	

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]")

	private WebElement clicktocity;

	

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]")

	private WebElement departuredate;



	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]")

	private WebElement returndate;

	

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[5]")

	private WebElement clicktodate;

	

	@FindBy(xpath = "//a[contains(text(),'Search')]")

	private WebElement clicksearchbutton;

	

	public WebElement getClicklogin() {

		return clicklogin;

	}



	public void setClicklogin(WebElement clicklogin) {

		this.clicklogin = clicklogin;

	}



	public WebElement getTextusername() {

		return textusername;

	}



	public void setTextusername(String textusername) {

		this.textusername.sendKeys(textusername);

	}



	public WebElement getClickcontinuebtn() {

		return clickcontinuebtn;

	}



	public void setClickcontinuebtn(WebElement clickcontinuebtn) {

		this.clickcontinuebtn = clickcontinuebtn;

	}



	public WebElement getTextpassword() {

		return textpassword;

	}



	public void setTextpassword(String textpassword) {

		this.textpassword.sendKeys(textpassword);

	}



	public WebElement getClickloginbutton() {

		return clickloginbutton;

	}



	public void setClickloginbutton(WebElement clickloginbutton) {

		this.clickloginbutton = clickloginbutton;

	}

	

	public WebElement getSearchfromcity() {

		return searchfromcity;

	}



	public void setSearchfromcity(WebElement searchfromcity) {

		this.searchfromcity = searchfromcity;

	}



	public WebElement getEntercity() {

		return entercity;

	}



	public void setEntercity(String entercity) {

		this.entercity.sendKeys(entercity);

	}



	public WebElement getSelectfromcity() {

		return selectfromcity;

	}



	public void setSelectfromcity(WebElement selectfromcity) {

		this.selectfromcity = selectfromcity;

	}



	public WebElement getSelectto() {

		return selectto;

	}



	public void setSelectto(WebElement selectto) {

		this.selectto = selectto;

	}



	public WebElement getSearchtocity() {

		return searchtocity;

	}



	public void setSearchtocity(String searchtocity) {

		this.searchtocity.sendKeys(searchtocity);

	}



	public WebElement getClicktocity() {

		return clicktocity;

	}



	public void setClicktocity(WebElement clicktocity) {

		this.clicktocity = clicktocity;

	}

	

	public WebElement getDeparturedate() {

		return departuredate;

	}



	public void setDeparturedate(WebElement departuredate) {

		this.departuredate = departuredate;

	}

	

	public WebElement getReturndate() {

		return returndate;

	}



	public void setReturndate(WebElement returndate) {

		this.returndate = returndate;

	}

	

	public WebElement getClicktodate() {

		return clicktodate;

	}



	public void setClicktodate(WebElement clicktodate) {

		this.clicktodate = clicktodate;

	}

	

	public WebElement getClicksearchbutton() {

		return clicksearchbutton;

	}



	public void setClicksearchbutton(WebElement clicksearchbutton) {

		this.clicksearchbutton = clicksearchbutton;

	}

	

	public Locators() {

		PageFactory.initElements(driver, this);

	}

	

	

	

	

}