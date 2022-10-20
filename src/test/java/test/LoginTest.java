package test;


import org.testng.annotations.Test;
import pages.ProductsPage;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {


    @Test
    public void positiveLogin() {
        // 1) Open Login URL
        // 2) Insert Login and Password and Click Login button
        // 3) Assert smth

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isDisplayed());
    }

}
