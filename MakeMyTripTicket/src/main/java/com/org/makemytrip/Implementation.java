package com.org.makemytrip;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	static Resource re;

	Locators lo;



	@Given("^User is on makemytrip$")

	public void user_is_on_makemytrip() throws Throwable {

		re.getdriver("chrome");

	}



	@When("^User clicks login button and enters mobile number$")

	public void user_clicks_login_button_and_enters_mobile_number() throws Throwable {

		lo = new Locators();

		lo.getClicklogin().click();

		Thread.sleep(8000);

		lo.getClicklogin().click();

		lo.setTextusername("svadhanan.bk@gmail.com");

		Thread.sleep(8000);



	}



	@When("^click continue button$")

	public void click_continue_button() throws Throwable {



		lo.getClickcontinuebtn().click();

		Thread.sleep(8000);

		lo.getTextpassword().click();

		Thread.sleep(18000);



	}



	@When("^User enter the password$")

	public void user_enter_the_password() throws Throwable {

		lo.setTextpassword("Admin@123");

		Thread.sleep(18000);



	}



	@Then("^clicks login btn$")

	public void clicks_login_btn() throws Throwable {

		lo.getClickloginbutton().click();

	}



	@Then("^User enter the from city$")

	public void user_enter_the_from_city() throws Throwable {

		Thread.sleep(8000);

		lo.getSearchfromcity().click();

		Thread.sleep(8000);

		lo.setEntercity("MAA");

		Thread.sleep(8000);

		lo.getSelectfromcity().click();

		Thread.sleep(8000);

	}



	@Then("^User enter the to city$")

	public void user_enter_the_to_city() throws Throwable {

		 lo.getSelectto().click();

		

      Thread.sleep(8000);

      lo.setSearchtocity("BOM");

      Thread.sleep(8000);

      lo.getClicktocity().click();

	}

	

	@Then("^Click the Departuredate$")

	public void click_the_Departuredate() throws Throwable {

		Thread.sleep(8000);

	    lo.getDeparturedate().click();

	}

	

	@Then("^Click the return date$")

	public void click_the_return_date() throws Throwable {

		Thread.sleep(8000);

	    lo.getReturndate().click();

	    Thread.sleep(8000);

	    lo.getClicktodate().click();

	}

	@Then("^Click search button$")

	public void click_search_button() throws Throwable {

		 Thread.sleep(8000);

	   lo.getClicksearchbutton().click();

	}

}



