package com.iSoftware.iHospital.Hospital;

public class Administrator extends Hospital {

	public Administrator(String nName, String nAddress, String nPhone) {
		super(nName, nAddress, nPhone);
	}

	public void job() // override method
	{
		System.out.println("I am a Admin.. i will murder you and take your money....give me money...");
	}

}
