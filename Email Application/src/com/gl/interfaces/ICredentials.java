package com.gl.interfaces;

import com.gl.model.EmployeeDetails;

public interface ICredentials {
	
	public String generateEmailAddress( String firstName, String lastName, String department);
	public String generatePassword();
	public void showCredentials(EmployeeDetails emp);
}
