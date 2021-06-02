package com.alicolaker.page;

import com.alicolaker.HookImplementation;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

public class FiltreSayfası extends HookImplementation {

    @Step("Fiyat butonuna tıkla")
    public void fiyatButonu(){
        MobileElement el21 = driver.findElementById("com.turkishairlines.mobile:id/fr_booking_cbPrice");
        el21.click();
    }

    @Step("Sıralama için Tamam butonuna tıkla")
    public void tamamButonuSiralama(){
        MobileElement el22 = driver.findElementById("com.turkishairlines.mobile:id/frFilterAndSort_btnApply");
        el22.click();
    }

}
