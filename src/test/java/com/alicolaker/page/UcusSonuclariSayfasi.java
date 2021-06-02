package com.alicolaker.page;

import com.alicolaker.HookImplementation;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

public class UcusSonuclariSayfasi extends HookImplementation {

    @Step("Sırala ve filtrele butonuna tıkla")
    public void siralaVeFiltrele(){
        MobileElement el18 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        el18.click();
    }

    @Step("Sonuçlanan ilk uçuşu seç")
    public void ilkUcus(){
        MobileElement el23 = driver.findElementByXPath("//*[@resource-id='com.turkishairlines.mobile:id/frFlightSearch_rvFlight']/android.view.ViewGroup[1]");
        el23.click();

        MobileElement els28 = (MobileElement) driver.findElementsByXPath("//*[@resource-id='com.turkishairlines.mobile:id/frFlightSearch_rvFlight']/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        els28.click();
    }

    @Step("Devam butonuna tıkla")
    public void devamButonu(){
        MobileElement el28 = driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el28.click();
    }
}
