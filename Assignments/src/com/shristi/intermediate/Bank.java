package com.shristi.intermediate;

public class Bank {

	
	double balance;
	
	Bank(double balance)
	{
		this.balance=balance;
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
