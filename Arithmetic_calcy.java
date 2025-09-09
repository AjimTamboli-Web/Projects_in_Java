package projects_java;

import java.util.Scanner;

public class Arithmetic_calcy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.println("The Sum of the two numbers is: " + sum);
        System.out.println("The Subtraction of the two numbers is: " + sub);
        System.out.println("The Multiplication of the two numbers is: " + mul);
        System.out.println("The Division of the two numbers is: " + div);

         sc.close();
	}

}
