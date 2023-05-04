package com.example.ca1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question3{

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String Title=driver.getTitle();
		System.out.println(Title);
		String newTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(Title.equals(newTitle)) {
			System.out.println("The title matches with the newtitle");
		}
		else {
			System.out.println("The title matches with the newtitle");
		}
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		box1.sendKeys("6380822814");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		box2.sendKeys("Ananyaa*06");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ordersInPackage-container\"]/div/div/a[1]")).click();
	}
}

