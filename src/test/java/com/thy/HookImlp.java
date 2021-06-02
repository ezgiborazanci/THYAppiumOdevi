package com.thy;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import element.Element;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HookImlp extends Element {


    @BeforeScenario
    public void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appPackage", "com.turkishairlines.mobile");
        desiredCapabilities.setCapability("appActivity", "com.turkishairlines.mobile.ui.main.MainActivity");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    /*
    @AfterScenario
    public void tearDown() {
        driver.quit();
    }

     */

}
