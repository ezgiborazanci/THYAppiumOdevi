package element;

import io.appium.java_client.MobileElement;

import static element.Element.driver;

public class CookiesPageElements extends Element{


    public static MobileElement allowBtn = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");

    public static MobileElement cookiesAcceptBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");



}
