package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class AileButcemStepDefinitions {

    AileButcemPage page = new AileButcemPage();
    @Given("Kullanici driver kurulumlarini yaparak cihaz baglantisini kurar")
    public void kullanici_driver_kurulumlarini_yaparak_cihaz_baglantisini_kurar() {
        Driver.getAndroidDriver();
    }
    @Given("ilk ekran ayarlarini yapin ve {string} ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String girisButonu) throws InterruptedException {
        // 968, 1081, 139, 1081
        page.logimMethodu();
        ReusableMethods.scrollWithUiScrollable(girisButonu);

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail, String password) {
        page.eMailBox.sendKeys(ConfigReader.getProperty(mail));
        page.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

    }
    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {

    }
    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }

}