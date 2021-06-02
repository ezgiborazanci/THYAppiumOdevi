package element;

import io.appium.java_client.MobileElement;

import java.util.List;

public class FlightResultsPageElements extends Element{

    public static MobileElement flightAreaBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_rvFlight");
    public static List<MobileElement> flightListBy = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"androidx.recyclerview.widget.RecyclerView\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static List<MobileElement> selectEcoFligthBy = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"android.widget.LinearLayout\"]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    public static MobileElement continueBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
}
