package com.iSoftware.iHospital.Hospital;

public class Doctor extends Hospital {

	public Doctor(String nName, String nAddress, String nPhone) {
		super(nName, nAddress, nPhone);
	}

	public void job() // override method
	{
		System.out.println("I am a doctor. I don't know how to fix human being but i know hwo to haunt you...");
	}

}