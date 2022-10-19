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
    //TODO пробел перед фигурными скобками. Reformat Code
    public void setup(){
        //TODO эта строчка не компилируется. Видимо ты имел в виду System.setProperty метод
        //TODO отступы и в целом форматирование ьезобразоне. На всей папке src сделай Reformat Code
    System.setProperties("webdriver.chrome.driver" , "src/test/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    loginPage = new LoginPage(driver);
    productsPage = new ProductsPage(driver);


    }

    @AfterMethod
    //TODO никаких пробелов перед круглыми скобками. Reformat Code
    public void tearDown (){
        //TODO код внутри метода имеют отступ на один tab
    driver.quit();

    }
}
