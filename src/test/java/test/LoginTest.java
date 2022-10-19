package test;

import org.junit.Test;
import pages.ProductsPage;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest{


    //TODO аннотацию @Test ты использовал из JUNIT а @BeforeMethod из TestNG. В итоге она не запускается и у меня NullPointerException
    @Test
    public void positiveLogin(){
        // 1) Open Login URL
        // 2) Insert Login and Password and Click Login button
        // 3) Assert smth

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isOpened());
    }

}
