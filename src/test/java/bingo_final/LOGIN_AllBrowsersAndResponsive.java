package bingo_final;

import junit.framework.TestCase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LOGIN_AllBrowsersAndResponsive extends TestCase {
	public final String signUpBtnAndLogIn = "//*[@id='ng-app']/body/div[1]/header/div/div[4]";
	public WebDriver driver;
	public final String login_Btn = "body > div.page-content-wrapper.mm-page > header > div > div.login-reg.pull-right.text-uppercase > a";
	public final String forgot_pass_link = "#login_form > div:nth-child(7) > div > div > a.forgot-password";
	public final String searchEmailBtn = "#txtSearchBy";
	public final String retrievePassbtn = "#forgot-pass > div > div.modal-content.reset-pass > div:nth-child(5) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1";
	public final String USERNAME = "adrianaonica1989";
	public final String ACCESS_KEY = "72c775ee-cb8a-4772-87ed-e2db70e5994a";
	public final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public LOGIN_AllBrowsersAndResponsive(String name) {
		super(name);
		String path = getClass().getClassLoader().getResource("chromedriver.exe"
				).getFile();
		System.setProperty("webdriver.chrome.driver", path);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\adriana-tst\\Downloads\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testLogin_WebForm_Chrome() throws IOException, InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "LOGIN_Chrome");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		ChromeDriver driver = new ChromeDriver(caps);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector("#txtUsername")).click();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("adry89");
		driver.findElement(By.cssSelector("#txtPassword")).click();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("mandrutza89miau");
		driver.findElement(By.cssSelector("#login_form > div:nth-child(5) > div > div > label.remember-me-login.remember-me-check")).click();
		driver.findElement(By.cssSelector("#login_form > div:nth-child(6) > button")).click();
		WebDriverWait wait_after_login = new WebDriverWait(driver,15);
		wait_after_login.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari")));
		driver.findElement(By.cssSelector("body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari > div > div:nth-child(3) > div.pushcrew-button-wrapper > button.pushcrew-chrome-style-notification-btn.pushcrew-btn-allow")).click();
		driver.findElement(By.cssSelector("body > div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-ready > div > div.mfp-content > div > div > div.modalx-footer > center > a")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("body > div.page-content-wrapper.mm-page > header > div > nav.header-controls.clearfix > ul > li.deposit > a"));

		}
		
	@Test
	public void testLogin_WebForm_Firefox() throws IOException, InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("name", "LOGIN_Firefox");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "44");
		FirefoxDriver driver = new FirefoxDriver(caps);
		driver.navigate().to("https://www.bingohall.ag/");
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector("#txtUsername")).click();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("adry89");
		driver.findElement(By.cssSelector("#txtPassword")).click();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("mandrutza89miau");
		driver.findElement(By.cssSelector("#login_form > div:nth-child(5) > div > div > label.remember-me-login.remember-me-check")).click();
		driver.findElement(By.cssSelector("#login_form > div:nth-child(6) > button")).click();
		WebDriverWait wait_after_login = new WebDriverWait(driver,15);
		wait_after_login.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari")));
		driver.findElement(By.cssSelector("body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari > div > div:nth-child(3) > div.pushcrew-button-wrapper > button.pushcrew-chrome-style-notification-btn.pushcrew-btn-allow")).click();
		driver.findElement(By.cssSelector("body > div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-ready > div > div.mfp-content > div > div > div.modalx-footer > center > a")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("body > div.page-content-wrapper.mm-page > header > div > nav.header-controls.clearfix > ul > li.deposit > a"));

		
}
	@Test
	public void testLogin_WebForm_IE11() throws IOException, InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.edge();
		caps.setCapability("name", "LOGIN_EDGE");
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "13.0");
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.navigate().to("https://www.bingohall.ag/");
		WebDriverWait wait_load = new WebDriverWait(driver,15);
		wait_load.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(login_Btn)));
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector("#txtUsername")).click();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("adry89");
		driver.findElement(By.cssSelector("#txtPassword")).click();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("mandrutza89miau");
		driver.findElement(By.cssSelector("#login_form > div:nth-child(5) > div > div > label.remember-me-login.remember-me-check")).click();
		driver.findElement(By.cssSelector("#login_form > div:nth-child(6) > button")).click();
//		WebDriverWait wait_after_login = new WebDriverWait(driver,60);
//		wait_after_login.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari")));
//		driver.findElement(By.cssSelector("body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari > div > div:nth-child(3) > div.pushcrew-button-wrapper > button.pushcrew-chrome-style-notification-btn.pushcrew-btn-allow")).click();
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("body > div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-ready > div > div.mfp-content > div > div > div.modalx-footer > center > a")).click();
		Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();
		kb.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("body > div.page-content-wrapper.mm-page > header > div > nav.header-controls.clearfix > ul > li.deposit > a"));
		
		
}
	
	@Test
	public void testLogin_AndroidNexus_6() throws IOException, InterruptedException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "LOGIN_Android");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		ChromeDriver driver = new ChromeDriver(caps);
		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver.get("https://www.bingohall.ag/");
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector("#txtUsername")).click();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("adry89");
		driver.findElement(By.cssSelector("#txtPassword")).click();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("mandrutza89miau");
		driver.findElement(By.cssSelector("#login_form > div:nth-child(5) > div > div > label.remember-me-login.remember-me-check")).click();
		driver.findElement(By.cssSelector("#login_form > div:nth-child(6) > button")).click();
		WebDriverWait wait_after_login = new WebDriverWait(driver,15);
		wait_after_login.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pushcrew-mobile-box")));
		driver.findElement(By.cssSelector("#pushcrew-mobile_allow_button")).click();
		driver.findElement(By.cssSelector("body > div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-ready > div > div.mfp-content > div > div > div.modalx-footer > center > a")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("body > div.page-content-wrapper.mm-page > header > div > nav.header-controls.clearfix > ul > li.deposit > a"));

		
	}
	
	@Test
	public void testLogin_iOSIphone6S() throws IOException, InterruptedException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();{}
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "LOGIN_Iphone");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		ChromeDriver driver = new ChromeDriver(caps);
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		//driver = new ChromeDriver(caps);
		driver.get("https://www.bingohall.ag/");
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector("#txtUsername")).click();
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("adry89");
		driver.findElement(By.cssSelector("#txtPassword")).click();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("mandrutza89miau");
		driver.findElement(By.cssSelector("#login_form > div:nth-child(5) > div > div > label.remember-me-login.remember-me-check")).click();
		driver.findElement(By.cssSelector("#login_form > div:nth-child(6) > button")).click();
        Thread.sleep(10000);
		driver.findElement(By.cssSelector("body > div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-ready > div > div.mfp-content > div > div > div.modalx-footer > center > a")).click();

	}

}
