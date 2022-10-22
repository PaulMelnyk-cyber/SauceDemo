package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ProductsPage;

import static org.testng.Assert.assertTrue;

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


    @Test
    public void negativeTest() {
        loginPage.open();
        loginPage.login("standard_user", "fhgjdjddkfjdj");


    }
}


