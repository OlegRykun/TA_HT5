package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {
    private static final long DEFAULT_WAITING_TIME = 100;
    private static final String EXPECTED_PRODUCTS_AMOUNT_IN_CART = "1";
    private static final String USER_LOGIN = "1234567890";
    private static final String USER_PASSWORD = "1234567890";
    private static final String EMAIL_IS_NOT_CORRECT = "Email в поле E-mail неверен.";
    private static final String APPLE_IPHONE = "Apple iPhone";

    @Test
    public void addSonyToCart() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnCatalogueButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnTelevisionButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnGameConsolesButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickOnPS5();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getProductPage().clickOnBuyProductButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getProductPage().clickOnCloseBuyProductPageButton();
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_PRODUCTS_AMOUNT_IN_CART);
    }

    @Test
    public void authorizationError() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnAccountButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnEnterButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndInputUserLogin(USER_LOGIN);
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndInputUserPassword(USER_PASSWORD);
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnEnterInAccountButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertEquals(getHomePage().getEmailIsNotCorrect(), EMAIL_IS_NOT_CORRECT);
    }

    @Test
    public void checkAppleInTitle() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnCatalogueButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnAppleStoreButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitAndClickOnAppleIphoneButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        for (String iPhone: getAppleIphonePage().getTitleTextForEveryIphone()) {
            assertTrue(iPhone.contains(APPLE_IPHONE));
        }
    }
}
