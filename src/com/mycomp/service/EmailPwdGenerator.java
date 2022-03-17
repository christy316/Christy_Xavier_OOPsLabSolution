package com.mycomp.service;

import java.util.Random;

public class EmailPwdGenerator {
	
	
	public String generateEmail(String firstName, String lastName, String deptName) {
		
		String emailIds;
		
		emailIds = firstName + lastName + "@" + deptName + ".mycomp.com";
		
		
		return emailIds;
		
	}
	/**
	 * returns password
	 * @return - Randomly Generated password with array of chars
	 */
	public char[] generatePassword() {
		String allowedPwdChars = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ+_%$1234567890");
		int length = 10;
		char[] empPassword = new char[length];
		Random rand = new Random();
		for (int i = 0; i < length - 1; i++) {
			int randIndex = rand.nextInt(length);
			empPassword[i] = allowedPwdChars.charAt(randIndex);
		}

		return empPassword;
	}
	
	public void display(String firstName, String email, char[] password) {
		
		System.out.println("Dear " + firstName +", your generated credentials are as follows-");
		System.out.println("Email  -->"+ email);
		System.out.println("Password -->"+ new String(password));
		
	}

}
