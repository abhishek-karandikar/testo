package pageFactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

    private WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
    private WebElement closePopUp;

    @FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
    private WebElement searchBox;

    @FindBy(xpath = "//li[2]//div[1]//a[1]//div[2]//div[1]")
    WebElement mobile;

    @FindBy(xpath = "//div[@class='_1GEhLw'][contains(text(),'Samsung')]")
    WebElement brand;

    @FindBy(xpath = "//img[@class='_2rIV_l']")
    WebElement assurred;

    @FindBy(xpath = "//div[contains(text(),'Price -- High to Low')]")
    WebElement highToLow;

    @SuppressWarnings("deprecation")
    public PageObject(WebDriver driver) throws FileNotFoundException {

	this.driver = driver;
	// This initElements method will create all WebElements
	wait = new WebDriverWait(driver, 30);
	PageFactory.initElements(driver, this);

    }

    // Methods
    public void closePopUp() {
	try {
	    wait.until(ExpectedConditions.visibilityOf(closePopUp)).click();

	} catch (Exception e) {
	    // TODO: handle exception
	}
    }
    
     // Methods
    public void searchBox() {
	try {
	    wait.until(ExpectedConditions.visibilityOf(searchBox)).clear();
	    searchBox.sendKeys("Samsung Galaxy S10");
	   
	    Robot robot = new Robot();
	   
	} catch (Exception e) {
	    // TODO: handle exception
	}
    }

    public void mobile() {
	try {
	    wait.until(ExpectedConditions.visibilityOf(mobile)).click();

	} catch (Exception e) {
	    // TODO: handle exception
	}
    }

    public void brand() {
	try {
	    wait.until(ExpectedConditions.visibilityOf(brand)).click();

	} catch (Exception e) {
	    // TODO: handle exception
	}
    }

    public void assured() {
	try {
	    wait.until(ExpectedConditions.visibilityOf(assurred)).click();

	} catch (Exception e) {
	    // TODO: handle exception
	}
    }

    public void highToLow() {
	try {
	    wait.until(ExpectedConditions.visibilityOf(highToLow)).click();

	} catch (Exception e) {
	    // TODO: handle exception
	}
    }

}
