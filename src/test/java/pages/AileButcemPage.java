package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
            ReusableMethods.screenScroolMethod(968,1081,750,139,1081,750);
        }
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement eMailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;


}
