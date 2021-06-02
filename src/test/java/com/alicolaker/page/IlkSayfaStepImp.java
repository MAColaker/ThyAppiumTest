package com.alicolaker.page;

import com.alicolaker.HookImplementation;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

public class IlkSayfaStepImp extends HookImplementation {

    @Step("Bilet al butonuna tikla")
    public void biletAlButonu(){
        MobileElement el1 = driver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");
        el1.click();
    }
}
