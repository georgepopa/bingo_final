package bingo_final;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpMethod;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.openqa.selenium.JavascriptExecutor;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Profile_BINGO_Chrome extends TestCase {
	public final String signUpBtnAndLogIn = "//*[@id='ng-app']/body/div[1]/header/div/div[4]";
	public final String LoginButton = "#sign-in-anchor";
	public final String RegistrationBox = "//*[@id='sign_in_tabs']/div/div";
	public final String firstNameInput = "//*[@id='txtFirstName']";
	public final String lastNameInput = "//*[@id='txtLastName']";
	public final String emailInput = "//*[@id='txtEmail']";
	public final String usernameInput = "//*[@id='txtUsername']";
	public final String passwordInput = "//*[@id='txtSignupPassword']";
	public final String passwordLogin = "//*[@id='txtPassword']";
	public final String signUpButton = "//*[@id='short_form']/fieldset/div[9]/a";
	public final String phoneInput = "//*[@id='short_form_phone']/fieldset/div[2]/div[1]/div[2]/input";
	public final String verifyBtn = "//*[@id='short_form_phone']/div[3]/a";
	public ChromeDriver driver;
	public final String cardInformation = "//*[@id='form1']/h1";
	public final String preCashier_firstname = "//*[@id='firstName']";
	public final String preCashier_lastName = "//*[@id='lastName']";
	public final String imageAvatar = "//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[1]/span/img";
	public final String profileAvatar = "//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[1]/span/i";
	public final String minimikzeLiveCHAT = "//*[@id='minimize']";
	public final String bingoPopUn = "//*[@id='ng-app']/body/div[12]";
	public final String notOk = "//*[@id='ng-app']/body/div[12]/div/div[3]/div[1]/button[1]";
	public final String profileDropMenu = "//*[@id='dropdown-account']";
	public final String profimeMenuItem = "//*[@id='dropdown-account']/ul/li[3]/a";
	public final String depositBtn = "//*[@id='ng-app']/body/div[1]/header/div/nav[2]/ul/li[7]/a";
	public final String firstNameInputProfilePage = "//*[@id='txtFirst']";
	public final String lastNameInputProfilePage = "//*[@id='txtLast']";
	public final String countryProfilePage = "//*[@id='ddlCountry']";
	public final String stateProfile = "//*[@id='ddlState']";
	public final String cityprofile = "//*[@id='txtCity']";
	public final String zipProfile = "//*[@id='zipCode']";
	public final String addressProfile = "//*[@id='txtAddress']";
	public final String mobileProfile = "//*[@id='txtMobilePhone']";
	public final String phoneProfile = "//*[@id='txtPhone']";
	public final String emailProfile = "//*[@id='txtEmail']";
	public final String genderProfile = "//*[@id='ddlGender']";
	public final String dropbox1Profile = "//*[@id='edit_profile_form']/div[1]/div[1]/div/select";
	public final String updateInformationBtn = "//*[@id='edit_profile_form']/div[10]/input";
	public final String saveChangesForm ="//*[@id='ng-app']/body/div[11]/div/div"; 
	public final String saveChangesoK = "//*[@id='ng-app']/body/div[11]/div/div/div[2]/button[2]";
	public final String cardNumberInput = "//*[@id='cardNumber']";
	public final String CVVInput = "//*[@id='cvv']";
	public final String expCardMonth = "//*[@id='expMonth']";
	public final String expCardYear = "//*[@id='expYear']";
	public final String amountDropBox = "//*[@id='amount']";
	public final String cardBillingAddress = "//*[@id='address']";
	public final String cashierDepositBtn = "//*[@id='deposit']";
	public final String stateBilling = "//*[@id='state']";
	public final String userDayOfBirth = "//*[@id='birthday']/option[15]";
	public final String userMonthOfBirth ="//*[@id='birthmonth']/option[2]";
	public final String userYearOfBirth = "//*[@id='birthYear']/option[4]";
	public final String depositRequestMsg = "//*[@id='wdrl-cont']/h1";
	public final String UserMessages = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[1]/div/ul[1]/li[3]/a";
	public final String newMessageBtn = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/a";
	public final String LoginBtn = "//*[@id='login_form']/div[5]/button";
	public final String helloFriendPredefMsg = "//*[@id='new-message-popup']/form/div[2]/ul/li[1]";
	public final String predefHelloMsgsList ="//*[@id='friends']/ul";
	public final String sendMessage = "//*[@id='btnSubmit']";
	public final String sentMsgs = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/a";
	public final String inboxMsgs = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/a";
	public final String checkMsgs = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/div/div[1]/input";
	public final String deleteMsgsBtn = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/a[1]/span";
	public final String confirmationDelMsgs = "//*[@id='ng-app']/body/div[11]/div/div";
	public final String trashMsgs = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[3]/a";
	public final String notoficationFlash = "//*[@id='globeCountValue']";
	public final String FriendsMenuItem = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[1]/div/ul[2]/li/a";
	public final String friendSearchTextBox = "//*[@id='txtSearchFriend']";
	public final String searchFriendBtn = "//*[@id='btnSearchFriend']";
	public final String addFriendBtn = "//*[@id='contentWrapper']/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/a[1]";
	public final String tooltipAddFriend = "//*[@id='friendsYouMayKnow']/div[1]/div/div[1]/ul/li/a";
	public final String requestsSentDiv = "//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div[3]";
	public final String friendsNotofication = "//*[@id='requests']/i";
	public final String findFriendsMenu = "//*[@id='requestsContent']/div[1]/div/a";
	public final String friendsFromLayoutMenu ="//*[@id='dropdown-account']/ul/li[4]/a"; 
	public final String friendsNotificationsNumber = "//*[@id='requests']/span";
	public final String logoutFromProfile = "//*[@id='dropdown-account']/ul/li[13]/a";
	public final String cancelrequest = "//*[@id='requestsContentItems']/div/div[2]/div/input[2]";
	public final String acceptRequest = "//*[@id='requestsContentItems']/div/div[2]/div/input[1]";
	public final String deleteFriend = "//*[@id='contentWrapper']/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/a[1]";
	public final String transferFundsProfile = "//*[@id='dropdown-account']/ul/li[8]/a";
	public final String reportsProfile = "//*[@id='dropdown-account']/ul/li[9]/a";
	public final String reportsDatePickers = "//*[@id='reconcile_form']/div/div[2]/div";
	public final String openTicketProfile = "//*[@id='dropdown-account']/ul/li[11]/a";
	public final String openTicketForm = "#view-offline-form";
	public final String ticketName = "//*[@id='name']";
	public final String ticketSubject = "//*[@id='subject']";
	public final String ticketMessage = "//*[@id='container_3_3']";
	public final String ticketEmail = "//*[@id='email']";
	public final String departamentselect = "//*[@id='container_5']/p/select";
	public final String departamentOption1 = "//*[@id='container_5_5_0']";
	public final String departamentOption2 = "//*[@id='container_5_5_1']";
	public final String departmentOption3 = "//*[@id='container_5_5_2']";
	public final String departmentOption4 = "//*[@id='container_5_5_3']";
	public final String departmentOption5 = "//*[@id='container_5_5_4']"; 
	public final String leaveMessage = "//*[@id='container_7']/p/input";
	public final String virtualTourProfilemenu = "//*[@id='dropdown-account']/ul/li[12]/a";
	public final String videoIframeBHL = "//*[@id='framework']/div[2]/section[1]/div/div[3]/iframe";
	public final String RegRedirectIntro = "//*[@id='framework']/div[2]/section[2]/div/div/div/div/a";
	public final String RegRedirectFooter = "//*[@id='framework']/div[2]/section[6]/div/div[2]/a";
	public final String bingoMainMenu = "//*[@id='body']/div[1]/header/div/nav";
	public final String GamesMenuItem = "//*[@id='body']/div[1]/header/div/nav/ul[1]/li[2]/a";
	public final String promotionsMenuItem = "//*[@id='body']/div[1]/header/div/nav[1]/ul[1]/li[3]/a";
	public final String promotionsContainer = "//*[@id='promotions-container']";
	//	public final String USERNAME = "adrianaonica1989";
//	public final String ACCESS_KEY = "72c775ee-cb8a-4772-87ed-e2db70e5994a";
//	public final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public Profile_BINGO_Chrome(String name) {
		super(name);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adriana-tst\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testFieldsOnFirstRegistration() throws InterruptedException
	{
		
		//First delete cookies and clear cache
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Create a new account
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.className("cashier-iframe")));
		driver.switchTo().frame("frame1");
		Thread.sleep(60000);
		driver.close();		
}
	
