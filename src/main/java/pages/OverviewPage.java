package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverviewPage {
	private WebDriver driver ;
	private WebDriverWait wait;
	private By finishBtn = By.id("finish");
	
	public OverviewPage(WebDriver driver) {
		this.driver = driver;	
		}

	public void finish() {
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(finishBtn));
		driver.findElement(finishBtn).click();
	}
}
