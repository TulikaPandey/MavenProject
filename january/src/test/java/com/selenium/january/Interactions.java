package com.selenium.january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions extends ReusableFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(3000);
		//Enter Username
			WebElement emailUserName = driver.findElement(By.id("email_field"));
			enterText(emailUserName, "admin123@gmail.com");
		//Enter Password
			WebElement password = driver.findElement(By.id("password_field"));
			enterText(password, "admin123");
		//Click on Login Button
			WebElement LoginButton = driver.findElement(By.xpath("//button[@onclick='login()']"));
			clickObject(LoginButton);
			Thread.sleep(5000);
		//Click on Home Button
			WebElement HomeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			clickObject(HomeTab);
		//Enter Name
			WebElement name = driver.findElement(By.xpath("//input[@placeholder='Your name..']"));
			enterText(name, "Tulika");
		//Enter  Fathername
			WebElement fathername = driver.findElement(By.xpath("//input[@id='lname']"));
			enterText(fathername, "Madhusudan");
	    //Enter  Postalcode
			WebElement postalcode = driver.findElement(By.xpath("//input[@placeholder='postal address..']"));
			enterText(postalcode, "560072");
		//Enter  Postalcode
			WebElement postaladdress = driver.findElement(By.xpath("//input[@id='personaladdress']"));
			enterText(postaladdress, "Bangaluru");
		//Click on Male/Female radio Button
			WebElement sexbutton = driver.findElement(By.xpath("//input[@value='female']"));
			clickObject(sexbutton);
		//Select City
			WebElement City = driver.findElement(By.id("city"));
			selectByIndex(City,2);
		//Select Course
			WebElement Course = driver.findElement(By.xpath("//select[@name='course']"));
			selectByIndex(Course,2);
	    //Select District
			WebElement District = driver.findElement(By.xpath("//select[@name='district']"));
			selectByIndex(District,2);
		//Select State
			WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
			selectByVisibleText(state,"UP");
	    //Enter pincode
			WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='pincode ..']"));
			enterText(pincode, "560071");
		//Enter email
			WebElement email = driver.findElement(By.xpath("//input[@id='emailid']"));
			enterText(email,"tulikapandey16@gmail.com");
		//Click on submitButton Button
			WebElement submitButton = driver.findElement(By.xpath("//button[@class='bootbutton']"));
			clickObject(submitButton);		
}
}


