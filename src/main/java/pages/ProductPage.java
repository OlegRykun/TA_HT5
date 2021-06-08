package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//button[contains(@id, 'button')]")
    private WebElement buyProductButton;

    @FindBy(xpath = "//span[contains(@class, 'close')]")
    private WebElement closeBuyProductPageButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBuyProductButton() {
        buyProductButton.click();
    }

    public void clickOnCloseBuyProductPageButton() {
        closeBuyProductPageButton.click();
    }
}
