package projects_java;

import java.util.Scanner;

public class Relational_Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st No:: ");
		int num = sc.nextInt();
		
		System.out.print("Enter 2nd No:: ");
		int num1 = sc.nextInt();
		
		if(num <= num1) {
			if(num < num1) {
				System.out.println( num + " Less than " + num1 + " : " + (num < num1));
			    }
			       else
			          System.out.println( num + " Less than Or Equal" + num1 + " : " + (num <= num1));
			 }
		
		  else if(num >= num1){
			       if(num > num1){
				         System.out.println( num + " Greater than " + num1 + " : " +  (num > num1));
			           }
			      else
			             System.out.println( num + " Greater than or Equal " + num1 + " : " +  (num >= num1));
		            }
		 else 
			 System.out.println("Enter valid No!");
		
		
		 if(num == num1) {
		         System.out.println(num + "Is Equal To : " + num1 + " : " + (num == num1) );
		       }
		   else
		       System.out.println("No is not Equal" + " : " + (num!=num1));
		
	  sc.close();

	}

}
