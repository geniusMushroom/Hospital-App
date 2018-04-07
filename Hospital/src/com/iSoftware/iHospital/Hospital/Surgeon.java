package com.iSoftware.iHospital.Hospital;

public  class Surgeon extends Hospital
{



public Surgeon (String nName, String nAddress, String nPhone)
{
	super(nName, nAddress, nPhone);
}

public void job()   //override method
{
	System.out.println("I am a surgeon");
}

}