package com.cts.example;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		
		int n,r;
		Scanner s = new Scanner(System.in);
		System.out.println("n");
		n= s.nextInt();
		System.out.println("r");
		r= s.nextInt();
		System.out.println("a[]");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i = 0; i < r; i++){     
	        int j, temp = a[0];  
	        for(j = 0; j < n-1; j++){    
	            a[j] = a[j+1];  
	        }  
	        a[j] = temp;  
	    }  
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
					
		}
	}

}
