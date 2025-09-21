package projects_java;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char  y;
		do {
	// In this project we are going to implements scenarios using all loops.
		int select;
		
		System.out.println("Which loop you want to use: ");
		System.out.println("1. if you have range or number of iteration use For loop");
		System.out.println("2. if you don't know the iteration number use while");
		System.out.println("3. if you want to run at least onces use do-while");
		
		select = sc.nextInt();
		
		switch(select) {
		case 1: {
			System.out.println("Enter the start No. for iteration: ");
			int start = sc.nextInt();
			System.out.println("Enter the end No.: ");
			int end = sc.nextInt();
			for(int g = start;g<=end;g++) {
				System.out.println("No of Iteration: " + g);
				
			}break;
		}
		case 2: {
			System.out.println("Enter the no: ");
			int start = sc.nextInt();
			
			while(start >= 0) {
				System.out.println("No of iteration" + start );
				start--;
			}
		    break;
			
		}
		case 3: {
			System.out.println("This is going to infinite loop only enter false value");
			System.out.println("Enter the no: ");
			int start = sc.nextInt();
			do {
				System.out.println("At least once");
				start++;
			}while(start >= 0);     // infinite loop
		break;
		}
		default:{
			System.out.println("Select only above options.");
		}
		}
		System.out.println("Want continue(Y/N): ");
		y = sc.next().charAt(0);

		}while(y=='Y' || y =='y');
		sc.close();
	}

}
