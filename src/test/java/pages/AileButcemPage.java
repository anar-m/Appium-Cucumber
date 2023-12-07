package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    public void logimMethodu() throws InterruptedException {
        Thread.sleep(1500);
        for (int i = 0; i < 7; i++) {
            ReusableMethods.screenScroolMethod(968,1081,750,139,1081,450);
        }
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement eMailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basariliGirisText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyIsimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirKutusu;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;

    public void hesabimBoxesClearMethodu(){
        isimKutusu.clear();
        soyIsimKutusu.clear();
        sehirKutusu.clear();
        yasKutusu.clear();
        meslekKutusu.clear();
    }
    public void kullaniciBilgileriDegistirmeMethodu(String isim, String soyisim, String sehir, String yas, String meslek, String kaydet){
        hesabimBoxesClearMethodu();
        isimKutusu.sendKeys(isim);
        soyIsimKutusu.sendKeys(soyisim);
        sehirKutusu.sendKeys(sehir);
        yasKutusu.sendKeys(yas);
        meslekKutusu.sendKeys(meslek);
        ReusableMethods.scrollWithUiScrollable(kaydet);
    }

    public void kullaniciBilgileriAssertion(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimKutusu.getText().contains(isim));
        Assert.assertTrue(soyIsimKutusu.getText().contains(soyisim));
        Assert.assertTrue(sehirKutusu.getText().contains(sehir));
        Assert.assertTrue(yasKutusu.getText().contains(yas));
        Assert.assertTrue(meslekKutusu.getText().contains(meslek));
    }


}
