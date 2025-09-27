package projects_java;

import java.util.Scanner;

public class Arrays_User {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);			
		System.out.println("Enter array Row: ");
		int row = scan.nextInt();	
		
		
//		System.out.println("Enter the Column: ");	
//		int arr2 = scan.nextInt();
//		int column = 0;
//	    column = arr2;
		
	    int count = 1;
		int[][] arr = new int[row][];
		
		
		for(int k =0;k<row;k++) {     // loop for get column range
			
			System.out.println("Enter the range for column: " + k);
		    int col = scan.nextInt();
			arr[k] = new int[col];
			
		 	System.out.println(" Enter the  " + col + " value for [" + k + "] column : ");
		 	
		 	for(int l=0;l<col;l++) {   // loop for get column values
		 		
		 	arr[k][l] = scan.nextInt();
		     }
		 }
		
		
// this for loop is using counter to start your array from 1 no.	
		
//		for(int i =0;i<arr.length;i++) {
//			
//			for(int j = 0;j<arr[i].length;j++) {
//
//				arr[i][j] = count;
//				count++;		
//			}
//		}
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println(" Column length of each row::");
		for(int i =0;i<arr.length;i++) {
			System.out.println("Row [" + i + "]" + " has [" + arr[i].length + "] Column.");
		}
		     
		
		scan.close();
		

	}

}
