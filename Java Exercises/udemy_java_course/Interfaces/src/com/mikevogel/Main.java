package com.mikevogel;

public class Main {

    public static void main(String[] args) {
        ITelephone mikesPhone;
        mikesPhone = new DeskPhone(123456);
        mikesPhone.powerOn();
        mikesPhone.callPhone(123456);
        mikesPhone.answer();

        mikesPhone = new MobilePhone(234568);
        mikesPhone.powerOn();
        mikesPhone.callPhone(234568);
        mikesPhone.answer();
    }
}
