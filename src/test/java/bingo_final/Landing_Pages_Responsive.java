package bingo_final;

import junit.framework.TestCase;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Landing_Pages_Responsive extends TestCase {
	public final String witchesFormReg = "//*[@id='ng-app']/body/div[1]/div[1]/div/div/div[2]/div";
	public final String witchesUsername = "//*[@id='txtUsername']";
	public final String witchesPass = "//*[@id='txtPassword']";
	public final String witchesEmail = "//*[@id='txtEmail']";
	public final String witchesPhone = "//*[@id='txtPhone']";
	public final String withchesFirstName = "//*[@id='txtFirstName']";
	public final String witchesLastName = "//*[@id='txtLastName']";
	public final String witchesSignUpBtn = "//*[@id='registerForm']/div[8]/button";
	public final String USERNAME = "adrianaonica1989";
	public final String ACCESS_KEY = "72c775ee-cb8a-4772-87ed-e2db70e5994a";
	public final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public final String FREE150Join = "//*[@id='ng-app']/body/div[1]/div[1]/div[1]/div/div[2]/div/div/a";
	public final String FREE150Reg_box = "//*[@id='test-popup']";
	public final String F150_Username = "//*[@id='txtUsername']";
	public final String F150_password = "//*[@id='txtPassword']";
	public final String F150_email = "//*[@id='txtEmail']";
	public final String F150_phone = "//*[@id='txtPhone']";
	public final String F150_firstname = "//*[@id='txtFirstName']";
	public final String F150_lastname = "//*[@id='txtLastName']";
	public final String F150_CreateMyAccount = "//*[@id='registerForm']/div[8]/button";
	
	
	
	
	
	public Landing_Pages_Responsive(String name) {
		super(name);
		
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testLandingPage_WitchesChromeAndroid() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "Registration_Witches_Android");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
    	RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
    	driver.get("https://www.bingohall.ag/lp/290316/witches-hunt");
		WebDriverWait waitLoadPage = new WebDriverWait(driver,20);
		waitLoadPage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(witchesFormReg)));
		driver.findElement(By.xpath(witchesUsername)).click();
		String timeGenerated = String.valueOf(System.currentTimeMillis());
		String phoneGenerated = "202555"+timeGenerated.substring(0, timeGenerated.length() - 9);;
		driver.findElement(By.xpath(witchesUsername)).sendKeys(timeGenerated);
		driver.findElement(By.xpath(witchesPass)).click();
		driver.findElement(By.xpath(witchesPass)).sendKeys("azsxdcfvgb");
		driver.findElement(By.xpath(witchesEmail)).click();
		driver.findElement(By.xpath(witchesEmail)).sendKeys(timeGenerated+"@gmail.com");
		driver.findElement(By.xpath(witchesPhone)).click();
		driver.findElement(By.xpath(witchesPhone)).sendKeys(phoneGenerated);
		driver.findElement(By.xpath(withchesFirstName)).click();
		driver.findElement(By.xpath(withchesFirstName)).sendKeys("sdfdgfdf");
		driver.findElement(By.xpath(witchesLastName)).click();
		driver.findElement(By.xpath(witchesLastName)).sendKeys("dwghjtte");
		driver.findElement(By.xpath(witchesSignUpBtn)).click();
		WebDriverWait wait_verify = new WebDriverWait(driver,15);
		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/div[3]/a")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		 
	}
//	
	@Test
	public void testLandingPage_150FREE_Android() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "RegistrationLandingPage_150FREE_Android");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https://www.bingohall.ag/lp/150free/150216");
		WebDriverWait wait_join_btn = new WebDriverWait(driver,15);
		wait_join_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FREE150Join)));
		String timeGenerated = String.valueOf(System.currentTimeMillis());
		String generatedPhone = "202555"+timeGenerated.substring(0, timeGenerated.length() - 9);
		driver.findElement(By.xpath(FREE150Join)).click();
		wait_join_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(F150_Username)));
		driver.findElement(By.xpath(F150_Username)).click();
		driver.findElement(By.xpath(F150_Username)).sendKeys(timeGenerated);
		driver.findElement(By.xpath(F150_password)).click();
		driver.findElement(By.xpath(F150_password)).sendKeys(timeGenerated);
		driver.findElement(By.xpath(F150_email)).click();
		driver.findElement(By.xpath(F150_email)).sendKeys(timeGenerated+"@gmail.com");
		driver.findElement(By.xpath(F150_phone)).click();
		driver.findElement(By.xpath(F150_phone)).sendKeys(generatedPhone);
		driver.findElement(By.xpath(F150_firstname)).click();
		driver.findElement(By.xpath(F150_firstname)).sendKeys("azsxdcfv");
		driver.findElement(By.xpath(F150_lastname)).click();
		driver.findElement(By.xpath(F150_lastname)).sendKeys("qawsedrf");
		driver.findElement(By.xpath(F150_CreateMyAccount)).click();
		WebDriverWait wait_verify = new WebDriverWait(driver,15);
		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/div[3]/a")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		 
		 
	}
