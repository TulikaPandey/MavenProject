package com.selenium.january;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
static ExtentReports extent;
static ExtentTest homeTest;


	public static void main(String[] args) throws InterruptedException {
		 extent = new ExtentReports (System.getProperty("user.dir")+"/test-output/HomeExtentReport.html", true);
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
        homeTest = extent.startTest("launch Test");
		//WebDriverWait wait = new WebDriverWait (driver, 40);
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		System.out.println("Application Launched Sucessfully");
		Thread.sleep(5000);

		//Enter the UserName
		WebElement emailuserName = driver.findElement(By.id("email_field"));
		emailuserName.sendKeys("admin123@gmail.com");
		Thread.sleep(3000);
		homeTest.log(LogStatus.PASS, "username entered Successfully");
		//Enter the Password
		WebElement password = driver.findElement (By.id("password_field"));
		password.clear();
		password. sendKeys("admin123");
		Thread.sleep(3000);
		homeTest.log(LogStatus.PASS, "password entered Successfully");
		//System.out.println("Password is successfuly Entered");

		//Click on Login
		WebElement LoginButton = driver.findElement(By.xpath("//button[@onclick='login()']"));
		LoginButton.click();
		homeTest.log(LogStatus.PASS, "Button Clicked Successfully");
		//System.out.println("Login Button is Clicked Sucessfully");

		//Click on the Home Button
		Thread.sleep(3000);
		WebElement HomeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		HomeTab.click();
		System.out.println("Home tab is Clicked Sucessfully");

		//Enter the Name
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Your name..']"));
		name.clear();
		name.sendKeys("Tulika");
				
		//Enter the Fathername
		WebElement fathername = driver.findElement(By.xpath("//input[@id='lname']"));
		fathername.clear();
		fathername.sendKeys("Madhusudan");
		Thread.sleep(1000);
		
		//Enter Postal Code
		WebElement postalcode = driver.findElement(By.xpath("//input[@placeholder='postal address..']"));
		postalcode.clear();
		postalcode.sendKeys("560072");

		//Enter Personal Address
		WebElement postaladdress = driver.findElement(By.xpath("//input[@id='personaladdress']"));
		postaladdress.clear();
		postaladdress.sendKeys("Bangaluru");
		Thread.sleep(2000);

		// Select Gender
		WebElement genderfemale = driver.findElement(By.xpath("//input[@value='female']"));
		genderfemale.click();
		Thread.sleep(2000);

		//Select the city from Dropdown.
		Select City = new Select(driver.findElement(By.id("city")));
		City.selectByVisibleText("MUMBAI");
				
		//Select the Course from Drop Down
		Select Course = new Select(driver.findElement(By.xpath("//select[@name='course']")));
		Course.selectByVisibleText("MBA");

		//Select the District from Dropdown.
		Select district = new Select(driver.findElement(By.xpath("//select[@name='district']")));
		district.selectByVisibleText("MUMBAI");

		//Select the state from Dropdown.
		Select state = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		state .selectByVisibleText("PATNA");
		
		//Type the PinCode from Dropdown.
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='pincode ..']"));
		pincode.clear();
		pincode.sendKeys("560071");
		
		//Type the EMail Address
		WebElement emailid = driver.findElement(By.xpath("//input[@id='emailid']"));
		emailid.clear();
		emailid.sendKeys("tulikapandey16@gmail.com");
		
		//Click the Submit Button
		WebElement submit = driver.findElement(By.xpath("//button[@class='bootbutton']"));
		submit.click();
		Thread.sleep(4000);
		//-------------------------------- Home Screen Complete ------------------------------//
		
		//Switch to Actions 
		WebElement SwitchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		SwitchTo.click();
		Thread.sleep(5000);
		
		//Click on Alert
		WebElement Alert = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		Alert.click();
		Thread.sleep(2000);
		
		//Click on New Windows Alert
		WebElement WindowsAlert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		WindowsAlert.click();
		
		//Switch to Pop-Up-Window or Alert Window and Read the text and print in console
		Alert windowsAlert = driver.switchTo().alert();
		String alertText = windowsAlert. getText();
		System.out.println("Alert text is " + alertText);
		Thread.sleep(5000);
		windowsAlert.accept();
		
		//Switch to prompt Alert & dismiss the text from Alert
		WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		promptAlert.click();
		Thread.sleep(3000);
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptalert.sendKeys("Tulika");
		Thread.sleep(5000);
		promptalert.accept();
		extent.endTest(homeTest);
		extent.flush();
		extent.close();
		//driver,close();
	}
}
