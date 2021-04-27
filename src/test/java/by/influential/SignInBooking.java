package by.influential;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInBooking {

    private WebDriver driver;

    public SignInBooking(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a//span[contains(text(), 'Sign in')]")
    private WebElement buttonSignIn;

    public void clickButtonSignIn(){
        buttonSignIn.click();
    }


    @FindBy(xpath = "//input[@id='username']")
    private WebElement inputUsername;

    public void inputEmail(){
        inputUsername.sendKeys("limpbiskit15@gmail.com");
    }



}
