package stepdefinitions;

import io.cucumber.java.en.When;

import static utilities.ReusableMethods.waitFor;

public class SepeteUrunEkle {

    pages.SepeteUrunEkle sepeteUrunEkle = new pages.SepeteUrunEkle();


    @When("kullanici sepete urun ekler")
    public void kullanici_sepete_urun_ekler() {
        sepeteUrunEkle.ilkUrunSepeteEkleButon.click();
        waitFor(2);

    }
}
