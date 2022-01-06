import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ConfiguationAnnotationBaseTest {
	@BeforeMethod
	public void beforeMEthod() {
		Reporter.log("from before method",true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("from before class",true);
	}
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("from before test",true);
		
	}
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("from before suite",true);
	}
	@AfterMethod
	public void aftreMEthod() {
		Reporter.log("from after method",true);
	}

}
