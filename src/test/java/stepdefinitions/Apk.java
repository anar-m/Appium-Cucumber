package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Apk {
    AndroidDriver<AndroidElement> driver;


    @Given("Kullanici gerekli kurulumlari yaparak istenilen uygulamayi {String} cep telefonuna yukler")
    public void kullanici_gerekli_kurulumlari_yaparak_istenilen_uygulamayi_cep_telefonuna_yukler(String dosyayolu) throws MalformedURLException {
        //kullanici gerekli kurulumlari yapar
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        // capabilities.setCapability("platformName","Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        // eğer kullanmış olduğumuz cihazın android sürümü 6 ya da 6 dan büyükse UiAutomator2'yi kullanmamız gerekiyor
        // eğer kullanmış olduğumuz cihazın android sürümü 6 dan küçükse UiAutomator'u kullanmamız gerekiyor
        capabilities.setCapability(MobileCapabilityType.APP,dosyayolu);

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

}
