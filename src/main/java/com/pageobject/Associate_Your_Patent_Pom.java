package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Associate_Your_Patent_Pom {
	
	@FindBy(how=How.XPATH,using="//button[@id='details-button']")
	private WebElement Advance_button;

	@FindBy(how=How.XPATH,using="//a[@id='proceed-link']")
	private WebElement link;
	
	@FindBy(how=How.XPATH,using="//a[text()='Accept']")
	private WebElement accept;
	
	@FindBy(how=How.XPATH,using="//input[@id='_username']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='_password']")
	private WebElement txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit'][1]")
	private WebElement txt_Login_Search_button;
	
	@FindBy(how=How.XPATH,using="(//img[@class='img-fluid'])[1]")
    private WebElement txt_FRANDAVANUE_main_button;
	
	@FindBy(how=How.XPATH,using="//a[text()='Your Patents']")
    private WebElement YourPatent;
	
	@FindBy(how=How.XPATH,using="//span[text()='Associate patents to your account']")
    private WebElement AsociatePatent;
	
	@FindBy(how=How.XPATH,using="(//button[text()='Click here to select your files'])[1]")
    private WebElement File;
	
	@FindBy(how=How.XPATH,using="(//button[text()='Click here to select your files'])[2]")
    private WebElement File2;
	
	

	public WebElement getFile2() {
		return File2;
	}

	public WebElement getFile() {
		return File;
	}

	public WebElement getAsociatePatent() {
		return AsociatePatent;
	}

	public WebElement getYourPatent() {
		return YourPatent;
	}

	public WebElement getAdvance_button() {
		return Advance_button;
	}

	public WebElement getLink() {
		return link;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_pass() {
		return txt_pass;
	}

	public WebElement getTxt_Login_Search_button() {
		return txt_Login_Search_button;
	}

	public WebElement getTxt_FRANDAVANUE_main_button() {
		return txt_FRANDAVANUE_main_button;
	}
	

}
