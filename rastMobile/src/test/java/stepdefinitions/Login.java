package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class Login {
    LoginPage loginPage = new LoginPage();

    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @When("kullanici login olur")
    public void kullanici_login_olur() {
        loginPage.oturumAcButon.click();
        loginPage.emailInput.sendKeys("duyguburhan111@gmail.com");
        waitFor(2);
        loginPage.passwordInput.sendKeys("Holistik123.");
        waitFor(2);
        loginPage.girisYapButon.click();
        waitFor(4);

    }
}



