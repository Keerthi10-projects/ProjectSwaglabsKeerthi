package pageRepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CheckOutOverviewPage {

		// 1. WebElement Identification and Declaration

		@FindBy(id = "finish")
		private WebElement finishbtn;

		// 2 .WebElement Initialization

		public CheckOutOverviewPage(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}

		// 3. WebElement Utilization

		public WebElement getfinishbtn() {
			return finishbtn;
		}

	}



