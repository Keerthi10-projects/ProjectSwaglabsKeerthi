package pageRepository;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		
		// 1. WebElement Identification & Declaration
		
			@FindBy(id = "user-name")
			private WebElement usernametextfield;

			@FindBy(id = "password")
			private WebElement passwordtextfield;

			@FindBy(id = "login-button")
			private WebElement loginbutton;

			// 2. WebElement Initialization
			
			public LoginPage(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}

			// 3. WebElement Utilization
			
			public WebElement getusernametextfield() {
				return usernametextfield;
			}

			public WebElement getpasswordtextfield() {
				return passwordtextfield;
			}

			public WebElement getloginbutton() {
				return loginbutton;
			}


	}


