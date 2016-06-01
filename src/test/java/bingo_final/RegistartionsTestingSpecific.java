package bingo_final;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RegistartionsTestingSpecific extends TestCase {
	public final String RegistrationBox = "//*[@id='registerForm']";
	public final String firstNameInput = "//*[@id='txtFirstName']";
	public final String lastNameInput = "//*[@id='txtLastName']";
	public final String emailInput = "//*[@id='txtEmail']";
	public final String usernameInput = "//*[@id='txtUsername']";
	public final String passwordInput = "//*[@id='txtPassword']";
	public final String confirmpassInput ="//*[@id='txtConfirm_password']";
	public final String signUpButton = "//*[@id='registerForm']/div[8]/button";
	public final String signUpBtnLongForm = "//*[@id='registerForm']/div[3]/div/div[2]/button";
	public final String phoneInput = "//*[@id='txtPhone']";
	public final String verifyBtn = "//*[@id='short_form_phone']/div[3]/a";
	public ChromeDriver driver;
	public final String pushCrewAlert = "//*[@id='ng-app']/body/div[10]";
	public final String pushCrewNotOKBtn = "body > div.pushcrew-chrome-style-notification.pushcrew-chrome-style-notification-safari > div > div:nth-child(3) > div.pushcrew-button-wrapper > button.pushcrew-chrome-style-notification-btn.pushcrew-btn-close";
	public final String phoneVerificationBox = "//*[@id='phone-validation-popup']/div/div";
	public final String phoneVerificationButton = "//*[@id='short_form_phone']/div[3]/a";
	public final String phoneCodexpath = "//*[@id='ddlPhoneCodes']";
	public final String mobileXpath = "//*[@id='txtMobile']";
	public final String joinFunBtn = "//*[@id='ng-app']/body/div[1]/div[1]/div[1]/div/div[2]/div/div/a";
	public final String countrySelect = "regionSelect";
	public final String regionSelect = "//*[@id='ddlState']/option[2]";
	//public final String RegionCapital = "//*[@id='ddlState']/option[15]";
	public final String cityXpath = "//*[@id='txtCity']";
	public final String addressXpath = "//*[@id='txtAddress']";
	public final String zipcodeXpath = "//*[@id='txtZip']";
	public final String femaleGender = "//*[@id='txtGenderFemale']";
	public final String casinosPecificRegisterBtn = "/html/body/div[2]/div/p[2]/button";
	public final String rightSideJoinBtn = "/html/body/div[1]/div[1]/div[1]/div/div[2]/div/center/a";
	public final String joinBtn2  = "/html/body/div[1]/div[2]/div[2]/div/a";
	public final String joinBtn3 = "/html/body/div/div[1]/div[1]/div/div[2]/div[1]/center/a";
	public final String RegFormCasino = "/html/body/div[9]/div/div";
	public final String CasinoFirstNameInput = "//*[@id='registration-popup']/div[3]/form[1]/div/div[1]/div[1]/input";
	public final String CasinoLastNameInput = "//*[@id='registration-popup']/div[3]/form[1]/div/div[1]/div[2]/input";
	public final String CasinoEmailInput = "//*[@id='registration-popup']/div[3]/form[1]/div/div[2]/div/input";
	public final String CasinoUserNameInput = "//*[@id='registration-popup']/div[3]/form[1]/div/div[3]/div/input";
	public final String CasinoPasswordInput = "//*[@id='registration-popup']/div[3]/form[1]/div/div[4]/div/input";
	public final String CasinoSignAppBtn = "//*[@id='registration-popup']/div[3]/form[1]/div/div[6]/div/button";
	public final String CasinoMobileForm = "/html/body/div[8]/div/div";
	public final String CasinoPhoneNumberInput = "//*[@id='txtPhone']";
	public final String CasinoveryFyBtn = "//*[@id='registration-popup']/div[3]/form[2]/div/div[3]/div/button";
	public final String mobileFormxClose  ="/html/body/div[2]/div/div/div[1]/button/i";
	
	
	
	public RegistartionsTestingSpecific(String name) {
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
	public void testBingoHall_30Free() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/lp/vp/pfp/30-free");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement rgBtn = driver.findElement(By.xpath(signUpButton));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
	//	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[6]/span[2]")).getText()=="$30.00");
		
	}
	
	@Test
	public void testBingo_120Free() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/lp/vp/pfp/120-free-a");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
		WebElement countryCode = driver.findElement(By.xpath(phoneCodexpath));
		countryCode.click();
		countryCode.sendKeys("+93");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement rgBtn = driver.findElement(By.xpath(signUpButton));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
		
	}
