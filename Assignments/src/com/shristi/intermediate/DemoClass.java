package com.shristi.intermediate;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//1.
//		Vehicle v1=new Vehicle("Benz","aclass",2000);
//		
//		v1.getDetails();
//		
//		Vehicle v2=new Vehicle("Audi","zclass",9000);
//		System.out.println();
//		v2.getDetails();
	
		
		
		//2.
//		Bank b=new Bank(2000);

//		while(true)
//		{
//		System.out.println("1.withdraw\n2.deposit\n3.balance\n4.exit");
//		int s=sc.nextInt();
//		switch(s) 
//		{
//		case 1:
//			System.out.println("amount");
//		    int amt=sc.nextInt();
//			b.withdraw(amt);
//			break;
//		
//		case 2:
//			System.out.println("amount");
//		    int amts=sc.nextInt();
//			b.deposit(amts);
//			break;
//			
//		case 3:
//			System.out.println(b.getBalance());
//			break;
//			
//		case 4:
//			System.out.println("exit");
//			System.exit(0);
//			break;
//		default:
//			System.out.println("invalid");
//			
//		}
//		}
		
		//3.
		int arr[]=new int[3];
		System.out.println("name");
		String name=sc.nextLine();
		System.out.println("id");
		int id=sc.nextInt();
		System.out.println("3 sub marks");
		for(int i=0;i<3;i++)
			arr[i]=sc.nextInt();
		
		Student s1=new Student(name,id,arr);
		s1.getGrades();
		s1.getDetails();
		
	}

}
