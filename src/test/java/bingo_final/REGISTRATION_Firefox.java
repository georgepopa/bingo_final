package bingo_final;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.TestCase;

public class REGISTRATION_Firefox extends TestCase {
	public final String signUpBtnAndLogIn = "//*[@id='ng-app']/body/div[1]/header/div/div[4]";
	public final String RegistrationBox = "//*[@id='sign_in_tabs']/div/div";
	public final String firstNameInput = "//*[@id='txtFirstName']";
	public final String lastNameInput = "//*[@id='txtLastName']";
	public final String emailInput = "//*[@id='txtEmail']";
	public final String usernameInput = "//*[@id='txtUsername']";
	public final String passwordInput = "//*[@id='txtSignupPassword']";
	public final String signUpButton = "//*[@id='short_form']/fieldset/div[9]/a";
	public final String phoneInput = "//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input";
	public final String verifyBtn = "//*[@id='short_form_phone']/div[3]/a";
	public FirefoxDriver driver;
	public final String USERNAME = "adrianaonica1989";
	public final String ACCESS_KEY = "72c775ee-cb8a-4772-87ed-e2db70e5994a";
	public final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public REGISTRATION_Firefox(String name) {
		super(name);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\adriana-tst\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testInvalidFirstname() throws MalformedURLException
	{
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		 caps.setCapability("name", "testInvalidFirstNameFormat");
		 caps.setCapability("platform", "Windows 8");
		 caps.setCapability("version", "44");
		 FirefoxDriver driver = new FirefoxDriver(caps);
		 driver.navigate().to("https://www.bingohall.ag/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(signUpBtnAndLogIn));
		 driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		 Keyboard keyboard = driver.getKeyboard();
		 WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		 waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		 WebElement e2 = driver.findElement(By.xpath(firstNameInput));
		 e2.click();
		 e2.sendKeys("Onica"+"26101989");
		 e2.click();
    	 WebElement e3 = driver.findElement(By.xpath(lastNameInput));
    	 e3.click();
    	 e2.click();
    	 
	}
	
	@Test
	public void testInvalidLastname() throws MalformedURLException
	{
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		 caps.setCapability("name", "testInvalidLastNameFormat");
		 caps.setCapability("platform", "Windows 8");
		 caps.setCapability("version", "44");
		 FirefoxDriver driver = new FirefoxDriver(caps);
		 driver.navigate().to("https://www.bingohall.ag/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(signUpBtnAndLogIn));
		 driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		 Keyboard keyboard = driver.getKeyboard();
		 WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		 waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(lastNameInput)));
		 WebElement e2 = driver.findElement(By.xpath(lastNameInput));
		 e2.click();
		 e2.sendKeys("Adriana"+"26101989");
		 e2.click();
		 WebElement e3 = driver.findElement(By.xpath(emailInput));
		 e3.click();
		 e2.click();
		
	}
	
	@Test
	public void testInvalidEmail() throws MalformedURLException
	{
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		 caps.setCapability("name", "testInvalidEmailFormat");
		 caps.setCapability("platform", "Windows 8");
		 caps.setCapability("version", "44");
		 FirefoxDriver driver = new FirefoxDriver(caps);
		 driver.navigate().to("https://www.bingohall.ag/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(signUpBtnAndLogIn));
		 driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		 Keyboard keyboard = driver.getKeyboard();
		 WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		 waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailInput)));
		 WebElement e2 = driver.findElement(By.xpath(emailInput));
		 e2.click();
		 e2.sendKeys("invalidEmailwithout@");
		 e2.click();
		 WebElement e3 = driver.findElement(By.xpath(passwordInput));
		 e3.click();
		 e2.click();
		
	}
	
	@Test
	public void testPasswordTooShort() throws MalformedURLException
	{
		 DesiredCapabilities caps = DesiredCapabilities.firefox();
		 caps.setCapability("name", "testPasswordTooShort");
		 caps.setCapability("platform", "Windows 8");
		 caps.setCapability("version", "44");
		 FirefoxDriver driver = new FirefoxDriver(caps);
		 driver.navigate().to("https://www.bingohall.ag/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(signUpBtnAndLogIn));
		 driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		 Keyboard keyboard = driver.getKeyboard();
		 WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		 waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordInput)));
		 WebElement e2 = driver.findElement(By.xpath(passwordInput));
		 e2.click();
		 e2.sendKeys("12");
		 WebElement e3 = driver.findElement(By.xpath(lastNameInput));
		 e3.click();
		 e2.click();
		 
	}
	
	@Test
	public void testInvalidPhoneFormat() throws MalformedURLException
	{
		 
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("name", "Bingohall-signUp-InvalidPhone_Firefox");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "44.0");
	    FirefoxDriver driver = new FirefoxDriver(caps);
	    driver.navigate().to("https://www.bingohall.ag/");
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		
		
		//WebElement e1 = driver.findElement(By.xpath("//*[@id='sign-up-anchor']"));
		driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		Keyboard keyboard = driver.getKeyboard();
		
		WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		WebElement e2 = driver.findElement(By.xpath(firstNameInput));
		e2.click();
		e2.sendKeys("Onica");
		WebElement e3 = driver.findElement(By.xpath(lastNameInput));
		e3.click();
		e3.sendKeys("Adriana");
		WebElement e4 = driver.findElement(By.xpath(emailInput));
		e4.click();
		e4.sendKeys(uniqueComplete + "@gmail.com");
		keyboard.pressKey(Keys.TAB);
		keyboard.pressKey(uniqueComplete);
		WebElement e5 = driver.findElement(By.xpath(passwordInput));
		e5.click();
		e5.sendKeys("Mandrutza89miau");
		WebElement e6 = driver.findElement(By.xpath(signUpButton));
		e6.click();
		Keyboard k = driver.getKeyboard();
		k.pressKey(Keys.ENTER);
	    WebDriverWait wait4Phone = new WebDriverWait(driver,15); 
	   // wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[3]")));	
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("055551234ea5");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
	}
	
	//Test short form registration on www.bingohall.ag
	@Test
	 public void testShortFormSignUp() throws MalformedURLException, InterruptedException
	  {	
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		FirefoxDriver driver = new FirefoxDriver(caps);
		caps.setCapability("name", "testShortSignUpForm");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "44");
		//RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.navigate().to("https://www.bingohall.ag/");
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		String generatedPhone = "202555"+uniqueComplete.substring(0, uniqueComplete.length() - 9);
		//WebElement e1 = driver.findElement(By.xpath("//*[@id='sign-up-anchor']"));
		driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		Keyboard keyboard = driver.getKeyboard();
		
		WebDriverWait waitRegBox = new WebDriverWait(driver,15);
		waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		WebElement e2 = driver.findElement(By.xpath(firstNameInput));
		e2.click();
		e2.sendKeys("Onica");
		WebElement e3 = driver.findElement(By.xpath(lastNameInput));
		e3.click();
		e3.sendKeys("Adriana");
		WebElement e4 = driver.findElement(By.xpath(emailInput));
		e4.click();
		e4.sendKeys(uniqueComplete + "@gmail.com");
		keyboard.pressKey(Keys.TAB);
		keyboard.pressKey(uniqueComplete);
		WebElement e5 = driver.findElement(By.xpath(passwordInput));
		e5.click();
		e5.sendKeys("Mandrutza89miau");
		WebElement e6 = driver.findElement(By.xpath(signUpButton));
		e6.click();
		Keyboard k = driver.getKeyboard();
		k.pressKey(Keys.ENTER);
	    WebDriverWait wait4Phone = new WebDriverWait(driver,15); 
	   // wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[3]")));	
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys(generatedPhone);
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
//		WebDriverWait wait_verify = new WebDriverWait(driver,20);
//		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
//		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[7]/a/span"));

	}
	
	@Test
	public void testLongFormSignUp() throws MalformedURLException
	{
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		caps.setCapability("name", "testLongSignUpForm");
	    caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "44.0");
