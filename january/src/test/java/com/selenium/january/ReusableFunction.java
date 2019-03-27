package com.selenium.january;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableFunction {
	
static WebDriver driver;

/* Name of the Method: 	enterText
 * Brief Description: 	enterText into TextBox
 * Arguments: 			WebElement String
 * Created by:			Tulika
 * Created Date:		03/23/2019
 * Last Modified:		03/23/2019
 */

public static void enterText(WebElement element ,  String textVal) throws InterruptedException{
	
	if(element.isDisplayed()) {
		element.sendKeys(textVal);
		System.out.println("Entering into text field is success");
	}
	else
	{
	System.out.println("Field Does not Exist, Please Check");
	}
}

/* Name of the Method: 	clickObject
 * Brief Description: 	Clicking the Button
 * Arguments: 			WebElement
 * Created by:			Tulika
 * Created Date:		03/23/2019
 * Last Modified:		03/23/2019
 */

public static void clickObject(WebElement element) throws InterruptedException{
	
	if(element.isDisplayed()) {
		element.click();
		System.out.println("Click Button is success");
	}
	else
	{
	System.out.println("Button Does not Exist, Please Check");
	}
}
/* Name of the Method: 	Select
 * Brief Description: 	Select City from dropdown menu using index
 * Arguments: 			WebElement
 * Created by:			Tulika
 * Created Date:		03/23/2019
 * Last Modified:		03/23/2019
 */
	
public static void selectByIndex(WebElement element, int index) throws InterruptedException{
	
	if(element.isDisplayed()) {
		Select City = new Select(element);
		City.selectByIndex(index);
		System.out.println("Selecting City is success");
	}
	else
	{
	System.out.println("Field Does not Exist, Please Check");
	}
	}

/* Name of the Method: 	Select
 * Brief Description: 	Select State from dropdown menu using Text
 * Arguments: 			WebElement
 * Created by:			Tulika
 * Created Date:		03/24/2019
 * Last Modified:		03/24/2019
 */
	
public static void selectByVisibleText(WebElement element, String Value) throws InterruptedException{
	
	if(element.isDisplayed()) {
		Select State = new Select(element);
		State.selectByVisibleText(Value);
		}
}
}
 


