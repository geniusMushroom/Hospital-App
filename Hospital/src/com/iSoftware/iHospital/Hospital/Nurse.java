package com.iSoftware.iHospital.Hospital;

public class Nurse extends Hospital {

	public Nurse(String nName, String nAddress, String nPhone) {
		super(nName, nAddress, nPhone);
	}

	public void job() // override method
	{
		System.out.println("I am a nurse. I will give you poison.");
	}

}