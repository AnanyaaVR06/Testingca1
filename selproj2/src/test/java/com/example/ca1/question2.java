package com.example.ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String firsttitle=driver.getTitle();
		System.out.println(firsttitle);
		String newTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(firsttitle.equals(newTitle)) {
			System.out.println("The firstTitle matches with newTitle");
		}
		else {
			System.out.println("The firstTitle doesn't matches with newTitle");
		}
		WebElement text1=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		text1.sendKeys("macbook");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String textone=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(textone);
		String texttwo=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(texttwo);
		String textthree=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(textthree);
		String textfour=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(textfour);
		String textfive=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(textfive);
		//filter
		driver.findElement(By.xpath("//*[@id=\"p_36/7252032031\"]/span/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"p_n_pattern_browse-bin/1464446031\"]/span/a/span")).click();
	}
}

