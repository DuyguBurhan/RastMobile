package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OdemeSayfasi {

    public OdemeSayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='adres74638_1']")
    public WebElement adresSec;

    @FindBy(xpath = "//input[@value='ÖDEMEYE GEÇ']")
    public WebElement odemeyeGecButon;

    @FindBy(xpath = "//*[@id='p_cardno']")
    public WebElement kartNoInput;

    @FindBy(xpath = " //*[@id='p_carday']")
    public WebElement ayInput;

    @FindBy(xpath = "//*[@id='p_cardyil']")
    public WebElement yilInput;

    @FindBy(xpath = "//*[@id='p_cardcv2']")
    public WebElement cv2Input;

    @FindBy(xpath = "//*[@id='sozlesmeonay']")
    public WebElement sozlesmeOnay;

    @FindBy(xpath = "//*[@id='gonder']")
    public WebElement paymentSiparisiOnaylaButon;

    @FindBy(xpath = "//*[@class='text-danger']")
    public WebElement siparisOnaylanmadiText;


}
