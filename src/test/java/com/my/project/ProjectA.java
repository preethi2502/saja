package com.my.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.in.Baseclass;
import com.pom.in.POM;

public class ProjectA extends Baseclass {

	public static WebDriver driver; // null driver

	public static void main(String[] args) {
		driver = getBrowser("chrome");

		POM pom = new POM(driver);

		openUrl("https://www.facebook.com/");

		enterkeys(pom.getEmail(), "preethi@gmail.com");

		enterkeys(pom.getPass(), "645564afKJAEHB");

		clickonelement(pom.getLogin());

		exitpage();

	}

}
