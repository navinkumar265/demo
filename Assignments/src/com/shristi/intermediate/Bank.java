package com.shristi.intermediate;

public class Bank {

	
	double balance;
	
	Bank(double b)
	{
		balance=b;
	}
	
	public void withdraw(int w)
	{
		balance-=w;
	}
	public void deposit(int d)
	{
		balance+=d;
	}
	public double getBalance()
	{
		return balance;
	}
}
