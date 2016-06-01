package bingo_final;

import junit.framework.TestCase;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.net.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class REGISTRATION_Resposinve extends TestCase {
	public final String signUpLoginBtn_mobile = "//*[@id='ng-app']/body/div[1]/header/div/div[4]";
	public final String registration_form_mobile = "//*[@id='sign_in_tabs']";
	public final String firstNameInput = "//*[@id='txtFirstName']";
	public final String lastNameInput = "//*[@id='txtLastName']";
	public final String emailInput = "//*[@id='txtEmail']";
	public final String phoneNumberInput = "//*[@id='txtMobile']";
	public final String usernameInput = "//*[@id='txtUsername']";
	public final String passInput = "//*[@id='txtSignupPassword']";
	public WebDriver driver;
	public final String USERNAME = "adrianaonica1989";
	public final String ACCESS_KEY = "72c775ee-cb8a-4772-87ed-e2db70e5994a";
	public final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public REGISTRATION_Resposinve(String name) {
		super(name);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adriana-tst\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testInvalidFirstNameNIphone() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidFirstName_IOS");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		driver.findElement(By.xpath(firstNameInput)).click();
		driver.findElement(By.xpath(firstNameInput)).sendKeys("Onica291839");
		driver.findElement(By.xpath(lastNameInput)).click();
		
	}
	
	@Test
	public void testInvalidLastNameIphone() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidLastName_IOS");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(lastNameInput)));
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Onica291839");
		driver.findElement(By.xpath(emailInput)).click();
		
	}
	
	@Test
	public void testInvalidEmailIphone() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidEmail_IOS");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailInput)));
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys("Onica291839@");
		driver.findElement(By.xpath(passInput)).click();
		
	}
	
	@Test
	public void testPassTooShortIphone() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_PassTooShort_Android");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passInput)));
		driver.findElement(By.xpath(passInput)).click();
		driver.findElement(By.xpath(passInput)).sendKeys("2@");
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(passInput)).click();
		
		
	}
	
	@Test
	public void testInvalidPhoneIphone() throws MalformedURLException, InterruptedException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidPhoneNumber_Iphoner");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		//capabilities.setCapability("screenResolution", "800x600");
    	capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		//driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();

		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
		kb.sendKeys(Keys.TAB);
		kb.sendKeys(uniqueComplete);
		driver.findElement(By.xpath(passInput)).click();
		driver.findElement(By.xpath(passInput)).sendKeys(uniqueComplete+"passaaaa");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//iver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//kb.sendKeys(Keys.ENTER);
		WebDriverWait wait_phone = new WebDriverWait(driver,30);
		wait_phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).sendKeys("1234579a");
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		
	}
	
	@Test
	public void testInvalidFirstNameNAndroid() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidFirstName_Android");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		driver.findElement(By.xpath(firstNameInput)).click();
		driver.findElement(By.xpath(firstNameInput)).sendKeys("Onica291839");
		driver.findElement(By.xpath(lastNameInput)).click();
		
	}
//	
	@Test
	public void testInvalidLastNameAndroid() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_LastName_Android");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(lastNameInput)));
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Onica291839");
		driver.findElement(By.xpath(emailInput)).click();
	}
	
	@Test
	public void testInvalidEmailAndroid() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidEmail");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailInput)));
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys("Onica291839@");
		driver.findElement(By.xpath(passInput)).click();
		
	}
	
	@Test
	public void testPassTooShortAndroid() throws MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_PassTooShort_Android");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passInput)));
		driver.findElement(By.xpath(passInput)).click();
		driver.findElement(By.xpath(passInput)).sendKeys("2@");
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(passInput)).click();
		
		
	}
//	
	@Test
	public void testInvalidPhoneAndroid() throws MalformedURLException, InterruptedException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_InvalidPhoneNumber");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		//capabilities.setCapability("screenResolution", "800x600");
    	capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		//driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();

		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
		kb.sendKeys(Keys.TAB);
		kb.sendKeys(uniqueComplete);
		driver.findElement(By.xpath(passInput)).click();
		driver.findElement(By.xpath(passInput)).sendKeys(uniqueComplete+"passaaaa");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//iver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//kb.sendKeys(Keys.ENTER);
		WebDriverWait wait_phone = new WebDriverWait(driver,30);
		wait_phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).sendKeys("1234579a");
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		
	}
