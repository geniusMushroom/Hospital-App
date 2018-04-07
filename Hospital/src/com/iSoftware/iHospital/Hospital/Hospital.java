package com.iSoftware.iHospital.Hospital;

public abstract class Hospital
{
protected String name;
protected String address;
protected String phone;


public Hospital(String nName, String nAddress, String nPhone)
{
	name=nName;
	address=nAddress;
	phone=nPhone;
}

public String toString()
{
	String result="Name: "+name+"\n";
	result+="Address: "+address+"\n";
	result+="Phone: "+phone;
	return result;
}
public abstract void job();
}