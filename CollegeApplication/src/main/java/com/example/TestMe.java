package com.example;

public class TestMe {

	public static void main(String[] args) {
		System.out.println("I am here");		int i = 0;
		int k = add(i, 30);
		System.out.println(k);
		System.out.println("I am going to end");
		
	}
	
	private static int add(int j, int k) {
		int z = j + k;
		System.out.println("I added");
		return z;
	}
}