//	
	@Test
	public void testLandingPage_VampiresSlots_Android() throws MalformedURLException
	{
		 Map<String, String> mobileEmulation = new HashMap<String, String>();
		 mobileEmulation.put("deviceName", "Google Nexus 6");
		 Map<String, Object> chromeOptions = new HashMap<String, Object>();
		 chromeOptions.put("mobileEmulation", mobileEmulation);
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
		 caps.setCapability("name", "RegistrationLandingPage_Vampires_Android");
		 caps.setCapability("platform", "Windows 8");
		 caps.setCapability("version", "48");
		 caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		 RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		 driver.get("https://www.bingohall.ag/lp/88free/vampire-slots-slayers2");
		 WebDriverWait waitLoadPage = new WebDriverWait(driver,20);
		 waitLoadPage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(witchesFormReg)));
		 driver.findElement(By.xpath(witchesUsername)).click();
		 String timeGenerated = String.valueOf(System.currentTimeMillis());
		 String phoneGenerated = "202555"+timeGenerated.substring(0, timeGenerated.length() - 9);;
		 driver.findElement(By.xpath(witchesUsername)).sendKeys(timeGenerated);
		 driver.findElement(By.xpath(witchesPass)).click();
		 driver.findElement(By.xpath(witchesPass)).sendKeys("azsxdcfvgb");
		 driver.findElement(By.xpath(witchesEmail)).click();
		 driver.findElement(By.xpath(witchesEmail)).sendKeys(timeGenerated+"@gmail.com");
		 driver.findElement(By.xpath(witchesPhone)).click();
		 driver.findElement(By.xpath(witchesPhone)).sendKeys(phoneGenerated);
		 driver.findElement(By.xpath(withchesFirstName)).click();
		 driver.findElement(By.xpath(withchesFirstName)).sendKeys("sdfdgfdf");
		 driver.findElement(By.xpath(witchesLastName)).click();
		 driver.findElement(By.xpath(witchesLastName)).sendKeys("dwghjtte");
		 driver.findElement(By.xpath(witchesSignUpBtn)).click();
		 WebDriverWait wait_verify = new WebDriverWait(driver,15);
		 wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/div[3]/a")));
		 driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
	}
	
	@Test
	public void testLandingPage_WitchesChromeIOS() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "Registration_Witches_IOS");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
    	RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
    	driver.get("https://www.bingohall.ag/lp/290316/witches-hunt");
		WebDriverWait waitLoadPage = new WebDriverWait(driver,20);
		waitLoadPage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(witchesFormReg)));
		driver.findElement(By.xpath(witchesUsername)).click();
		String timeGenerated = String.valueOf(System.currentTimeMillis());
		String phoneGenerated = "202555"+timeGenerated.substring(0, timeGenerated.length() - 9);;
		driver.findElement(By.xpath(witchesUsername)).sendKeys(timeGenerated);
		driver.findElement(By.xpath(witchesPass)).click();
		driver.findElement(By.xpath(witchesPass)).sendKeys("azsxdcfvgb");
		driver.findElement(By.xpath(witchesEmail)).click();
		driver.findElement(By.xpath(witchesEmail)).sendKeys(timeGenerated+"@gmail.com");
		driver.findElement(By.xpath(witchesPhone)).click();
		driver.findElement(By.xpath(witchesPhone)).sendKeys(phoneGenerated);
		driver.findElement(By.xpath(withchesFirstName)).click();
		driver.findElement(By.xpath(withchesFirstName)).sendKeys("sdfdgfdf");
		driver.findElement(By.xpath(witchesLastName)).click();
		driver.findElement(By.xpath(witchesLastName)).sendKeys("dwghjtte");
		driver.findElement(By.xpath(witchesSignUpBtn)).click();
		WebDriverWait wait_verify = new WebDriverWait(driver,15);
		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/div[3]/a")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		 
		 
	}
