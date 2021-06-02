package com.thy;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Random;

import static element.BookAFlightPageElements.*;
import static element.FlightResultsPageElements.*;
import static element.FlightResultsPageElements.continueBtn;
import static element.HomePageElements.bookaFlightBtn;
import static element.HomePageElements.bookaFlightBtn;
import static org.junit.Assert.assertEquals;
import static element.CookiesPageElements.allowBtn;
import static element.CookiesPageElements.cookiesAcceptBtn;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;


public class StepImplementation {



        @Step({"Allow Butonuna tıkla"})
        public void allowBtnclick(){
             allowBtn.click();
        }

        @Step({"Cookies Accept Butonuna tıkla"})
        public void cookiesAcception(){
            cookiesAcceptBtn.click();
        }


        @Step({"<seconds> saniye bekle"})
        public void waitBySecond(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Step({"Book A Flight Butonuna tıkla"})
        public void existClickByKey() {
            bookaFlightBtn.click();
        }

        @Step({"Tek Yön Uçuş seç"})
        public void oneWay(){
            oneWaybtn.click();
        }

        @Step({"Gidiş Yönünü seç"})
        public void selectDeparture(){
            fromToBtn.click();
        }

        @Step({"Gidiş Yönünü <key> olarak seç"})
        public void sendKey(String key){
            fromToSearchBox.sendKeys(key);
            fromToSelectResult.click();
        }

        @Step({"Varış yerini <key> olarak seç"})
        public void sendArrival(String key){
            goToBtn.click();
            goToSearchBox.sendKeys("ESB");
            goToSelectResult.click();
        }

        @Step({"Uçuş tarihini seç"})
        public void selectDate(){
            dateBtn.click();


            //dateListBy.get(0).isSelected();
            //dateListBy.get(getDate()).click();

        }


        /*
        public static int getDate(){
            int index = 0;
            for (MobileElement element: dateListBy) {
                if (element.isSelected()){
                    index = dateListBy.indexOf(element) + 2;
                }
            }
            return index;


        }

         */

        @Step("Done butonuna tıkla")
        public void clickOK(){
            doneBtn.click();
        }

        @Step({"Kişi sayısını <key> artır"})
        public void numberOfPassengers(int key){
            addingPersonBtn.click();
        }

        @Step({"Uçuş ara"})
        public void searchFlight(){
            searchAFlightBtn.click();
        }

        @Step({"Uçuş sayfasını kontrol et"})
        public void listControl(){
            Assert.assertTrue(flightAreaBy.isDisplayed());
        }



        @Step({"Ekonomik Uçuşu seç"})
        public void selectEcoFly(){


            Random rnd = new Random();
            int randomNumber = rnd.nextInt(flightListBy.size());
            flightListBy.get(randomNumber).click();
            selectEcoFligthBy.get(0).click();
        }



        /*
        @Step({"Devam Butonuna tıkla"})
        public void clickContinue(){
            continueBtn.click();
        }

         */





    }