////////	Set in HdeMyAss vpn address
	@Test
	public void testFieldsOnFirstRegistration_Proxy() throws InterruptedException, IOException 
	{
		//Add vpn address
		
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\HMA! Pro VPN\\bin\\HMA! Pro VPN.exe").destroyForcibly();
		Thread.sleep(25000);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Registration RichCasino Chrome");
		caps.setCapability("platform","Windows 8");
		caps.setCapability("version", "48");
		ChromeOptions options = new ChromeOptions();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(caps);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//Add vpn address using hideMyAss VPN
		driver.get("http://dbingohall.ag/");
		driver.manage().deleteAllCookies();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[12]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[12]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]/div/div")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]/div/div/div[3]/center/a")).click();
		
		//disconnect vpn 
	}
	
	@Test
	public void testProfileDetailsFromMenu() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Create a new account
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
//		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[12]")));
//		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[12]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(profileAvatar)).click();
		driver.findElement(By.xpath(profimeMenuItem)).click();
		driver.close();
		}

	@Test
	public void testFieldsAfterDepositClicked() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Registration RichCasino Chrome");
		caps.setCapability("platform","Windows 8");
		caps.setCapability("version", "48");
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("149.215.113.110:70");
//		caps.setCapability("proxy", proxy);
		ChromeOptions options = new ChromeOptions();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(caps);
		driver.manage().window().maximize();
		driver.get("http://bingohall.ag/");
		driver.manage().deleteAllCookies();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(depositBtn)).click();
		driver.close();
	}

	@Test
	public void testupdateProfileInformation() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Create a new account
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
//		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[12]")));
//		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[12]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(profileAvatar)).click();
		driver.findElement(By.xpath(profimeMenuItem)).click();
		WebDriverWait wait_profile = new WebDriverWait(driver,10);
		wait_profile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInputProfilePage)));
		driver.findElement(By.xpath(firstNameInputProfilePage)).click();
		String keyboardBtns = "qazwsxedcrfvtgbyhnujmiklop";
		String firstNameGenerated = keyboardBtns.substring(10);
		String keyboardBtnsReversed = "plmokijnuhbygvtfcrdxeszwaq";
		String lastNameGenerated = keyboardBtnsReversed.substring(10);
		driver.findElement(By.xpath(firstNameInputProfilePage)).sendKeys(firstNameGenerated);
		driver.findElement(By.xpath(lastNameInputProfilePage)).click();
		driver.findElement(By.xpath(lastNameInputProfilePage)).sendKeys(lastNameGenerated);
		driver.findElement(By.xpath(countryProfilePage)).click();
		driver.findElement(By.xpath(countryProfilePage +"/option[11]")).click();
		driver.findElement(By.xpath(cityprofile)).clear();
		driver.findElement(By.xpath(cityprofile)).sendKeys("Bucharest");
		driver.findElement(By.xpath(stateProfile)).click();
		driver.findElement(By.xpath(addressProfile)).click();
		driver.findElement(By.xpath(addressProfile)).sendKeys("Street Unamed nr 31");
		driver.findElement(By.xpath(phoneProfile)).click();
		driver.findElement(By.xpath(phoneProfile)).sendKeys("93555512346");
		driver.findElement(By.xpath(emailProfile)).click();
		driver.findElement(By.xpath(emailProfile)).sendKeys(String.valueOf(System.currentTimeMillis())+"@gmail.com");
		driver.findElement(By.xpath(genderProfile)).click();
		driver.findElement(By.xpath(genderProfile+"/option[2]")).click();
		driver.findElement(By.xpath(dropbox1Profile+"/option[4]")).click();
		driver.findElement(By.xpath(updateInformationBtn)).click();
		WebDriverWait wait_modify = new WebDriverWait(driver,15);
		wait_modify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(saveChangesForm)));
		driver.findElement(By.xpath(saveChangesoK)).click();
		WebDriverWait wait_after_save = new WebDriverWait(driver,15);
		wait_after_save.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInputProfilePage)));
		//Thread.sleep(60000);
		driver.close();
		
	}

	@Test
	public void testProfileAfterRealCardDeposit_firstRegisterCard() throws IOException, InterruptedException
	{
		//Runtime.getRuntime().exec("C:\\Program Files (x86)\\HMA! Pro VPN\\bin\\HMA! Pro VPN.exe");
		//Thread.sleep(20000);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Registration RichCasino Chrome");
		caps.setCapability("platform","Windows 8");
		caps.setCapability("version", "48");
		ChromeOptions options = new ChromeOptions();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(caps);
		driver.manage().window().maximize();
		driver.get("https://bingohall.ag/");
		driver.manage().deleteAllCookies();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		Keyboard keyboard = driver.getKeyboard();
		WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		WebElement e2 = driver.findElement(By.xpath(firstNameInput));
		e2.click();
		e2.sendKeys("Bertrand");
		WebElement e3 = driver.findElement(By.xpath(lastNameInput));
		e3.click();
		e3.sendKeys("Cantin");
		WebElement e4 = driver.findElement(By.xpath(emailInput));
		e4.click();
		e4.sendKeys("BertrandCantin"+uniqueComplete+"@inbound.plus");
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0139400214");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
//		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]/div/div")));
//		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]/div/div/div[3]/center/a")).click();

		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.className("cashier-iframe")));
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath(cardBillingAddress)).click();
		driver.findElement(By.xpath(cardBillingAddress)).sendKeys("Route du Paradise no.45");
		driver.findElement(By.xpath(cardNumberInput));
		driver.findElement(By.xpath(cardNumberInput)).click();
		driver.findElement(By.xpath(cardNumberInput)).sendKeys("5219649020082889");
		driver.findElement(By.xpath(CVVInput)).click();
		driver.findElement(By.xpath(CVVInput)).sendKeys("136");
		driver.findElement(By.xpath(expCardMonth+"/option[3]")).click();
		driver.findElement(By.xpath(expCardYear+"/option[4]")).click();
		driver.findElement(By.xpath(amountDropBox+"/option[1]")).click();
		driver.findElement(By.xpath(stateBilling)).click();
		driver.findElement(By.xpath(stateBilling)).clear();
		driver.findElement(By.xpath(stateBilling)).sendKeys("Alsacie");
		driver.findElement(By.xpath(userDayOfBirth)).click();
		driver.findElement(By.xpath(userMonthOfBirth)).click();
		driver.findElement(By.xpath(userYearOfBirth)).click();
		driver.findElement(By.xpath(cashierDepositBtn)).click();
		WebDriverWait process_deposit = new WebDriverWait(driver,20);
		process_deposit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(depositRequestMsg)));
	}

	@Test
	public void testProfileAfterRealCardDeposit_SameCard()
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "Registration RichCasino Chrome");
		caps.setCapability("platform","Windows 8");
		caps.setCapability("version", "48");
		ChromeOptions options = new ChromeOptions();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(caps);
		driver.manage().window().maximize();
		driver.get("https://bingohall.ag/");
		driver.manage().deleteAllCookies();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		Keyboard keyboard = driver.getKeyboard();
		WebDriverWait waitRegBox = new WebDriverWait(driver,25);
		waitRegBox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstNameInput)));
		WebElement e2 = driver.findElement(By.xpath(firstNameInput));
		e2.click();
		e2.sendKeys("Bertrand");
		WebElement e3 = driver.findElement(By.xpath(lastNameInput));
		e3.click();
		e3.sendKeys("Cantin");
		WebElement e4 = driver.findElement(By.xpath(emailInput));
		e4.click();
		e4.sendKeys("BertrandCantin"+uniqueComplete+"@inbound.plus");
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0139400214");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
//		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]/div/div")));
//		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]/div/div/div[3]/center/a")).click();

		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.className("cashier-iframe")));
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath(cardBillingAddress)).click();
		driver.findElement(By.xpath(cardBillingAddress)).sendKeys("Route du Paradise no.45");
		driver.findElement(By.xpath(cardNumberInput));
		driver.findElement(By.xpath(cardNumberInput)).click();
		driver.findElement(By.xpath(cardNumberInput)).sendKeys("5219649020082889");
		driver.findElement(By.xpath(CVVInput)).click();
		driver.findElement(By.xpath(CVVInput)).sendKeys("136");
		driver.findElement(By.xpath(expCardMonth+"/option[3]")).click();
		driver.findElement(By.xpath(expCardYear+"/option[4]")).click();
		driver.findElement(By.xpath(amountDropBox+"/option[1]")).click();
		driver.findElement(By.xpath(stateBilling)).click();
		driver.findElement(By.xpath(stateBilling)).clear();
		driver.findElement(By.xpath(stateBilling)).sendKeys("Alsacie");
		driver.findElement(By.xpath(userDayOfBirth)).click();
		driver.findElement(By.xpath(userMonthOfBirth)).click();
		driver.findElement(By.xpath(userYearOfBirth)).click();
		driver.findElement(By.xpath(cashierDepositBtn)).click();
		WebDriverWait process_deposit = new WebDriverWait(driver,20);
		process_deposit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(depositRequestMsg)));

		
		}
	
	@Test
	public void testGames() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		WebDriverWait wait_Change = new WebDriverWait(driver,5);
		wait_Change.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(usernameInput)).click();
		driver.findElement(By.xpath(usernameInput)).sendKeys("1461054815436");
		driver.findElement(By.xpath(passwordLogin)).click();
		driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
		driver.findElement(By.xpath(LoginBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.get("https://www.bingohall.ag/online-games");
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='games-container']")));
		List<WebElement> allGames = driver.findElements(By.cssSelector("div#games-container .iso .gameThumbnail "));
		Iterator<WebElement> iter = allGames.iterator();
		
		while (iter.hasNext())
		{
		
		 iter.next().click();
		 Thread.sleep(10000);
		 driver.switchTo().defaultContent();
		
		}
		//System.out.println(driver.findElement(By.xpath("//*[@id='games-container']")).getAttribute("data-game-code"));
	}
	
	@Test
	public void testUserMessages_FirstReg() throws IOException, InterruptedException
	{
		//At first Registration , a default welcome mail is sent to user.User's inbox equals 1 by default
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Create a new account
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
//		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[12]")));
//		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[12]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(profileAvatar)).click();
		driver.findElement(By.xpath(profimeMenuItem)).click();
		WebDriverWait wait_mess = new WebDriverWait(driver,15);
		wait_mess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserMessages)));
		driver.findElement(By.xpath(UserMessages)).click();
		Assert.assertEquals("1",driver.findElement(By.xpath("//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[1]/div/ul[1]/li[3]/a/span")).getText());
		Assert.assertEquals("BingoHall", driver.findElement(By.xpath("//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]")).getText());
	//	Thread.sleep(60000);
		driver.close();
		
		}
	
	@Test
		public void testUserSendMessage_NoFriends() throws InterruptedException
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Create a new account
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
			wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
			driver.findElement(By.xpath(phoneInput)).click();
			driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
			driver.findElement(By.xpath(verifyBtn));
			driver.findElement(By.xpath(verifyBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
//			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[12]")));
//			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[12]/div/div[3]/div[1]/button[1]")).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			driver.findElement(By.xpath(profileAvatar)).click();
			driver.findElement(By.xpath(profimeMenuItem)).click();
			WebDriverWait wait_mess = new WebDriverWait(driver,15);
			driver.findElement(By.xpath(UserMessages)).click();
			wait_mess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newMessageBtn)));
			driver.findElement(By.xpath(newMessageBtn)).click();
			WebDriverWait wait_composeForm = new WebDriverWait(driver,10);
			wait_composeForm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[2]/div/div[1]")));
		//	Thread.sleep(60000);
			driver.close();
		}
	
	@Test
		public void testUserSendPredifenedMessage() throws Throwable
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Login to an existing account, with one least friend
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
			driver.findElement(By.xpath(signUpBtnAndLogIn));
			driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
			WebDriverWait wait_Change = new WebDriverWait(driver,5);
			wait_Change.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
			driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
			driver.findElement(By.xpath(usernameInput)).click();
			driver.findElement(By.xpath(usernameInput)).sendKeys("1461241278099");
			driver.findElement(By.xpath(passwordLogin)).click();
			driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
			driver.findElement(By.xpath(LoginBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			driver.findElement(By.xpath(profileAvatar)).click();
			driver.findElement(By.xpath(profimeMenuItem)).click();
			WebDriverWait wait_mess = new WebDriverWait(driver,15);
			driver.findElement(By.xpath(UserMessages)).click();
			wait_mess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newMessageBtn)));
			driver.findElement(By.xpath(newMessageBtn)).click();
			wait_mess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='new-message-popup']/form/div[2]/ul/li[1]")));
			driver.findElement(By.xpath("//*[@id='new-message-popup']/form/div[2]/ul/li[1]")).click();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			driver.findElement(By.xpath(predefHelloMsgsList+"/li[1]")).click();
			driver.findElement(By.xpath(sendMessage)).click();
			URL url = new URL("https://www.bingohall.ag/members/ajax_social/doSendMessage");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			Assert.assertTrue(conn.getResponseCode()==200);
			driver.findElement(By.xpath(sentMsgs)).click();
			URL url_sent = new URL("https://www.bingohall.ag/members/messages/sent");
			HttpURLConnection url_sent1 = (HttpURLConnection) url_sent.openConnection();
			Assert.assertTrue(url_sent1.getResponseCode()==200);
			// Delete a message from anywhere
			driver.findElement(By.xpath(sentMsgs)).click();
			driver.findElement(By.xpath(checkMsgs)).click();
			driver.findElement(By.xpath(deleteMsgsBtn)).click();
			wait_mess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[11]/div/div")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[11]/div/div/div[2]/button[2]")).click();
	
			driver.close();
			}	
	
	@Test
		public void testNotification() throws InterruptedException
		{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Login to an existing account, with one least friend
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
		driver.findElement(By.xpath(signUpBtnAndLogIn));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		WebDriverWait wait_Change = new WebDriverWait(driver,5);
		wait_Change.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(usernameInput)).click();
		driver.findElement(By.xpath(usernameInput)).sendKeys("1461241278099");
		driver.findElement(By.xpath(passwordLogin)).click();
		driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
		driver.findElement(By.xpath(LoginBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(notoficationFlash));
		Assert.assertTrue(driver.findElement(By.xpath(notoficationFlash)).getText()!=null);
		//Thread.sleep(60000);
		driver.close();
		}

	@Test
		public void testSearchFriend_ByName() throws InterruptedException
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Create a new account
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
			wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
			driver.findElement(By.xpath(phoneInput)).click();
			driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
			driver.findElement(By.xpath(verifyBtn));
			driver.findElement(By.xpath(verifyBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			driver.findElement(By.xpath(profileAvatar)).click();
			driver.findElement(By.xpath(profimeMenuItem)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FriendsMenuItem)));
			driver.findElement(By.xpath(FriendsMenuItem)).click();
			driver.findElement(By.xpath(friendSearchTextBox)).click();
			driver.findElement(By.xpath(friendSearchTextBox)).sendKeys("adriana");
			driver.findElement(By.xpath(searchFriendBtn)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='searchFriendsContainer']"))));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement friendsContainer = driver.findElement(By.xpath("//*[@id='searchFriendsContainer']"));
			
