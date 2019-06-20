package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone umairPhone= new DeskPhone(123456);

	umairPhone.powerOn();
	umairPhone.callPhone(123456);
	umairPhone.answer();


	umairPhone= new MobilePhone(234567);
	umairPhone.powerOn();
	umairPhone.callPhone(234567);
	umairPhone.answer();
    }
}
