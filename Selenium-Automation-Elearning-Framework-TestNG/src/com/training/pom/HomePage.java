package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver; 
	
	public HomePage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/rs-module-wrap[1]/rs-module[1]/rs-arrow[2]")
	private WebElement crausels; 
	
	@FindBy(xpath="//h2[contains(text(),'EXPERIENCE KARNATAKA')]")
	private WebElement experience;
	
	@FindBy(css="h2[css=\"1\"]")
	private WebElement latestInkar;
	
	@FindBy(partialLinkText="CLICK HE")
	private WebElement adoptmonum;
	
	@FindBy(css="a[xpath=\"1\"]")
	private WebElement destinations;
	
	@FindBy(xpath="//h2[contains(text(),'EXPLORE KARNATAKA')]")
	private WebElement exploreKar;
	
//	@FindBy(id="password")
//	private WebElement password;
//	
//	@FindBy(id="formLogin_submitAuth")
//	private WebElement loginBtn; 
	
//	public void sendUserName(String userName) {
//		this.userName.clear();
//		this.userName.sendKeys(userName);
//	}
//	
	public void crausels () {
		crausels.click();
	}
	
	public void experience () {
		System.out.println(experience.getText());
	}
	
	public void latestInkar () {
		System.out.println(latestInkar.getText());
	}
	
	public void adoptmonum () {
		
		adoptmonum.click();
	}
	
	public void destinations () {
		destinations.click();
	}
	
	public void exploreKar () {
		System.err.print(exploreKar.getText());
	}
	
	
//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
//	
//	public void clickLoginBtn() {
//		this.loginBtn.click(); 
//	}
}
