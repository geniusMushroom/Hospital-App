package com.iSoftware.iHospital.Hospital;

public class Employee {

	Hospital[] employee;

	public Employee() // employee details
	{
		employee = new Hospital[5];
		employee[0] = new Doctor("Anurag", "ABCD address", "123-4567");
		employee[1] = new Nurse("Niranjan", "ABCDEFGH", "243-6758");
		employee[2] = new Administrator("Dhruv", "Miyaun ", "456-6857");
		employee[3] = new Surgeon("Kartik", "WooooooooHHH", "354-9876");
		employee[4] = new Receptionist("Rakesh", "Scooby dooby", "536-9475");
	}

	public void joblist() {
		for (int count = 0; count < employee.length; count++) {
			System.out.println(employee[count]);
			employee[count].job();

		}
	}

}