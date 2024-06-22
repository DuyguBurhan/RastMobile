package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "((//div[@class='menu-login'])//a)[2]")
    public WebElement oturumAcButon;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='sifre']")
    public WebElement passwordInput;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement girisYapButon;
}
