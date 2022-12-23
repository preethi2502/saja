package com.base.in;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
   
	public static WebDriver driver; // null driver

	public static WebDriver getBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN\\eclipse-workspace\\new\\AAProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "//Firefoxdriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid check the browser name ");
		}
		driver.manage().window().maximize();

		return driver; // chrome
	}

	// close //driver
	public static void closethepage() {
		driver.close();
	}

	// quit
	public static void exitpage() {
		driver.quit();

	}

	// get ( driver, String )
	public static void openUrl(String url) {
		driver.get(url);
	}

	// action (driver, element )
	public static void rightclick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.contextClick(ele).build().perform();
	}

	public static void screenshot(String name) {
		// File dest = new File(name);
	}

	// wait ( time )
	public static void iWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	// click ( element )
	public static void clickonelement(WebElement ele) {
		ele.click();
	}

	// sendkeys ( string, ele)
	public static void enterkeys(WebElement ele, String str) {
		ele.sendKeys(str);
	}

	// getText
	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}

	// dropdown webelement, string , string

	public static void dropDown(WebElement ele, String type, String i) {
		Select s = new Select(ele);
		if (type.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));
		}

		else if (type.equals("value")) {
			s.selectByValue(type);

		}

		else if (type.equals("text")) {
			s.selectByVisibleText(type);
		}
	}

}
