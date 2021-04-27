package by.influential;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CambridgeSite {

    private WebDriver driver;

    public CambridgeSite(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/dictionary/']")
    private WebElement buttonDictionary;

    public void clickButtonDictionary(){
        buttonDictionary.click();
    }


}
