package stepdefinitions;

import io.cucumber.java.en.Given;

public class BrowserClass {

    @Given("Kullanici browserDriver ayarlamalari yaparak browser i acar")
    public void kullanici_browser_driver_ayarlamalari_yaparak_browser_i_acar() {
        utilities.BrowserDriver.getBrowserDriver();
    }
    @Given("Kullanici google a gider")
    public void kullanici_google_a_gider() {
        utilities.BrowserDriver.getBrowserDriver().get("https://www.google.com");
    }
}
