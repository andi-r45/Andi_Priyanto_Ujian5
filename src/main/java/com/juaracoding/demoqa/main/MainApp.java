package com.juaracoding.demoqa.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.juaracoding.demoqa.driver.DriverSingleton;
import com.juaracoding.demoqa.elements.Elements;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();	
		driver.get("http://automationpractice.com/");
		Elements elements = new Elements();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver ;
		//js.executeScript("windows.scrollBy(0,500)");
		//WebElement pagelogin = driver.findElement(By.xpath("//a[@class='login']"));
		//	pagelogin.click();
		
		elements.singin();
		elements.emailbox("sa1tt2779dd77d@mail.com");

		elements.gender();
		elements.formTextBox("Andi","Priyanto", "Sandi123");
		elements.calender("11", "April", "1995");
		elements.option();
		elements.addres("JuaraCode", "Rangkapan", "Pancoran Mas", "Depok");
		elements.addres2("Arizona", "00000", "United States", "Nothing !!!!");
		elements.kontak("02122334455", "081233445566");
		elements.addcart();
		}
}
