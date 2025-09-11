package projects_java;

import java.util.Scanner;

public class Logical_op {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age : ");
		byte no = sc.nextByte();

        if(no > 0 && no < 100) {
        	if(no > 18 || no >10) {
        		if(no < 18 && no > 10) {
        			System.out.println("Your a teen.");
        		}
        		else {
        			System.out.println("You can Vote.");
        		}
        	}
        	else
        	{
        		System.out.println("Your a Child");
        	}
        	
        }
        else {
        	System.out.println("Something wrong.");
        }
		
		sc.close();    
	}
}



