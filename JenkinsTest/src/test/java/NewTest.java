import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class NewTest {
	WebDriver driver;
  @Test
  public void launchURL() {
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  
  }
  
  @BeforeTest
  public void setEnvironment() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }

}
