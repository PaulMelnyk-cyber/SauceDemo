package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProductsPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    LoginPage loginPage;
    ProductsPage productsPage;


    @BeforeMethod
    public void setup(){
    System.setProperties("webdriver.chrome.driver" , "src/test/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    loginPage = new LoginPage(driver);
    productsPage = new ProductsPage(driver);


    }

    @AfterMethod
    public void tearDown (){
    driver.quit();

    }
}
