package com.iSoftware.iHospital.Hospital;

public class Receptionist extends Hospital {

	public Receptionist(String nName, String nAddress, String nPhone) {
		super(nName, nAddress, nPhone);
	}

	public void job() // override method
	{
		System.out.println("I am a receptionist. Don't you dare bother me....hehahaha");
	}

}