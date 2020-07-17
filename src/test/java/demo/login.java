package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Base;

import java.io.IOException;

public class login extends Base {

    @BeforeTest
    public void begin() throws IOException {

	drive();
	driver.get("https://www.google.com");

    }

    @Test
    public void launch() {

	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("BrowserStack");
	element.submit();
	System.out.println(driver.getTitle());

    }

    @AfterTest
    void quit() {
	driver.quit();
    }

}
