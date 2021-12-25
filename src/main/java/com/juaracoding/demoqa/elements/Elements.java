package com.juaracoding.demoqa.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.demoqa.driver.DriverSingleton;

public class Elements {

	private WebDriver driver;
	
	public Elements( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnsingin;
		@FindBy(id = "email_create")
	private WebElement emailbox;
		@FindBy(id = "id_gender1")
	private WebElement radiogender;
		@FindBy(id = "SubmitCreate")
	private WebElement btncreate;
	//Isi Form
	@FindBy(id = "customer_firstname")
	private WebElement boxfirstname;
	@FindBy(id = "customer_lastname")
	private WebElement boxlastname;
	@FindBy(id = "passwd")
	private WebElement boxpass;
	@FindBy(id = "days")
	private WebElement tgl;
	@FindBy(id = "months")
	private WebElement bln;
	@FindBy(id = "years")
	private WebElement thn;
	@FindBy(id = "newsletter")
	private WebElement btnnews;
	@FindBy(id = "optin")
	private WebElement btnoption;
	@FindBy(id = "company")
	private WebElement boxcom;
	@FindBy(id = "address1")
	private WebElement boxalamat1;
	@FindBy(id = "address2")
	private WebElement boxalamat2;
	@FindBy(id = "city")
	private WebElement boxkota;
	@FindBy(id = "id_state")
	private WebElement boxcamat;
	@FindBy(id = "postcode")
	private WebElement boxpos;
	@FindBy(id = "id_country")
	private WebElement boxnegara;
	@FindBy(id = "other")
	private WebElement boxlain;
	@FindBy(id = "phone")
	private WebElement boxtlp;
	@FindBy(id = "phone_mobile")
	private WebElement boxhp;
	@FindBy(id = "submitAccount")
	private WebElement btnsubmit;
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement btndress;
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
	private WebElement pilihdress;
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement btnadd1;

	public void singin() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnsingin));
		btnsingin.click();
	}
	public void emailbox(String email_create) {
		emailbox.sendKeys(email_create);
		btncreate.click();
	}
	public void gender () {
		radiogender.click();
	}
	public void formTextBox(String customer_firstname, String customer_lastname, String passwd) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boxfirstname.sendKeys(customer_firstname);
		boxlastname.sendKeys(customer_lastname);
		boxpass.sendKeys(passwd);
		
		//autoscroll ke element tertentu
		//js.executeScript("arguments[0].scrollIntoView();", textboxPermanentAddress);
		//btnSubmit.click();
	}
	public void calender (String days ,String months , String years) {
		tgl.sendKeys(days);
		bln.sendKeys(months);
		thn.sendKeys(years);
			}
	public void option () {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnnews.click();
		btnoption.click();
		js.executeScript("arguments[0].scrollIntoView();", btnoption);
	}
	public void addres(String company ,String address1 , String address2 ,String city) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boxcom.sendKeys(company);
		boxalamat1.sendKeys(address1);
		boxalamat2.sendKeys(address2);
		boxkota.sendKeys(city);
	}	
	public void addres2(String id_state ,String postcode , String id_country ,String other) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boxcamat.sendKeys(id_state);
		boxpos.sendKeys(postcode);
		boxnegara.sendKeys(id_country);
		boxlain.sendKeys(other);
	}	
	public void kontak(String phone ,String phone_mobile ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boxtlp.sendKeys(phone);
		boxhp.sendKeys(phone_mobile);
		btnsubmit.click();
	}
	public void addcart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		btndress.click();
	
		pilihdress.click();
		js.executeScript("windows.scrollBy(100,500)");
		
	}
}
	
	
	
	
	
	
	
	
	


