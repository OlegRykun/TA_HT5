package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AppleIphonePage extends BasePage {

    @FindBy(xpath = "//a[@class='product-title']")
    private List<WebElement> iPhoneList;

    public AppleIphonePage(WebDriver driver) {
        super(driver);
    }

    public int getSearchIphoneCount() {
        return getIphoneList().size();
    }

    public List<WebElement> getIphoneList() {
        return iPhoneList;
    }

    public ArrayList<String> getTitleTextForEveryIphone() {
        ArrayList<String> titlesText = new ArrayList<String>();
        for (WebElement iPhone: iPhoneList) {
            titlesText.add(iPhone.getText());
        }

        return titlesText;
    }
}
