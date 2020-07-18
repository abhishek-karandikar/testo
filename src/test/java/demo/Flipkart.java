package demo;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.PageObject;
import utils.Base;

public class Flipkart extends Base {

    PageObject flip;

    @BeforeTest
    public void begin() throws Exception {

	drive();
	driver.get("https://www.flipkart.com/");

    }

    @Test
    public void launch() throws FileNotFoundException {

	flip = new PageObject(driver);

	flip.closePopUp();
	flip.searchBox();
	flip.mobile();
	flip.brand();
	flip.assured();
	flip.highToLow();

	// Fetch All the Products Text
	List<WebElement> list_of_products = driver.findElements(By.xpath("//div[contains(text(),'Samsung Galaxy S')]"));
	// String[] linkTexts = new String[list_of_products.size()];
	Iterator<WebElement> itr = list_of_products.iterator();
	while (itr.hasNext()) {
	    System.out.println(itr.next().getText());
	}

    }

    @AfterTest
    void quit() {
	driver.quit();
    }

}
