package com.alicolaker.page;

import com.alicolaker.HookImplementation;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

public class HavalimaniSecmeSayfasi extends HookImplementation {
    @Step("Aramaya <key> yaz")
    public void havalimaniYaz(String key){
        MobileElement el4 = driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el4.sendKeys(key);
    }

    @Step("Bulunan ilk sonuca tıkla")
    public void bulunanIlkSonuc(){
        MobileElement els13 = (MobileElement) driver.findElementsByXPath("//*[@resource-id='com.turkishairlines.mobile:id/frAirportSelection_lvList']/android.widget.RelativeLayout[2]");
        els13.click();
    }
}
