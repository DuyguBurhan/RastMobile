package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SepeteUrunEkle {
    public SepeteUrunEkle() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@class='SepeteEkle'])[1]")
    public WebElement ilkUrunSepeteEkleButon;

    @FindBy(xpath = "//button[@class='sepet-odemeyap text-center']")
    public WebElement siparisiTamamlaButon;
}
