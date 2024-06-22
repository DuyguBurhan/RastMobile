package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SepeteUrunEkle;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class OdemeSayfasi {

    pages.OdemeSayfasi odemeSayfasi = new pages.OdemeSayfasi();
    SepeteUrunEkle sepeteUrunEkle = new SepeteUrunEkle();
    Actions actions = new Actions(Driver.getDriver());

    @When("sepetteki urun icin gecersiz kart bilgileri girer")
    public void sepetteki_urun_icin_gecersiz_kart_bilgileri_girer() {
        sepeteUrunEkle.siparisiTamamlaButon.click();
        odemeSayfasi.adresSec.click();
        odemeSayfasi.odemeyeGecButon.click();
        waitFor(3);
        odemeSayfasi.kartNoInput.sendKeys("4242424242424242");
        actions.sendKeys(odemeSayfasi.kartNoInput).sendKeys(Keys.TAB);
        odemeSayfasi.ayInput.click();
        odemeSayfasi.ayInput.sendKeys("05");
        odemeSayfasi.yilInput.click();
        odemeSayfasi.yilInput.sendKeys("2028");
        odemeSayfasi.cv2Input.click();
        odemeSayfasi.cv2Input.sendKeys("111");
        waitFor(2);
        odemeSayfasi.sozlesmeOnay.click();
        waitFor(2);
        odemeSayfasi.paymentSiparisiOnaylaButon.click();
        waitFor(5);

    }

    @When("yanlis kart bilgileri ile odeme yapilamadigini dogrular")
    public void yanlis_kart_bilgileri_ile_odeme_yapilamadigini_dogrular() {
        Assert.assertTrue(odemeSayfasi.siparisOnaylanmadiText.isDisplayed());
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();
    }
}
