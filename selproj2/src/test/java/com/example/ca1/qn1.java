package com.example.ca1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qn1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("6380822814");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
	}

}

//WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
//addtocart.click();
//Thread.sleep(5000);
//WebElement cartbutton=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
//cartbutton.click();
//Thread.sleep(5000);
//WebElement proceedtobuy=driver.findElement(By.name("proceedToRetailCheckout"));
//proceedtobuy.click();
//System.out.print("Sucessfully placed order");