//			List<WebElement> userNames = driver.findElements(By.className("user-name"));
//				for (int i=0; i<userNames.size();i++)
//				{
//					System.out.println(userNames.get(i).getText());
//				}
//				}
			//Test if 3 returned inputs contains "adriana" 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='searchFriendsContainer']/div[1]/div/div[2]/div[2]/div[1]/a")).getText().contains("adriana"));
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='searchFriendsContainer']/div[3]/div/div[2]/div[2]/div[1]/a")).getText().contains("adriana"));
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='searchFriendsContainer']/div[5]/div/div[2]/div[2]/div[1]/a")).getText().contains("adriana"));
		//	Thread.sleep(60000);
			driver.close();
			}
	
	@Test
		public void testSentFriendRequest() throws InterruptedException
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Create a new account
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
			wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
			driver.findElement(By.xpath(phoneInput)).click();
			driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
			driver.findElement(By.xpath(verifyBtn));
			driver.findElement(By.xpath(verifyBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			driver.findElement(By.xpath(profileAvatar)).click();
			driver.findElement(By.xpath(profimeMenuItem)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FriendsMenuItem)));
			driver.findElement(By.xpath(FriendsMenuItem)).click();
			//Search for an user
			driver.findElement(By.xpath(friendSearchTextBox)).click();
			String friendTosearch = "1461054815436";
			driver.findElement(By.xpath(friendSearchTextBox)).sendKeys(friendTosearch);
			driver.findElement(By.xpath(searchFriendBtn)).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='searchFriendsContainer']/div/div/div[2]/div[2]/div[1]/a")).click();
			WebDriverWait waitRequest = new WebDriverWait(driver,10);
			waitRequest.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#contentWrapper > div.container.content-wrap > div.section.profile > div.profile-head > div > div.col-lg-8.col-md-10 > div.user-head.clearfix > div > a.btn.btn-primary.btn-xs.add-friend")));
			driver.findElement(By.cssSelector("#contentWrapper > div.container.content-wrap > div.section.profile > div.profile-head > div > div.col-lg-8.col-md-10 > div.user-head.clearfix > div > a.btn.btn-primary.btn-xs.add-friend")).click();
			waitRequest.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div[3]")));
			driver.close();
			
		}
	
	@Test
		public void testFriendRequestNotification() throws InterruptedException
		{
		// Login with a username, and sent a friend request	
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Login to an existing account, with one least friend
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
			driver.findElement(By.xpath(signUpBtnAndLogIn));
			driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
			WebDriverWait wait_Change = new WebDriverWait(driver,5);
			wait_Change.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
			driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
			driver.findElement(By.xpath(usernameInput)).click();
			driver.findElement(By.xpath(usernameInput)).sendKeys("1461054815436");
			driver.findElement(By.xpath(passwordLogin)).click();
			driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
			driver.findElement(By.xpath(LoginBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			driver.findElement(By.xpath(profileAvatar)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileDropMenu)));
			driver.findElement(By.xpath(friendsFromLayoutMenu)).click();
			Assert.assertTrue(driver.findElement(By.xpath(friendsNotificationsNumber)).getText()!=null);
	//		Thread.sleep(60000);
			driver.close();
			}
	
	@Test
		public void testRemoveFriend() throws InterruptedException
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Login to an existing account, with one least friend
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
			driver.findElement(By.xpath(signUpBtnAndLogIn));
			driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
			WebDriverWait wait_Change = new WebDriverWait(driver,5);
			wait_Change.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
			driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
			driver.findElement(By.xpath(usernameInput)).click();
			driver.findElement(By.xpath(usernameInput)).sendKeys("1461054815436");
			driver.findElement(By.xpath(passwordLogin)).click();
			driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
			driver.findElement(By.xpath(LoginBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			driver.findElement(By.xpath(profileAvatar)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileDropMenu)));
			driver.findElement(By.xpath(friendsFromLayoutMenu)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='yourFriends']")));
			List<WebElement> freinds = driver.findElementsByCssSelector(".user-name a");
			Iterator<WebElement> iter = freinds.iterator();

