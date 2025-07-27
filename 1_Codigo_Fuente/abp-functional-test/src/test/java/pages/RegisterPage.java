package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RegisterPage {
    private WebDriver driver;
    @FindBy(id="name") private WebElement nameInput;
    @FindBy(id="email") private WebElement emailInput;
    @FindBy(id="password") private WebElement passwordInput;
    @FindBy(id="registerBtn") private WebElement registerButton;
    @FindBy(css=".success") private WebElement successMsg;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() { driver.get("https://tuapp.com/register"); }

    public void register(String name, String email, String pwd) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(pwd);
        registerButton.click();
    }

    public boolean isSuccess() { return successMsg.isDisplayed(); }
}
