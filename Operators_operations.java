package projects_java;

import java.util.Scanner;

public class Operators_operations {

	public static void main(String[] args) {
		
		        
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Choose a Operator Type You Want to work with: ");
				System.out.println("1. Arithmetic Operators : +, -, *, /, %");
				System.out.println("2. Relational Operators : ==, !=, >, <, >=, <=");
				System.out.println("3. Logical Operators : &&, ||, !");
				System.out.println("4. Assignment Operators : =, +=, -=, *=, /=, %=");
				System.out.println("5. Unary Operators : +, -, ++, --, !");
				System.out.println("Enter Your Choice :: ");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.println("** Arithmetic Operators **");
					System.out.println("Enter 1st No : ");
					int a = sc.nextInt();
					System.out.println("Enter 2nd No : ");
					int b = sc.nextInt();
					
					System.out.println(a + " + " + b + "=" + (a+b) );
					System.out.println(a + " - " + b + "=" + (a-b) );
					System.out.println(a + " * " + b + "=" + (a*b) );
					
					if(b !=0) {
						System.out.println(a + " / " + b + "=" + (a/b));
						System.out.println(a + " % " + b + "=" + (a%b));
					}else {
						System.out.println("Division And Modulus not possible (b=0).");
					}
					
				}
				else if(choice == 2) {
					System.out.println("** Relational Operators **");
					System.out.println("Enter 1st No : ");
					int x = sc.nextInt();
					System.out.println("Enter 2nd No : ");
					int y = sc.nextInt();
					
					System.out.println(x + " == " + y + "=" + (x==y) );
					System.out.println(x + " != " + y + "=" + (x!=y) );
					System.out.println(x + " > " + y + "=" + (x>y) );
					System.out.println(x + " < " + y + "=" + (x<y) );
					System.out.println(x + " >= " + y + "=" + (x>=y) );
					System.out.println(x + " <= " + y + "=" + (x<=y) );
					
				}
				else if(choice == 3){
					System.out.println("** Logical Operators **");
					System.out.println("You have to check your condition True or False only");
					System.out.println("Enter 1st Condition : ");
					boolean m = sc.nextBoolean();
					System.out.println("Enter 2nd Condition1 : ");
					boolean n = sc.nextBoolean();
					
					System.out.println("1 && 2 : " + (m && n));
					System.out.println("1 || 2 : " + (m || n));
					System.err.println("! 1 : " + !m );
					System.out.println("! 2 : " + !n);	
					
				}
				else if(choice == 4) {
					System.out.println("** Assignment Operators Operators **");
					System.out.println("Enter  Number : ");
					int i = sc.nextInt();
					
					int w = i;
					System.out.println("w = m -> w = " +w);
					
					w += 5;
					System.out.println(" w += 5 :: " +w);
					
					w -= 3;
					System.out.println(" w -= 3 :: " +w);
					
					w *= 2;
					System.out.println(" w *= 2 :: " +w);
					
					w /= 2;
					System.out.println(" w /= 3 :: " +w);
					
					w %=3;
					System.out.println(" w %= 3 :: " +w);
							
				}
				else if(choice == 5) {
					System.out.println("** Unary Operators **");
					System.out.println("Enter  No : ");
					int p = sc.nextInt();
					
					System.out.println("Unary plus (+) " + (+p));
					System.out.println("Unary minus (-) " + (-p));
					
					System.out.println("val++ (Post increment) = " + (p++));
					System.out.println("After increment value is : " + p);
					System.out.println("++val (Pre increment) = " + (++p));
					System.out.println("val-- (Post decrement) = " + (p--));
					System.out.println("After decrement value is : " + p);
					System.out.println("++val (Pre decrement) = " + (++p));
					
					// Logical Not
					System.out.println("Enter a boolean (true/false) : ");
					boolean flag = sc.nextBoolean();
					System.out.println("!flag = " + (!flag));
					
				}
				else {
					System.out.println("Invalid Choice");
				}
				
				
				sc.close();
				
			}

		}
		 
	


