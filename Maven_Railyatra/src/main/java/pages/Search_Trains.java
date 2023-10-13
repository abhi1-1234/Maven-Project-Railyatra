package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Trains {
	
	//Variable-Private
	
	@FindBy (xpath = "//a[@class='RY_vertical TrainTicket_tab']")
	private WebElement TrainticketTab;
	
	@FindBy (xpath = "//input[@id='boarding_from']")
	private WebElement FromTextbox ;
	
	@FindBy (xpath = "(//span[text()=' × '])[1]")
	private WebElement FromTextboxCrossButton;
	
	@FindBy (xpath = "//input[@id='boarding_to']")
	private WebElement ToTextbox;
	
	@FindBy (xpath = "(//span[text()=' × '])[2]")
	private WebElement ToTextboxCrossButton;
	
	@FindBy (xpath = "//input[@id='datepicker']")
	private WebElement CalenderButton;
	
	@FindBy (xpath = "//span[text()='Next']")
	private WebElement NextButtonInCalender;
	
	@FindBy (xpath = "//span[text()='Prev']")
	private WebElement PreviousButtonInCalender;
	
	@FindBy (xpath = "//a[text()='19']")
	private WebElement ChooseDateFromCalender;
	
	@FindBy (xpath = "//button[text()='Search Trains']")
	private WebElement SearchButton;
	
	//Constructor - public
	public 	Search_Trains(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	//Method - public
	public void ClickTrainticketTab()
	{
		TrainticketTab.click();
	}
	
	public void SendKeysFromTextbox(String s)
	{
		FromTextbox.sendKeys(s);
	}
	
	public void SendKeysToTextbox(String f)
	{
		ToTextbox.sendKeys(f);
	}
	
	public void ClickFromCrossButton()
	{
		FromTextboxCrossButton.click();
	}
	
	public void ClickToCrossButton() 
	{
		ToTextboxCrossButton.click();
	}
	
	public void ClickDateTextbox() 
	{
		CalenderButton.click();
	}
	
	public void ChooseDate() throws InterruptedException 
	{
		ChooseDateFromCalender.click();
	}
	
	public void ClickNextButtonCalender() 
	{
		NextButtonInCalender.click();
	}

	public void ClickPreviousButtonCalender()
	{
		PreviousButtonInCalender.click();
	}	

	public void ClickOnSearchButton()
	{
		SearchButton.click();
	}
	
	
	
	}

