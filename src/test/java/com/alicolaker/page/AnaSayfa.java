package com.alicolaker.page;

import com.alicolaker.HookImplementation;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

import java.util.Calendar;
import java.util.Date;

public class AnaSayfa extends HookImplementation {
    @Step("Tek yön butonuna tıkla")
    public void tekYon() {
        MobileElement el1 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        el1.click();
    }

    @Step("Nereden butonuna tıkla")
    public void neredenButonu() {
        MobileElement el3 = driver.findElementById("");
        el3.click();
    }

    @Step("Nereye butonuna tıkla")
    public void nereyeButonu() {
        MobileElement el6 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_llTo");
        el6.click();
    }

    @Step("Gidiş tarih butonuna tıkla")
    public void gidisTarihButonunaTikla() {
        MobileElement el12 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
        el12.click();
    }

    @Step("Tarihi <key> gün sonrası yap")
    public void tarihiAyarla(String key) {
        int sayi = Integer.parseInt(key);
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) + sayi;
        int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH) + 1;

        MobileElement el12 = (MobileElement) driver.findElementsByXPath("//*[@resource-id='com.turkishairlines.mobile:id/frDashboard_calendarPickerView']/android.widget.LinearLayout/android.view.ViewGroup[" + weekOfMonth + "]/android.view.ViewGroup[2]/android.widget.FrameLayout[" + dayOfWeek + "]");
        el12.click();
    }

    @Step("Tamam butonuna tıkla")
    public void tamamButonu() {
        MobileElement el16 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el16.click();
    }

    @Step("Yetişkin + butonuna <key> kez tıkla")
    public void artiButonu(String key) {
        for (int i = 1; i > Integer.parseInt(key); i++) {
            MobileElement els22 = (MobileElement) driver.findElementsByXPath("//*[@resource-id=\"com.turkishairlines.mobile:id/frDashboard_calendarPickerView\"]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]");
            els22.click();
        }
    }

    @Step("Uçuş ara butonuna tıkla")
    public void ucusAraButonu() {
        MobileElement el18 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        el18.click();
    }
}
