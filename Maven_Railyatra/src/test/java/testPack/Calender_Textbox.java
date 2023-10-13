package testPack;

import java.io.IOException;
import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Search_Trains;
import utilize.Utility;

public class Calender_Textbox {
     private WebDriver driver;
	 private Search_Trains search_Trains;
     private String testID;
	 
	 @Parameters("Browser")
	@BeforeTest
	public void OpenBrowser(String BrowserName) {
		if(BrowserName.equals("Chrome")) {
		driver = base.Browser.launchChrome();
		
	    driver.get("https://www.railyatri.in/trains-between-stations");
	    driver.manage().window().maximize();
		}
	    
	    if(BrowserName.equals("Firefox")) {
	    	driver = base.Browser.launchFirefox(); 
	    	
		    driver.get("https://www.railyatri.in/trains-between-stations");
		    driver.manage().window().maximize();
	    }
	    
	    if(BrowserName.equals("Edge")) {
	        driver = base.Browser.launchEdge();
	    	
		    driver.get("https://www.railyatri.in/trains-between-stations");
		    driver.manage().window().maximize();
	    	
	    }
	}
	
	@BeforeClass
	public void Creating_Object() {
		search_Trains = new Search_Trains(driver);
		
	}
	    @Test
	    public void Verify_Calender_Textbox() throws InterruptedException {
	    
	    	testID = "TC_001" ;
	    	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
	    search_Trains.ClickTrainticketTab();
	     
	    search_Trains.ClickDateTextbox();
	   
	    search_Trains.ClickNextButtonCalender();
	   
	    search_Trains.ClickNextButtonCalender();
	    
	    search_Trains.ClickPreviousButtonCalender();
	    
	    search_Trains.ChooseDate();
	    
	    search_Trains.ClickOnSearchButton();
	   
	 }
	    
	@AfterMethod
	 public void TakeScreenShot_Of_Failed_Test_Methods(ITestResult result) throws IOException {
		 
		if(ITestResult.FAILURE == result.getStatus()) {
			Utility.TakeScreenShotOf(driver, testID);
		}
	 }
	    
	 @AfterClass
	 public void Clear_Objects() {
		 search_Trains = null;
	 }
	 
	 @AfterTest
	 public void Close_Browser() {
		 driver.close();
		 driver = null;
		 System.gc();
	 }
	    
	    
	    

}
