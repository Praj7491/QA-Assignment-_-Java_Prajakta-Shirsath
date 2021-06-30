package login_page;


import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  




public class NewTest
{ 	
			
 @Test
  public void Login() throws InterruptedException
 {
	 //launch the browser
	 System.setProperty("webdriver.chrome.driver", "E://Prajkta/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 //Open the given URL
 	 driver.get("http://jt-dev.azurewebsites.net/#/SignUp"); 
 	 driver.manage().window().maximize();	
 	 
 	 //Find the elements from Language drop down and check if given language is available or not 
  	  WebElement ele=driver.findElement(By.xpath("//*[@id=\"language\"]/div[1]/span/span[2]"));	
  	     	 
  	try {
  	    Assert.assertEquals(ele.getText(), "English");
  	} 
  	catch (AssertionError e) {
  	    System.out.println(ele.getText()+"-->language is not available");
  	    throw e;
  	}
  	  	
  	System.out.println(ele.getText()+"-->language is available");
  	  //Locate the present elements and perform actions
 	  driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rajas");
 	  driver.findElement(By.xpath("//*[@id=\"orgName\"]")).sendKeys("asfg");
 	  driver.findElement(By.xpath("//*[@id=\"singUpEmail\"]")).sendKeys("thdsink@gmail.com");
 	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span")).click();
 	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/fieldset/div[5]/button")).click();
 	 //wait for 5 seconds 
 	  Thread.sleep(5000);
 	  //Close the browser
 	driver.quit();
 	 }
  
 	 
  }
 
		
		
	
	