//			while(iter.hasNext()) {
//			    WebElement we = iter.next();
//			    we.click();
//			    driver.findElement(By.xpath(deleteFriend));
//			    driver.findElement(By.xpath(deleteFriend)).click();
//			}	
		//	Thread.sleep(60000);
			if (!freinds.isEmpty())
					{
					driver.findElement(By.xpath(deleteFriend));
					driver.findElement(By.xpath(deleteFriend)).click();
					
					}
			else 
			{
				wait_precashier.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(deleteFriend)));
			}
			driver.close();
		
	}
	
	@Test
		public void testcancelFriendRequest() throws InterruptedException
		{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Login to an existing account, with one least friend
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
//		Keyboard k = driver.getKeyboard();
//		k.pressKey(Keys.ENTER);
	    WebDriverWait wait4Phone = new WebDriverWait(driver,15); 
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(profileAvatar)).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileDropMenu)));
		driver.findElement(By.xpath(friendsFromLayoutMenu)).click();
		//
		driver.findElement(By.xpath(friendSearchTextBox)).click();
		String friendTosearch = "1461056314969";
		driver.findElement(By.xpath(friendSearchTextBox)).sendKeys(friendTosearch);
		driver.findElement(By.xpath(searchFriendBtn)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='searchFriendsContainer']/div/div/div[2]/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='contentWrapper']/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/a[1]")).click();
		Thread.sleep(5000);
		//Log in with username that have accepted your friend request
		driver.findElement(By.xpath(profileAvatar)).click();
		driver.findElement(By.xpath(logoutFromProfile)).click();
		driver.findElement(By.xpath("//*[@id='logoutModal']/div/div"));
		driver.findElement(By.xpath("//*[@id='logoutModal']/div/div/div[3]/center/a")).click();
		driver.findElement(By.xpath("//*[@id='newbie-dialog']/div/div/div/div[1]"));
		driver.findElement(By.xpath("//*[@id='newbie-dialog']/div/div/div/div[2]/div/p/a")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signUpBtnAndLogIn)));
		driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
		WebDriverWait wait_Change_nth = new WebDriverWait(driver,5);
		wait_Change_nth.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(usernameInput)).click();
		driver.findElement(By.xpath(usernameInput)).sendKeys(friendTosearch);
		driver.findElement(By.xpath(passwordLogin)).click();
		driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
		driver.findElement(By.xpath(LoginBtn)).click();
		driver.findElement(By.xpath(friendsNotofication)).click();
		driver.findElement(By.xpath(cancelrequest)).click();
	//	Thread.sleep(60000);
		driver.close();
			
}
	
	@Test
	public void testAcceptFriendRequest() throws InterruptedException
	{
	DesiredCapabilities caps = DesiredCapabilities.chrome();
	caps.setCapability("name", "ProfileVerifications_1stRegister");
	caps.setCapability("platform", "Windows 8");
	caps.setCapability("version", "48");
	driver = new ChromeDriver(caps);
	driver.manage().deleteAllCookies();
	driver.get("http://bingohall.ag/");
	// Login to an existing account, with one least friend
	driver.manage().window().maximize();
	String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
	wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
	driver.findElement(By.xpath(phoneInput)).click();
	driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
	driver.findElement(By.xpath(verifyBtn));
	driver.findElement(By.xpath(verifyBtn)).click();
	WebDriverWait wait_precashier = new WebDriverWait(driver,20);
	wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
	driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
	driver.findElement(By.xpath(profileAvatar)).click();
	wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileDropMenu)));
	driver.findElement(By.xpath(friendsFromLayoutMenu)).click();
	//
	driver.findElement(By.xpath(friendSearchTextBox)).click();
	String friendTosearch = "1461056314969";
	driver.findElement(By.xpath(friendSearchTextBox)).sendKeys(friendTosearch);
	driver.findElement(By.xpath(searchFriendBtn)).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='searchFriendsContainer']/div/div/div[2]/div[2]/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='contentWrapper']/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/a[1]")).click();
	Thread.sleep(5000);
	
	//Log in with username that have accepted your friend request
	driver.findElement(By.xpath(profileAvatar)).click();
	driver.findElement(By.xpath(logoutFromProfile)).click();
	driver.findElement(By.xpath("//*[@id='logoutModal']/div/div"));
	driver.findElement(By.xpath("//*[@id='logoutModal']/div/div/div[3]/center/a")).click();
	driver.findElement(By.xpath("//*[@id='newbie-dialog']/div/div"));
	driver.findElement(By.xpath("//*[@id='newbie-dialog']/div/div/div/div[2]/div/p/a")).click();
	wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signUpBtnAndLogIn)));
	driver.findElement(By.xpath(signUpBtnAndLogIn)).click();
	WebDriverWait wait_Change_nth = new WebDriverWait(driver,5);
	wait_Change_nth.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")));
	driver.findElement(By.xpath("//*[@id='sign_in_tabs']/div/div/div[2]/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.xpath(usernameInput)).click();
	driver.findElement(By.xpath(usernameInput)).sendKeys(friendTosearch);
	driver.findElement(By.xpath(passwordLogin)).click();
	driver.findElement(By.xpath(passwordLogin)).sendKeys("Mandrutza89miau");
	driver.findElement(By.xpath(LoginBtn)).click();
	driver.findElement(By.xpath(friendsNotofication)).click();
	driver.findElement(By.xpath(acceptRequest)).click();
//	Thread.sleep(60000);
	driver.close();
		
}
//	
//	
	//@SuppressWarnings("deprecation")
	@Test
	public void testTransferFunds_noDepositMade() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Login to an existing account, with one least friend
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileAvatar)));
		driver.findElement(By.xpath(profileAvatar)).click();
		driver.findElement(By.xpath(transferFundsProfile)).click();
		Assert.assertEquals("This feature is only available to depositing account holders.",driver.findElement(By.xpath("//*[@id='contentWrapper']/div[2]/div[2]/div[2]/div/div[2]/div/p[2]/strong")).getText());
		//Thread.sleep(60000);
		driver.close();
		
	}
	
	@Test
		public void testReports() throws InterruptedException
		{
			String FromDatepicker = "//*[@id='txtFrom']";
			String ToDatePicker = "//*[@id='txtTo']";
			String askReportBtn = "//*[@id='reconcile_form']/div/div[2]/div/input";
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Login to an existing account, with one least friend
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
			wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
			driver.findElement(By.xpath(phoneInput)).click();
			driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
			driver.findElement(By.xpath(verifyBtn));
			driver.findElement(By.xpath(verifyBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileAvatar)));
			driver.findElement(By.xpath(profileAvatar)).click();
			driver.findElement(By.xpath(reportsProfile)).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reportsDatePickers)));
			driver.findElement(By.xpath(FromDatepicker)).click();
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[5]/div[1]/div[1]/button[1]")).click();
            driver.findElement(By.xpath("//*[@id='ng-app']/body/div[5]/div[1]/div[1]/button[1]")).click();
            
			Thread.sleep(5000);
			//Hit enter manually
			driver.findElement(By.xpath(ToDatePicker)).click();
			//Hit enter
			driver.findElement(By.xpath(askReportBtn)).click();
			Thread.sleep(20000);
			driver.close();
		}
	
	@Test
		public void testopenTicket() throws InterruptedException
		{
			
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("name", "ProfileVerifications_1stRegister");
			caps.setCapability("platform", "Windows 8");
			caps.setCapability("version", "48");
			driver = new ChromeDriver(caps);
			driver.manage().deleteAllCookies();
			driver.get("http://bingohall.ag/");
			// Login to an existing account, with one least friend
			driver.manage().window().maximize();
			String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
			wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
			driver.findElement(By.xpath(phoneInput)).click();
			driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
			driver.findElement(By.xpath(verifyBtn));
			driver.findElement(By.xpath(verifyBtn)).click();
			WebDriverWait wait_precashier = new WebDriverWait(driver,20);
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
			driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileAvatar)));
			driver.findElement(By.xpath(profileAvatar)).click();
			driver.findElement(By.xpath(openTicketProfile)).click();
			driver.switchTo().frame("ost_iframe");
			wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ticketName)));
			driver.findElement(By.xpath(ticketName)).click();
			driver.findElement(By.xpath(ticketName)).sendKeys(uniqueComplete);
			driver.findElement(By.xpath(ticketSubject)).click();
			driver.findElement(By.xpath(ticketSubject)).sendKeys(uniqueComplete);
			driver.findElement(By.xpath(ticketMessage)).click();
			driver.findElement(By.xpath(ticketMessage)).sendKeys(uniqueComplete);
			driver.findElement(By.xpath(ticketEmail)).click();
			driver.findElement(By.xpath(ticketEmail)).sendKeys(uniqueComplete+"@gmail.com");
			driver.findElement(By.xpath(departamentselect)).click();
			driver.findElement(By.xpath(departmentOption3)).click();
			driver.findElement(By.xpath(leaveMessage)).click();
			Thread.sleep(5000);
			Assert.assertEquals("Thank you! Your message has been sent. Our support team will contact you soon.", driver.findElement(By.xpath("//*[@id='view-offline-message-sent']/p")).getText());
		
			
			
			
		}
	
	@Test
	public void testVirtualTour()
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Login to an existing account, with one least friend
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profileAvatar)));
		driver.findElement(By.xpath(profileAvatar)).click();
		driver.findElement(By.xpath(virtualTourProfilemenu)).click();
	}
	
	@Test
	public void testPromotions() throws InterruptedException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("name", "ProfileVerifications_1stRegister");
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "48");
		driver = new ChromeDriver(caps);
		driver.manage().deleteAllCookies();
		driver.get("http://bingohall.ag/");
		// Login to an existing account, with one least friend
		driver.manage().window().maximize();
		String uniqueComplete = String.valueOf(System.currentTimeMillis());
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
		wait4Phone.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(phoneInput)));
		driver.findElement(By.xpath(phoneInput)).click();
		driver.findElement(By.xpath(phoneInput)).sendKeys("0555512345");
		driver.findElement(By.xpath(verifyBtn));
		driver.findElement(By.xpath(verifyBtn)).click();
		WebDriverWait wait_precashier = new WebDriverWait(driver,20);
		wait_precashier.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ng-app']/body/div[10]")));
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div[10]/div/div[3]/div[1]/button[1]")).click();
		driver.get("https://www.bingohall.ag/promotions");
		WebDriverWait wait_promotions = new WebDriverWait(driver,15);
		wait_promotions.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(promotionsContainer)));
		List<WebElement> promotions = driver.findElements(By.cssSelector("#promotions-container .promotion-item .block-item a"));
			for (int i=0;i<=promotions.size();i++)
			{	
				
					Assert.assertTrue(promotions.size()!=0);
					
			}
		
}
}