//
	@Test
	public void test_150Free() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/lp/150free/150216?unminify=1");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement joinFun = driver.findElement(By.xpath(joinFunBtn));
		joinFun.click();
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement rgBtn = driver.findElement(By.xpath(signUpButton));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
//		
	}
	
	@Test
	public void test_50Free() throws InterruptedException
	{
		//Run hideMyAss VPN executable choose another ip and load the test again
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/lp/50free/150216");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement joinFun = driver.findElement(By.xpath(joinFunBtn));
		joinFun.click();
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement mobile = driver.findElement(By.xpath(mobileXpath));
		mobile.click();
		mobile.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement confirmPass = driver.findElement(By.xpath(confirmpassInput));
		confirmPass.click();
		confirmPass.sendKeys("Mandrutza89miau");
		WebElement genderF = driver.findElement(By.xpath(femaleGender));
		genderF.click();
		WebElement city = driver.findElement(By.xpath(cityXpath));
		city.click();
		city.sendKeys("Kabul");
		WebElement address = driver.findElement(By.xpath(addressXpath));
		address.click();
		address.sendKeys("Kabul Street nr 45");
		WebElement zip = driver.findElement(By.xpath(zipcodeXpath));
		zip.click();
		zip.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7));
		WebElement rgBtn = driver.findElement(By.xpath(signUpBtnLongForm));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
	}
//	
	@Test
	public void test_brandLpBhl1() throws InterruptedException
	{
		//Run hideMyAss VPN executable choose another ip and load the test again
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/lp/brand-lp-bhl");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement joinFun = driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/div[2]/div[1]/div[1]/div[2]/div/div/a"));
		joinFun.click();
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement mobile = driver.findElement(By.xpath(mobileXpath));
		mobile.click();
		mobile.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement confirmPass = driver.findElement(By.xpath(confirmpassInput));
		confirmPass.click();
		confirmPass.sendKeys("Mandrutza89miau");
		WebElement genderF = driver.findElement(By.xpath(femaleGender));
		genderF.click();
		WebElement city = driver.findElement(By.xpath(cityXpath));
		city.click();
		city.sendKeys("Kabul");
		WebElement address = driver.findElement(By.xpath(addressXpath));
		address.click();
		address.sendKeys("Kabul Street nr 45");
		WebElement zip = driver.findElement(By.xpath(zipcodeXpath));
		zip.click();
		zip.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7));
		WebElement rgBtn = driver.findElement(By.xpath(signUpBtnLongForm));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
	}
//	
	@Test
	public void test_brandLpBhl() throws InterruptedException
	{
		//Run hideMyAss VPN executable choose another ip and load the test again
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.vicsbingo.ag/lp/brand-lp-vcb?unminify=1");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement joinFun = driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/div[2]/div[1]/div[1]/div[2]/div/div/a"));
		joinFun.click();
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement mobile = driver.findElement(By.xpath(mobileXpath));
		mobile.click();
		mobile.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement confirmPass = driver.findElement(By.xpath(confirmpassInput));
		confirmPass.click();
		confirmPass.sendKeys("Mandrutza89miau");
		WebElement genderF = driver.findElement(By.xpath(femaleGender));
		genderF.click();
		WebElement city = driver.findElement(By.xpath(cityXpath));
		city.click();
		city.sendKeys("Kabul");
		WebElement address = driver.findElement(By.xpath(addressXpath));
		address.click();
		address.sendKeys("Kabul Street nr 45");
		WebElement zip = driver.findElement(By.xpath(zipcodeXpath));
		zip.click();
		zip.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7));
		WebElement rgBtn = driver.findElement(By.xpath(signUpBtnLongForm));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
	}
	
	@Test
	public void test_tabooRoom_bfm() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingoformoney.ag/lp/taboo-room-bfm?unminify=1");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement joinWild = driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/div[1]/div[1]/div/div[2]/div/div/a"));
		joinWild.click();
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
//		WebElement countryCode = driver.findElement(By.xpath(phoneCodexpath));
//		countryCode.click();
//		countryCode.sendKeys("+93");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement rgBtn = driver.findElement(By.xpath(signUpButton));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
		
	}
	
	@Test
	public void test_brand_lp_bfm() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingoformoney.ag/lp/brand-lp-bfm?unminify=1");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement joinFun = driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/div[2]/div[1]/div[1]/div[2]/div/div/a"));
		joinFun.click();
		WebElement usrName = driver.findElement(By.xpath(usernameInput));
		usrName.click();
		usrName.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement pass = driver.findElement(By.xpath(passwordInput));
		pass.click();
		pass.sendKeys("Mandrutza89miau");
		WebElement email = driver.findElement(By.xpath(emailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(6)+"@yahoo.com");
//		WebElement countryCode = driver.findElement(By.xpath(phoneCodexpath));
//		countryCode.click();
//		countryCode.sendKeys("+93");
		WebElement phone = driver.findElement(By.xpath(phoneInput));
		phone.click();
		phone.sendKeys("555512345");
		WebElement fName = driver.findElement(By.xpath(firstNameInput));
		fName.click();
		fName.sendKeys("AdrianaQAEng");
		WebElement lName = driver.findElement(By.xpath(lastNameInput));
		lName.click();
		lName.sendKeys("Adriana");
		WebElement rgBtn = driver.findElement(By.xpath(signUpButton));
		rgBtn.click();
		WebDriverWait waitPhone = new WebDriverWait(driver,15);
		waitPhone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneVerificationBox)));
		WebElement modalDialogPhone = driver.findElement(By.xpath(phoneVerificationBox));
		WebElement verifyPhoneBtn = driver.findElement(By.xpath(phoneVerificationButton));
		verifyPhoneBtn.click();
		WebDriverWait wait_confirmPhoneVerify = new WebDriverWait(driver,20);
		wait_confirmPhoneVerify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pushCrewAlert)));
		driver.findElement(By.cssSelector(pushCrewNotOKBtn)).click();
		
	}
	
	@Test
	public void testLanding_goodGirlBadGirl() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/landing/goodgirlbadgirl");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath(casinosPecificRegisterBtn));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();

	    
		
	}
	
	@Test
	public void testrichLanding1() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/landing/280316");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath(rightSideJoinBtn));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
	}
