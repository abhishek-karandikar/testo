package demo;

//Sample test in Java to run Automate session.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class JavaSample {
    public static final String AUTOMATE_USERNAME = "abhishekkarandik2";
    public static final String AUTOMATE_ACCESS_KEY = "xCe45NKP1uQQE3bgMGJo";

    public static void main(String[] args) throws Exception {
	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability("os", "Windows");
	caps.setCapability("os_version", "10");
	caps.setCapability("browserstack.user",AUTOMATE_USERNAME);
	caps.setCapability("browserstack.key",AUTOMATE_ACCESS_KEY);
	caps.setCapability("browser", "Chrome");
	caps.setCapability("browser_version", "80");
	caps.setCapability("name", "abhishekkarandik2's First Test");
	WebDriver driver = new RemoteWebDriver(new URL("https://hub-cloud.browserstack.com/wd/hub"), caps);
	driver.get("https://www.google.com");
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("BrowserStack");
	element.submit();
	System.out.println(driver.getTitle());
	driver.quit();
    }
}