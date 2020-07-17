package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

    public static final String USERNAME = "abhishekkarandik2";
    public static final String AUTOMATE_KEY = "xCe45NKP1uQQE3bgMGJo";
    protected String browserName;

    protected WebDriver driver;

    public WebDriver drive() throws IOException {

	switch (getOS()) {
	case "Windows 10":

	    driver = selectBrowserWin10();

	    break;

	default:
	    break;
	}
	return driver;

    }

    public WebDriver selectBrowserWin10() throws IOException {

	Properties obj = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
	obj.load(ip);

	System.out.println("Selected browser is" + getBrowser());

	switch (getBrowser()) {
	case "Chrome":

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browserstack.user", USERNAME);
	    caps.setCapability("browserstack.key", AUTOMATE_KEY);
	    caps.setCapability("browser_version", "80");
	    caps.setCapability("name", "abhishekkarandik2's First Test");
	    driver = new RemoteWebDriver(new URL(obj.getProperty("hubURL")), caps);

	    break;

	case "Edge":

	    break;

	case "Firefox":

	    break;

	default:
	    break;
	}
	return driver;

    }

    public String getOS() {

	String OS = System.getProperty("os.name");
	return OS;

    }

    public String getBrowser() throws IOException {

	Properties obj = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
	obj.load(ip);
	return browserName = obj.getProperty("Browser");

    }
}
