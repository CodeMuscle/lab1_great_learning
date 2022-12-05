package com.gl.main;

import java.util.Scanner;

import com.gl.interfaces.ICredentials;
import com.gl.model.EmployeeDetails;
import com.gl.service.CredentialService;

public class DriverMain {
	public static void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		String firstName;
		String lastName;
		
		EmployeeDetails employee = new EmployeeDetails("Ganesh", "Govind");
		
		CredentialService service = new CredentialService();
		
		int choice;
		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		choice = sc1.nextInt();
		String generatedEmail = null;
		String generatedPassword =null;
		switch (choice) {
		
		case 1:{
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
			generatedPassword = service.generatePassword();
			break;
			}
		
		case 2:{
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"admin");
			generatedPassword = service.generatePassword();
			break;
			}
		case 3:{
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
			generatedPassword = service.generatePassword();
			break;
			}
		case 4:{
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"legal");
			generatedPassword = service.generatePassword();
			break;
			}
		
		default:{
			System.out.println("Enter a valid option");
		}
		
		}
		
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		service.showCredentials(employee);
		sc1.close();		
		
		
	}
	
}
