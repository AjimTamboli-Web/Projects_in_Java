package projects_java;

import java.util.Scanner;

public class Unary_Numbers_op {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     
     System.out.print("Enter the Number: ");
     int num = sc.nextInt();
     
     int aj = num;
     System.out.println("Positive Number (+) : " + aj);
     
     int az = -num;
     System.out.println("Negative Number (-) : " + az);
     
     int as = ++num;
     System.out.println("Pre-increment Number : " + as);
     
     int ax = num++;
     System.out.println("Post-increment Number : " + ax);
     
     int ac = num--;
     System.out.println("Post-decrement Number : " + ac);
     
     int af = --num;
     System.out.println("Pre-decrement Number : " + af);
     
     System.out.println("Your Value is now : " + num);
     
     
     boolean ar= false;  // using ! operator
     System.out.println(!ar);
     
     
     sc.close();
       
	}

}
