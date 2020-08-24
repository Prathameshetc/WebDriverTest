import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
  public static WebDriver driver;
  
  @BeforeSuite
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\EPIQ\\NewWorkspace\\GitTest\\src\\Firefox\\geckodriver.exe" );
	  driver=new FirefoxDriver();
  }
  
  @Test
  public void doLogin(){
	  driver.get("http://google.co.in");
	 // driver.findElement(By.id("Email")).sendKeys("Trainer");  
  }
  
  @AfterSuite
  public void tearDown() {
	  driver.quit();
  }
  
  
}
