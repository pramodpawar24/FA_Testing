package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home__Page_POM {
	
	//Login functionality

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
	

	@FindBy(how=How.XPATH,using="//label[text()='Patents']")
	private WebElement txt_patent;

	@FindBy(how=How.XPATH,using="(//button[@class='btn btn3 parent-search'])[1]")
	private WebElement txt_Patent_search;	
		
	@FindBy(how=How.XPATH,using="(//div[@class='mt-auto']/a)[1]")
    private WebElement txt_View_this_Patent_search;	
	
	@FindBy(how=How.XPATH,using="//label[text()='Portfolios']")
	private WebElement txt_Portfolio;
		
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[2]")
	private WebElement txt_Portfolio_Search;	
	
	@FindBy(how=How.XPATH,using="//label[text()='Licensing Programs']")
	private WebElement txt_LP;
	
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[4]")
	private WebElement txt_LP_Search;
	
	@FindBy(how=How.XPATH,using="//label[text()='Members']")
	private WebElement txt_member;

	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[3]")
	private WebElement txt_member_Search;
		
	@FindBy(how=How.XPATH,using="//label[text()='Experts']")
	private WebElement txt_expert;
		
	@FindBy(how=How.XPATH,using="(//button[@type='submit'])[5]")
	private WebElement txt_Expert_search;
	
	@FindBy(how=How.XPATH,using="(//div[@class='mt-auto']/a)[4]")
	private WebElement View_This_Profile_Expert;

	
    @FindBy(how=How.XPATH,using="(//img[@class='img-fluid'])[1]")
    private WebElement txt_FRANDAVANUE_main_button;	
		
	@FindBy(how=How.XPATH,using="//input[@id='patentSearch_publicationNumber']")
    private WebElement txt_Publication_number;	
		
    @FindBy(how=How.XPATH,using="(//button[@type='submit'])[1]")
    private WebElement Publication_Search_Button;	
		
   @FindBy(how=How.XPATH,using="//a[text()='US2001046220A1']")
	private WebElement View_This_Patent_button;	
	
	@FindBy(how=How.XPATH,using="//a[text()='Insights Graphs']")
	private WebElement Insight;	
	

	@FindBy(how=How.XPATH,using="(//input[@id='countDependencies'])[1]")
	private WebElement Application_Tab;	
	

	@FindBy(how=How.XPATH,using="//a[@class='btn btn-info btn-info btn btn-primary shadow-none btn-sm insight-viewresult']")
	private WebElement View_search_result_Page;	
	

	@FindBy(how=How.XPATH,using="//a[@class='btn btn-info btn_insight_patent shadow-none btn-sm insight_button']")
	private WebElement back_insight_button;	
			
	@FindBy(how=How.XPATH,using="//span[@class='text-right float-right px-1']")
	private WebElement Filter_button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[2]")
	private WebElement Xtool_Button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[4]")
	private WebElement Negotiation_Terms_button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[5]")
	private WebElement Access_request_Button;

	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[6]")
	private WebElement Inbox_Button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[7]")
	private WebElement Template_button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[8]")
	private WebElement Your_patent_button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[9]")
	private WebElement Your_Portfolio_Button;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[10]")
	private WebElement Your_Licensing_Program;
	
	@FindBy(how=How.XPATH,using="(//a[@class='text-black'])[11]")
	private WebElement Your_Save_result;
	
	
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
		
	public WebElement getTxt_patent() {
		return txt_patent;
	}

	public WebElement getTxt_Patent_search() {
		return txt_Patent_search;
	}
	
	public WebElement getTxt_Portfolio() {
		return txt_Portfolio;
	}

	public WebElement getTxt_Portfolio_Search() {
		return txt_Portfolio_Search;
	}

	public WebElement getTxt_LP() {
		return txt_LP;
	}

	public WebElement getTxt_LP_Search() {
		return txt_LP_Search;
	}

	public WebElement getTxt_member() {
		return txt_member;
	}

	public WebElement getTxt_member_Search() {
		return txt_member_Search;
	}

	public WebElement getTxt_expert() {
		return txt_expert;
	}

	public WebElement getTxt_Expert_search() {
		return txt_Expert_search;
	}

	public WebElement getView_This_Profile_Expert() {

		return View_This_Profile_Expert;
	}
			
	public WebElement getTxt_FRANDAVANUE_main_button() {
		return txt_FRANDAVANUE_main_button;
	}

	public WebElement getTxt_Publication_number() {
		return txt_Publication_number;
	}

	public WebElement getPublication_Search_Button() {
		return Publication_Search_Button;
	}

	public WebElement getView_This_Patent_button() {
		return View_This_Patent_button;
	}
		
	// Insight Page 
	
    public WebElement getInsight() {
		return Insight;
	}
	
    public WebElement getApplication_Tab() {
		return Application_Tab;
	}

	public WebElement getView_search_result_Page() {
		return View_search_result_Page;
	}
	
    public WebElement getBack_insight_button() {
		return back_insight_button;
	}

	public WebElement getFilter_button() {
		return Filter_button;
	}

	public WebElement getXtool_Button() {
		return Xtool_Button;
	}
	
	public WebElement getNegotiation_Terms_button() {
		return Negotiation_Terms_button;
	}

	public WebElement getAccess_request_Button() {
		return Access_request_Button;
	}

	public WebElement getInbox_Button() {
		return Inbox_Button;
	}

	public WebElement getTemplate_button() {
		return Template_button;
	}

	public WebElement getYour_patent_button() {
		return Your_patent_button;
	}

	public WebElement getYour_Portfolio_Button() {
		return Your_Portfolio_Button;
	}

	public WebElement getYour_Licensing_Program() {
		return Your_Licensing_Program;
	}

	public WebElement getYour_Save_result() {
		return Your_Save_result;
	}
		
}
