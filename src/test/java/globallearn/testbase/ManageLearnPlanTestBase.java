package globallearn.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import globallearn.testdata.ManageLearnPlanTestData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageLearnPlanTestBase {

	public static WebDriver driver;

	public void browserLaunch() {

		String browserName = ManageLearnPlanTestData.browserName;

		if (browserName.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("!!! Browser name is invalid !!!");
		}

		driver.manage().window().maximize();
		driver.get(ManageLearnPlanTestData.glAppURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
		System.out.println(ManageLearnPlanTestData.glAppURL+ " is launched in "+browserName+" browser");

	}

	public void driverEnd() {

		driver.quit();
	}
	
	

}
