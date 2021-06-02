package element;

import io.appium.java_client.MobileElement;

public class BookAFlightPageElements extends Element{

   public static MobileElement oneWaybtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
   public static MobileElement fromToBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
   public static MobileElement fromToSearchBox = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
   public static MobileElement fromToSelectResult= (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
   public static MobileElement goToBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvToCode");
   public static MobileElement goToSearchBox = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
   public static MobileElement goToSelectResult = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
   public static MobileElement dateBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
   public static MobileElement dateSelectionBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
   public static MobileElement doneBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
   public static MobileElement addingPersonBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
   public static MobileElement searchAFlightBtn = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");






}
