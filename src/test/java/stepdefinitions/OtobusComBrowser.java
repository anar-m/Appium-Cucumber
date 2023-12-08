package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.ObiletBrowserPage;

public class OtobusComBrowser {
    ObiletBrowserPage page = new ObiletBrowserPage();

    @Given("{string} sayfasina gidilir")
    public void https_www_obilet_com_en_sayfasina_gidilir(String url) {
        utilities.BrowserDriver.getBrowserDriver().get(url);

    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() throws InterruptedException {
        page.menuButton.click();
        Thread.sleep(1000);
        page.languageBar.click();
        Thread.sleep(1000);
        page.turkishLanguage.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() throws InterruptedException {
        page.menuButton.click();
        Thread.sleep(1000);
        page.currencyBar.click();
        Thread.sleep(1000);
        page.turkisLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {
        page.findTicketButton.click();
    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulan")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulan() {

    }
}
