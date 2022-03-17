package com.mycomp.driver;

import java.util.Scanner;

import com.mycomp.model.Employee;
import com.mycomp.service.EmailPwdGenerator;

public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("christy","xavier");
		EmailPwdGenerator ema = new EmailPwdGenerator();

		
		System.out.println("Department Options");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		switch(userChoice) {
		
		case 1:
			 emp.setDeptName("tech");
			 break;
		case 2:
			 emp.setDeptName("adm");
			 break;
		case 3:
			 emp.setDeptName("HR");
			 break;
		case 4:
			 emp.setDeptName("Leg");
			 break;
		}
		
		emp.setEmpMail(ema.generateEmail(emp.getFirstName(), emp.getLastName(), emp.getDeptName()));
		char[] pasword =ema.generatePassword();
		ema.display(emp.getFirstName(), emp.getEmpMail(), pasword);
	
	}

}
