package pageRepository;

 
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CartPage {

		// 1. WebElement Identification and Declaration

		@FindBy(id = "checkout")
		private WebElement checkoutbtn;

		// 2 .WebElement Initialization

		public CartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}

		// 3. WebElement Utilization

		public WebElement getcheckoutbtn() {
			return checkoutbtn;
		}

	}


