package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	private WebDriver driver ;
	private WebDriverWait wait;
	private By checkout = By.id("checkout");
	
	public CartPage(WebDriver driver) {
		this .driver=driver;
	}

	

	public void proceedToCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
		driver.findElement(checkout).click();
	}
}
