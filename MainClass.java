package com.bank.www;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		try{
		System.out.println("         Welcome to Miracle Bank of World");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter your Name:");
		String name=sc.nextLine();
		System.out.println(" Enter your Account no:");
		long no=sc.nextLong();
		CustomerData c1= new CustomerData(name,no);
		for(;;){
		System.out.println("Click '1' for checking bank balance ");
		System.out.println("Click '2' for deposite ");
		System.out.println("Click '3' for withdraw");
		System.out.println("Click '0' for Exit");

		System.out.println("Enter your option here:");
		int n=sc.nextInt();

		switch(n)
		{
		case(0):
			System.exit(0);
			
		case(1):
			
			System.out.println(c1.currentBalance);
			break;
		case(2):
			System.out.println("Enter the Amount:");
			double amount=sc.nextDouble();
			c1.depo(amount);
			System.out.println(" Successful");
			break;
		case(3):
			System.out.println("Enter the amount:");
			double w=sc.nextDouble();
			c1.withDraw(w);
			System.out.println("Successful");
			break;
		
		default:
			System.out.println("please select valid option");
		}
		}}
		catch(InputMismatchException e)
		{
			System.out.println(e.getLocalizedMessage());
			System.out.println("please enter sufficient data");
		}
		
	}

}
