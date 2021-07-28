package com.shristi.intermediate;

public class Student {

	String name;
	int id;
	int arr[] = new int[3];

	Student(String name, int id, int a[]) {
		this.name = name;
		this.id = id;
		this.arr = a;
	}

	void getDetails() {
		//System.out.println("name " + name + "\nid " + id + "\ntotal " + sum + "\naverage " + avg + "marks ");
		for (int var : arr)
			System.out.println(var);
	}

	void getGrades() {
		int sum = 0;
		float avg = 0.0f;
		for (int var : arr)
			sum += var;
		avg = sum / 3;

	}

}