//	
	@Test
	public void testRegistration_Short_Android_Nexus6() throws InterruptedException, MalformedURLException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "ShortRegistration_Nexus6SResolution");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		//capabilities.setCapability("screenResolution", "800x600");
    	capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("https://www.bingohall.ag/");
		//driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();

		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
		kb.sendKeys(Keys.TAB);
		kb.sendKeys(uniqueComplete);
		driver.findElement(By.xpath(passInput)).click();
		driver.findElement(By.xpath(passInput)).sendKeys(uniqueComplete+"passaaaa");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//iver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//kb.sendKeys(Keys.ENTER);
		WebDriverWait wait_phone = new WebDriverWait(driver,30);
		wait_phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).sendKeys("0555512345");
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		
	}
	
	@Test
	 public void testRegistration_Short_IPhone_6Plus() throws Exception
	 {
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");
		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48.0");
		caps.setCapability("deviceOrientation", "portrait");
		ChromeDriver driver =  new ChromeDriver(caps);
		driver.get("https://www.bingohall.ag/");
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();
		//selendroidDriver.findElement(By.cssSelector("#sign-in-anchor")).click();
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']")).click();
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
		kb.sendKeys(Keys.TAB);
		kb.sendKeys(uniqueComplete);
		driver.findElement(By.xpath(passInput)).click();
		driver.findElement(By.xpath(passInput)).sendKeys(uniqueComplete+"passaaaa");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a")).click();
		//kb.sendKeys(Keys.ENTER);
		WebDriverWait wait_phone = new WebDriverWait(driver,15);
		wait_phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).sendKeys("0555512345");
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		
	}
	
	@Test
	public void testLongFormSignUp_Android_Nexus6() throws MalformedURLException, InterruptedException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name","Registration_LongForm_Nexus6Resolution");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("70.190.6.230:3128");
		capabilities.setCapability("proxy", proxy);
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("http://tracker1.bingohall.ag/aff_c?offer_id=4&aff_id=1004&aff_sub=theonethatsfortoday");
		//driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		String generatedPhone = "202555"+uniqueComplete.substring(0, uniqueComplete.length() - 9);
		
		
		WebDriverWait waitReload = new WebDriverWait(driver,20);
		waitReload.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
		Keyboard keyboard = ((RemoteWebDriver) driver).getKeyboard();
		keyboard.pressKey(Keys.TAB);
		keyboard.pressKey(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='txtMobile']")).click();
		driver.findElement(By.xpath("//*[@id='txtMobile']")).sendKeys(generatedPhone);
		keyboard.pressKey(Keys.TAB);
		keyboard.sendKeys(uniqueComplete);
		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).click();
		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).sendKeys("mandrutza89miau");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();
		//driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();
		keyboard.sendKeys(Keys.ENTER);
		
		
	}
	
	@Test
	public void testLongFormSignUp_withProxy_Iphone_6Plus() throws MalformedURLException, InterruptedException
	{
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Apple iPhone 6");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("name", "Registration_LongForm_Iphone6Plus6Resolution");
		capabilities.setCapability("platform", "Windows 8");
		capabilities.setCapability("version", "48.0");
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("70.190.6.230:3128");
		capabilities.setCapability("proxy", proxy);
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.get("http://tracker1.bingohall.ag/aff_c?offer_id=4&aff_id=1004&aff_sub=theonethatsfortoday");
		//driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		String generatedPhone = "202555"+uniqueComplete.substring(0, uniqueComplete.length() - 9);
		
		
		WebDriverWait waitReload = new WebDriverWait(driver,20);
		waitReload.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
		WebDriverWait waitResp = new WebDriverWait(driver,15);
		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lastNameInput)).click();
		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailInput)).click();
		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
		Keyboard keyboard = ((RemoteWebDriver) driver).getKeyboard();
		keyboard.pressKey(Keys.TAB);
		keyboard.pressKey(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='txtMobile']")).click();
		driver.findElement(By.xpath("//*[@id='txtMobile']")).sendKeys(generatedPhone);
		keyboard.pressKey(Keys.TAB);
		keyboard.sendKeys(uniqueComplete);
		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).click();
		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).sendKeys("mandrutza89miau");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();
		//driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();
		keyboard.sendKeys(Keys.ENTER);
		
		
	}

//	@Test
//	public void testLongFormSignUp_withProxy_Iphone_6Plus_Germany() throws MalformedURLException, InterruptedException
//	{
//		Map<String, String> mobileEmulation = new HashMap<String, String>();
//		mobileEmulation.put("deviceName", "Apple iPhone 6");
//
//		Map<String, Object> chromeOptions = new HashMap<String, Object>();
//		chromeOptions.put("mobileEmulation", mobileEmulation);
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("149.202.249.227:3128");
//		capabilities.setCapability("proxy", proxy);
//		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//		
//		driver = new ChromeDriver(capabilities);
//		driver.get("http://www.google.com");
//		//driver.manage().window().maximize();
////		String uniqueComplete = String.valueOf(System.currentTimeMillis());
////		WebDriverWait waitReload = new WebDriverWait(driver,20);
////		waitReload.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")));
////		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/div[3]")).click();
////		driver.findElement(By.xpath("//*[@id='sign_in_tabs']"));
////		WebDriverWait waitResp = new WebDriverWait(driver,15);
////		waitResp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtFirstName']")));
////		driver.findElement(By.xpath("//*[@id='txtFirstName']")).click();
////		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("OPnica");
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(lastNameInput)).click();
////		driver.findElement(By.xpath(lastNameInput)).sendKeys("Adriana");
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(emailInput)).click();
////		driver.findElement(By.xpath(emailInput)).sendKeys(uniqueComplete + "@mail.com");
////		Keyboard keyboard = ((RemoteWebDriver) driver).getKeyboard();
////		keyboard.pressKey(Keys.TAB);
////		keyboard.pressKey(Keys.TAB);
////		driver.findElement(By.xpath("//*[@id='txtMobile']")).click();
////		driver.findElement(By.xpath("//*[@id='txtMobile']")).sendKeys("0555512345");
////		keyboard.pressKey(Keys.TAB);
////		keyboard.sendKeys(uniqueComplete);
////		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).click();
////		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).sendKeys("mandrutza89miau");
////		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();
////		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();
////		keyboard.sendKeys(Keys.ENTER);
//		
//	}
	
	
}

