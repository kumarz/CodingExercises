package kumar.coding.exercises.problemSolving;

import java.util.Scanner;

/**
 * @author  Kumar
 * This program is to demonstrate the implementation of Fibonacci
 * using iteration Vs Recursive methods.
 * 
 */
public class Fibonacci {
	public static void main (String args[]){
		System.out.println("Application started...");
		System.out.println("Please enter the number of digits for a fibonacci series");
		try(Scanner scanner = new Scanner(System.in);){
			int input = scanner.nextInt();
			generateFibonacciRecursive(input);
			// generateFibonacci(input);
		}
	}

	private static void generateFibonacci(int number) {
		int n1=0,n2=1,n3,i,count=number;    
		 System.out.print(n1);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
	}
	
	private static void generateFibonacciRecursive(int number) {
		int n1=0,n=2;    
		 System.out.println(n1);//printing 0 and 1    
		 while(n < number){
			 System.out.print(" " +fibo(n));
			 n++;
		 }
		 
	}
	
	static int fibo(int n){
		 if(n <= 1){
		  return n;
		 }else{
		  return fibo(n-1) + fibo(n-2);
		 }
		}
}
