package javaProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		 System.out.println("Enter the number:");
		 int number = scan.nextInt();		
		  boolean isPrime = true;
		  
		  if(number < 2) {
			  
			  System.out.println("Wrong dialing..");
		  }
		  
		 for(int i = 2; i < number ; i++) {
			 
			 if( number % i == 0 ) {
				 
				 isPrime = false;
			 }
		 }
		 
		 if(isPrime) {
			 System.out.println("Number is Prime..");
		 }else {
			 System.out.println("number is not prime..");
		 }
		
		}
	}
