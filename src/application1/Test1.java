package application1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Test1 {
	public String baseUrl = "http://www.bsdenterprise.com/Inicio.asp";
    String driverPath = "C:\\Users\\Manuel.Mejorado\\Documents\\Investigacion Jenkins\\Selenium\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() throws InterruptedException {
          String expectedTitle = "BSD Enterprise.";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
          Thread.sleep(5000);
         // driver.findElement(By.ById("Contacto")).click() ;
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}