//	
	@Test
	public void testrichLanding2() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/landing/040316b");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath(joinBtn2));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
		
	}
	
	@Test
	public void testLandingRich3() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/landing/190116");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath(joinBtn3));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
	}
	
	@Test
	public void testLandingRich41() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/landing/010116");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath(joinBtn3));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
	}
	
	@Test
	public void testLandingRich4() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/landing/040316b");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath(joinBtn2));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
	}
	
	@Test
	public void test_bingoAff1() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/adpage?sourceID=131393");
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		
		
		//WebElement e1 = driver.findElement(By.xpath("//*[@id='sign-up-anchor']"));
//		driver.findElement(By.xpath(signUpBtnAndLogIn));
//		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
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
		WebElement e5 = driver.findElement(By.xpath("//*[@id='txtSignupPassword']"));
		e5.click();
		e5.sendKeys("Mandrutza89miau");
		WebElement e6 = driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a"));
		e6.click();
		Keyboard k = driver.getKeyboard();
		k.pressKey(Keys.ENTER);
	    WebDriverWait wait4Phone = new WebDriverWait(driver,15); 
	   // wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[3]")));	
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).sendKeys("0555512345");
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a"));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		WebDriverWait wait_verify = new WebDriverWait(driver,20);
		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[7]/a/span"));
//		
	}
	
	@Test
	public void test_bingoAff2()
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.bingohall.ag/adpage?sourceID=131393");
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		
		
		//WebElement e1 = driver.findElement(By.xpath("//*[@id='sign-up-anchor']"));
//		driver.findElement(By.xpath(signUpBtnAndLogIn));
//		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
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
		WebElement e5 = driver.findElement(By.xpath("//*[@id='txtSignupPassword']"));
		e5.click();
		e5.sendKeys("Mandrutza89miau");
		WebElement e6 = driver.findElement(By.xpath("//*[@id='short_form']/fieldset/div[9]/a"));
		e6.click();
		Keyboard k = driver.getKeyboard();
		k.pressKey(Keys.ENTER);
	    WebDriverWait wait4Phone = new WebDriverWait(driver,15); 
	   // wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[3]")));	
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input")).sendKeys("0555512345");
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a"));
		driver.findElement(By.xpath("//*[@id='short_form_phone']/div[3]/a")).click();
		WebDriverWait wait_verify = new WebDriverWait(driver,20);
		wait_verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[7]/a/span"));
	}
	
	@Test
	public void testRichAff1() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/?sourceID=20018444");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath("//*[@id='main-header']/div/div/div[2]/a[2]"));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
	}
	
	@Test
	public void testRichAff2() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Bingohall-signUp-ShortForm");
		caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "48.0");
	    ChromeDriver driver = new ChromeDriver(caps);
	    driver.get("https://www.richcasino.com/?sourceID=20018460");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement registerlanding = driver.findElement(By.xpath("//*[@id='main-header']/div/div/div[2]/a[2]"));
		registerlanding.click();
		WebElement firstname = driver.findElement(By.xpath(CasinoFirstNameInput)); 
		firstname.click();
		firstname.sendKeys("azsxdc");
		WebElement lastname = driver.findElement(By.xpath(CasinoLastNameInput));
		lastname.click();
		lastname.sendKeys("plokij");
		WebElement email = driver.findElement(By.xpath(CasinoEmailInput));
		email.click();
		email.sendKeys(String.valueOf(System.currentTimeMillis()).substring(7)+"@gmail.com");
		WebElement username = driver.findElement(By.xpath(CasinoUserNameInput));
		username.click();
		username.sendKeys(String.valueOf(System.currentTimeMillis()));
		WebElement password = driver.findElement(By.xpath(CasinoPasswordInput));
		password.click();
		password.sendKeys("Mandrutza89miau");
		WebElement SingUp = driver.findElement(By.xpath(CasinoSignAppBtn));
		SingUp.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='txtPhone']")).click();
		driver.findElement(By.xpath("//*[@id='txtPhone']")).sendKeys("745661909");
		driver.findElement(By.xpath(CasinoveryFyBtn));
		driver.findElement(By.xpath(CasinoveryFyBtn)).click();
	}
}