//    	Proxy proxy = new Proxy();
//		proxy.setHttpProxy("70.190.6.230:3128");
//		caps.setCapability("proxy", proxy);
	    FirefoxDriver driver = new FirefoxDriver(caps);
    	driver.navigate().to("http://tracker1.bingohall.ag/aff_c?offer_id=4&aff_id=1004&aff_sub=theonethatsfortoday");
    	WebElement e1 = driver.findElement(By.xpath("//*[@id='sign-up-anchor']"));
    	driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		WebDriverWait waitRegBox = new WebDriverWait(driver,15);
		waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		WebElement e2 = driver.findElement(By.xpath(firstNameInput));
		e2.click();
		e2.sendKeys("Onica");
		WebElement e3 = driver.findElement(By.xpath(lastNameInput));
		e3.click();
		e3.sendKeys("Adriana");
		WebElement e4 = driver.findElement(By.xpath(emailInput));
		e4.click();
		e4.sendKeys(uniqueComplete + "@gmail.com");
		Keyboard keyboard = ((RemoteWebDriver) driver).getKeyboard();
		keyboard.pressKey(Keys.TAB);
		keyboard.pressKey(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='txtMobile']")).click();
		driver.findElement(By.xpath("//*[@id='txtMobile']")).sendKeys("2038356330");
		keyboard.pressKey(Keys.TAB);
		keyboard.sendKeys(uniqueComplete);
		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).click();
		driver.findElement(By.xpath("//*[@id='txtSignupPassword']")).sendKeys("mandrutza89miau");
		driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[11]/a")).click();

	}
	
		
		
		
		
		
		
		
	}

