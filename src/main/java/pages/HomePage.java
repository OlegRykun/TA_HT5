package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Каталог товаров']")
    private WebElement catalogueButton;

    @FindBy(xpath = "//bdi[contains(text(), 'Телевизоры')]")
    private WebElement televisionButton;

    @FindBy(xpath = "//a[contains(text(), 'Игровые и медиаприставки')]")
    private WebElement gameConsolesButton;

    @FindBy(xpath = "//a[@class='product-title']")
    private List<WebElement> productsList;

    @FindBy(xpath = "//a[contains(text(), 'Sony PlayStation 5 Digital Edition')]")
    private WebElement sonyPlayStation5;

    @FindBy(xpath = "//span[@class='ty-minicart-count']")
    private WebElement cartAmount;

    @FindBy(xpath = "//span[contains(text(), 'Аккаунт')]")
    private WebElement accountButton;

    @FindBy(xpath = "//a[contains(@class, 'cm-dialog-auto-size ty-btn ty-btn__secondary')]")
    private WebElement enterButton;

    @FindBy(xpath = "//input[@name='user_login']")
    private WebElement userLoginInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement userPasswordInput;

    @FindBy(xpath = "//button[@class='ty-btn__login ty-btn__secondary ty-btn']")
    private WebElement enterInAccountButton;

    @FindBy(xpath = "//span[@id='login_popup4625_error_message']/p")
    private WebElement emailIsNotCorrect;

    @FindBy(xpath = "//bdi[contains(text(), 'Apple Store')]")
    private WebElement appleStoreButton;

    @FindBy(xpath = "//a[contains(text(), 'Apple iPhone')]")
    private WebElement appleIphoneButton;

    public HomePage(WebDriver driver) {super(driver);}

    public void waitAndClickOnCatalogueButton() {
        catalogueButton.isDisplayed();
        catalogueButton.click();
    }

    public void waitAndClickOnTelevisionButton() {
        televisionButton.isDisplayed();
        televisionButton.click();
    }

    public void waitAndClickOnGameConsolesButton() {
        gameConsolesButton.isDisplayed();
        gameConsolesButton.click();
    }

    public void clickOnPS5() {
        sonyPlayStation5.click();
    }

    public String getTextOfAmountProductsInCart() {
        return cartAmount.getText();
    }

    public void waitAndClickOnAccountButton() {
        accountButton.isDisplayed();
        accountButton.click();
    }

    public void waitAndClickOnEnterButton() {
        enterButton.isDisplayed();
        enterButton.click();
    }

    public void waitAndInputUserLogin(String userLogin) {
        userLoginInput.isDisplayed();
        userLoginInput.clear();
        userLoginInput.sendKeys(userLogin);
    }

    public void waitAndInputUserPassword(String password) {
        userPasswordInput.isDisplayed();
        userPasswordInput.clear();
        userPasswordInput.sendKeys(password);
    }

    public void waitAndClickOnEnterInAccountButton() {
        enterInAccountButton.isDisplayed();
        enterInAccountButton.click();
    }

    public String getEmailIsNotCorrect() {
        return emailIsNotCorrect.getText();
    }


    public void waitAndClickOnAppleStoreButton() {
        appleStoreButton.isDisplayed();
        appleStoreButton.click();
    }

    public void waitAndClickOnAppleIphoneButton() {
        appleIphoneButton.isDisplayed();
        appleIphoneButton.click();
    }
}
