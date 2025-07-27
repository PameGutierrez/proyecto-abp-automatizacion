package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id="email") private WebElement emailInput;
    @FindBy(id="password") private WebElement passwordInput;
    @FindBy(id="loginBtn") private WebElement loginButton;
    @FindBy(css=".error") private WebElement errorMsg;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() { driver.get("https://tuapp.com/login"); }

    public void loginAs(String u, String p) {
        emailInput.clear(); emailInput.sendKeys(u);
        passwordInput.clear(); passwordInput.sendKeys(p);
        loginButton.click();
    }

    public boolean hasError() { return errorMsg.isDisplayed(); }
}
