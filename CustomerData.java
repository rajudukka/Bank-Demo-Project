package com.bank.www;

public class CustomerData {
	
	String name;
	long accNo;
	static double currentBalance;
	
	public CustomerData(String name, long accNo)
	{
		this.name=name;
		this.accNo=accNo;
	}
	
	public void depo(double amount)
	{
		currentBalance=currentBalance+amount;
	}
	public void withDraw(double amount)
	{
		currentBalance=currentBalance-amount;
	}
}
