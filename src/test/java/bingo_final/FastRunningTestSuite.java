package bingo_final;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
// @IncludeCategory(FastRunningTests.class)
@SuiteClasses({ FORGOT_PASS_all_browsers_andResponsive.class, Landing_Pages_Chrome.class, Landing_Pages_Edge.class,
		Landing_Pages_Firefox.class, Landing_Pages_Responsive.class, LOGIN_AllBrowsersAndResponsive.class,
		Profile_BINGO_Chrome.class, RegistartionsTestingSpecific.class, REGISTRATION_Chrome.class,
		REGISTRATION_Firefox.class, REGISTRATION_IE11_WIN7.class, REGISTRATION_Resposinve.class })
public class FastRunningTestSuite {

}
