package com.gl.service;

import java.util.Random;
import java.util.Scanner;

import com.gl.interfaces.ICredentials;
import com.gl.model.EmployeeDetails;

public class CredentialService implements ICredentials {
	private String firstName;
	private String lastName;
	private String department;
		
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public String generateEmailAddress( String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".gl.com";
	}
	
	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPGRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";
		String values = smallLetters + capitalLetters + numbers + specialCharacters;
		Random random = new Random();
		String password = "";
//		char temp;
	
		for(int i=0; i<8; i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		
		return password;
	}
	
	@Override
	public void showCredentials(EmployeeDetails emp) {
		System.out.println("/n Dear " +emp.getFirstName() + " your credentials are given below:\n");
		System.out.println("Email --> " +emp.getEmail());
		System.out.println("Password --> "+emp.getPassword());
		
	}
}