//	
	
	@Test
	public void testLandingPage_150FREE_IOS() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "RegistrationLandingPage_FREE150_IOS");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https://www.bingohall.ag/lp/150free/150216");
		WebDriverWait wait_join_btn = new WebDriverWait(driver,15);
		wait_join_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FREE150Join)));
		String timeGenerated = String.valueOf(System.currentTimeMillis());
		String generatedPhone = "202555"+timeGenerated.substring(0, timeGenerated.length() - 9);
		driver.findElement(By.xpath(FREE150Join)).click();
		wait_join_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(F150_Username)));
		driver.findElement(By.xpath(F150_Username)).click();
		driver.findElement(By.xpath(F150_Username)).sendKeys(timeGenerated);
		driver.findElement(By.xpath(F150_password)).click();
		driver.findElement(By.xpath(F150_password)).sendKeys(timeGenerated);
		driver.findElement(By.xpath(F150_email)).click();
		driver.findElement(By.xpath(F150_email)).sendKeys(timeGenerated+"@gmail.com");
		driver.findElement(By.xpath(F150_phone)).click();
		driver.findElement(By.xpath(F150_phone)).sendKeys(generatedPhone);
		driver.findElement(By.xpath(F150_firstname)).click();
		driver.findElement(By.xpath(F150_firstname)).sendKeys("azsxdcfv");
		driver.findElement(By.xpath(F150_lastname)).click();
		driver.findElement(By.xpath(F150_lastname)).sendKeys("qawsedrf");
		driver.findElement(By.xpath(F150_CreateMyAccount)).click();
		WebDriverWait wait_verify = new WebDriverWait(driver,15);
		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/div[3]/a")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		 
		 
	}
//	
	
	@Test
	public void testLandingPage_VampiresSlots_IOS() throws MalformedURLException
	{
		 Map<String, String> mobileEmulation = new HashMap<String, String>();
		 mobileEmulation.put("deviceName", "Apple iPhone 6");
		 Map<String, Object> chromeOptions = new HashMap<String, Object>();
		 chromeOptions.put("mobileEmulation", mobileEmulation);
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
		 caps.setCapability("name", "RegistrationLandingPage_Vampires_IOS");
		 caps.setCapability("platform", "Windows 8");
		 caps.setCapability("version", "48");
		 caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		 RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		 driver.get("https://www.bingohall.ag/lp/88free/vampire-slots-slayers2");
		 WebDriverWait waitLoadPage = new WebDriverWait(driver,20);
		 waitLoadPage.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(witchesFormReg)));
		 driver.findElement(By.xpath(witchesUsername)).click();
		 String timeGenerated = String.valueOf(System.currentTimeMillis());
		 String phoneGenerated = "202555"+timeGenerated.substring(0, timeGenerated.length() - 9);;
		 driver.findElement(By.xpath(witchesUsername)).sendKeys(timeGenerated);
		 driver.findElement(By.xpath(witchesPass)).click();
		 driver.findElement(By.xpath(witchesPass)).sendKeys("azsxdcfvgb");
		 driver.findElement(By.xpath(witchesEmail)).click();
		 driver.findElement(By.xpath(witchesEmail)).sendKeys(timeGenerated+"@gmail.com");
		 driver.findElement(By.xpath(witchesPhone)).click();
		 driver.findElement(By.xpath(witchesPhone)).sendKeys(phoneGenerated);
		 driver.findElement(By.xpath(withchesFirstName)).click();
		 driver.findElement(By.xpath(withchesFirstName)).sendKeys("sdfdgfdf");
		 driver.findElement(By.xpath(witchesLastName)).click();
		 driver.findElement(By.xpath(witchesLastName)).sendKeys("dwghjtte");
		 driver.findElement(By.xpath(witchesSignUpBtn)).click();
		 WebDriverWait wait_verify = new WebDriverWait(driver,15);
		 wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/div[3]/a")));
		 driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
	}
	
	

}
