package com.appium.calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator_01 {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("udid", "86e1d6350304");
		capabilities.setCapability("deviceName", "Redmi");
		capabilities.setCapability("appPackage", "com.miui.calculator");
		capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

		URL url =new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver(url,capabilities);
		
		System.out.println("Opened");
		
		
		WebElement One =driver.findElement(By.id("com.miui.calculator:id/btn_1_s"));
		WebElement four =driver.findElement(By.id("com.miui.calculator:id/btn_4_s"));
		WebElement equals =driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		WebElement plus =driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		
		One.click();plus.click();four.click();
		equals.click();
	}

}
