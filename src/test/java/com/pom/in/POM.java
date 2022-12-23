package com.pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "pass")
	private WebElement pass;

	@FindBy(xpath = "//button[@type=\\\"submit\\\"]")
	private WebElement login;

	public POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
