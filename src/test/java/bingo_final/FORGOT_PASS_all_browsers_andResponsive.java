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

public class FORGOT_PASS_all_browsers_andResponsive extends TestCase {
	public final String signUpBtnAndLogIn = "//*[@id='ng-app']/body/div[1]/header/div/div[4]";
	public WebDriver driver;
	public final String login_Btn = "body > div.page-content-wrapper.mm-page > header > div > div.login-reg.pull-right.text-uppercase > a";
	public final String forgot_pass_link = "#login_form > div:nth-child(7) > div > div > a.forgot-password";
	public final String searchEmailBtn = "#txtSearchBy";
	public final String retrievePassbtn = "#forgot-pass > div > div.modal-content.reset-pass > div:nth-child(5) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1";
	public final String USERNAME = "adrianaonica1989";
	public final String ACCESS_KEY = "72c775ee-cb8a-4772-87ed-e2db70e5994a";
	public final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public FORGOT_PASS_all_browsers_andResponsive(String name) {
		super(name);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adriana-tst\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\adriana-tst\\Downloads\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testForgotPass_WebForm_Chrome() throws IOException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ForgotPass_Chrome");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		ChromeDriver driver = new ChromeDriver(caps);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector(forgot_pass_link)).click();
		WebDriverWait wait_enterEmail = new WebDriverWait(driver,10);
		wait_enterEmail.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#txtSearchBy")));
		driver.findElement(By.cssSelector(searchEmailBtn)).click();
		driver.findElement(By.cssSelector(searchEmailBtn)).sendKeys("adrianaonica1989@gmail.com");
		driver.findElement(By.cssSelector("#search_user_form > div:nth-child(3) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1")).click();
		WebDriverWait wait_search_email = new WebDriverWait(driver,10);
		wait_search_email.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(retrievePassbtn)));
		driver.findElement(By.cssSelector(retrievePassbtn)).click();
		URL url = new URL("https://www.bingohall.ag/password/retrieve_account");
		HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		huc.setRequestMethod("POST");
		huc.connect();
		Assert.assertEquals(huc.getResponseCode(), 200, "Email have been succesfully sent");
		
		
}
	@Test
	public void testForgotPass_WebForm_Firefox() throws IOException
	{

		DesiredCapabilities caps = DesiredCapabilities.firefox();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		caps.setCapability("name", "ForgotPass_Firefox");
	    caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "44.0");
//    	Proxy proxy = new Proxy();
//		proxy.setHttpProxy("70.190.6.230:3128");
//		caps.setCapability("proxy", proxy);
	    ChromeDriver driver = new ChromeDriver(caps);
		//driver = new FirefoxDriver();
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector(forgot_pass_link)).click();
		WebDriverWait wait_enterEmail = new WebDriverWait(driver,10);
		wait_enterEmail.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#txtSearchBy")));
		driver.findElement(By.cssSelector(searchEmailBtn)).click();
		driver.findElement(By.cssSelector(searchEmailBtn)).sendKeys("adrianaonica1989@gmail.com");
		driver.findElement(By.cssSelector("#search_user_form > div:nth-child(3) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1")).click();
		WebDriverWait wait_search_email = new WebDriverWait(driver,10);
		wait_search_email.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(retrievePassbtn)));
		driver.findElement(By.cssSelector(retrievePassbtn)).click();
		URL url = new URL("https://www.bingohall.ag/password/retrieve_account");
		HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		huc.setRequestMethod("POST");
		huc.connect();
		Assert.assertEquals(huc.getResponseCode(), 200, "Email have been succesfully sent");
		
		
}
	@Test
	public void testForgotPass_WebForm_IE11() throws IOException
	{
		DesiredCapabilities caps = DesiredCapabilities.edge();
		caps.setCapability("name", "ForgotPass_edge");
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "13.0");
	    ChromeDriver driver = new ChromeDriver(caps);
		
	    driver.navigate().to("https://www.bingohall.ag/");
		
		WebDriverWait wait_load = new WebDriverWait(driver,15);
		wait_load.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(login_Btn)));
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector(forgot_pass_link)).click();
		WebDriverWait wait_enterEmail = new WebDriverWait(driver,10);
		wait_enterEmail.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#txtSearchBy")));
		driver.findElement(By.cssSelector(searchEmailBtn)).click();
		driver.findElement(By.cssSelector(searchEmailBtn)).sendKeys("adrianaonica1989@gmail.com");
		driver.findElement(By.cssSelector("#search_user_form > div:nth-child(3) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1")).click();
		WebDriverWait wait_search_email = new WebDriverWait(driver,10);
		wait_search_email.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(retrievePassbtn)));
		driver.findElement(By.cssSelector(retrievePassbtn)).click();
		URL url = new URL("https://www.bingohall.ag/password/retrieve_account");
		HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		huc.setRequestMethod("POST");
		huc.connect();
		Assert.assertEquals(huc.getResponseCode(), 200, "Email have been succesfully sent");
		
		
}
	
	@Test
	public void testForgotPass_AndroidNexus_6() throws IOException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ForgotPass_Android");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		ChromeDriver driver = new ChromeDriver(caps);
		driver.get("https://www.bingohall.ag/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector(forgot_pass_link)).click();
		WebDriverWait wait_enterEmail = new WebDriverWait(driver,10);
		wait_enterEmail.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#txtSearchBy")));
		driver.findElement(By.cssSelector(searchEmailBtn)).click();
		driver.findElement(By.cssSelector(searchEmailBtn)).sendKeys("adrianaonica1989@gmail.com");
		driver.findElement(By.cssSelector("#search_user_form > div:nth-child(3) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1")).click();
		WebDriverWait wait_search_email = new WebDriverWait(driver,10);
		wait_search_email.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(retrievePassbtn)));
		driver.findElement(By.cssSelector(retrievePassbtn)).click();
		URL url = new URL("https://www.bingohall.ag/password/retrieve_account");
		HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		huc.setRequestMethod("POST");
		huc.connect();
		Assert.assertEquals(huc.getResponseCode(), 200, "Email have been succesfully sent");
		
	}
	
	@Test
	public void testForgotPass_iOSIphone6S() throws IOException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ForgotPass_Iphone");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		ChromeDriver driver = new ChromeDriver(caps);
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(login_Btn)).click();
		WebDriverWait wait_forgot = new WebDriverWait(driver,10);
		wait_forgot.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(forgot_pass_link)));
		driver.findElement(By.cssSelector(forgot_pass_link)).click();
		WebDriverWait wait_enterEmail = new WebDriverWait(driver,10);
		wait_enterEmail.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#txtSearchBy")));
		driver.findElement(By.cssSelector(searchEmailBtn)).click();
		driver.findElement(By.cssSelector(searchEmailBtn)).sendKeys("adrianaonica1989@gmail.com");
		driver.findElement(By.cssSelector("#search_user_form > div:nth-child(3) > button.btn.btn-primary.btn-lg.col-xs-6.col-xs-offset-1.col-sm-6.col-sm-offset-1")).click();
		WebDriverWait wait_search_email = new WebDriverWait(driver,10);
		wait_search_email.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(retrievePassbtn)));
		driver.findElement(By.cssSelector(retrievePassbtn)).click();
		URL url = new URL("https://www.bingohall.ag/password/retrieve_account");
		HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		huc.setRequestMethod("POST");
		huc.connect();
		Assert.assertEquals(huc.getResponseCode(), 200, "Email have been succesfully sent");
		
	}

}
