package projects_java;

import java.util.Scanner;

public class If_ladder_GST {

	public static void main(String[] args) {
		// THis program for addressing GST in products with amount.
		
		Scanner sc = new Scanner(System.in);
	    int select;
	    char again;
		do {
		
		System.out.println("Select the product for purchase:: ");
        System.out.println("1. Small cars (Petrol/Diesel with 18% GST) : ");
        System.out.println("2.Luxury Cars/SUVs/Large cars with 40% GST :  ");
        System.out.println("3. Mobile phones and electronics with 18% : ");
         select = sc.nextInt();
        
        
        if(select==1) {
        	System.out.println("Select the cars with base price : ");
        	System.out.println("1. Petrol < 1200cc 5Lac : ");
        	System.out.println("2. Diesel < 1500cc 4Lac : ");
        	int car = sc.nextInt();
        	
        	if(car == 1) {
        		double base = 5_00_000;
        		double Gst_amount = (base * 18)/ 100;
        		long total = (long) ((long)base + Gst_amount);
        		System.out.println("Petrol cars is base price is 5L : ");
        	    System.out.println(" With 18% GST amount is : " + Gst_amount);	
        		System.out.println("Total amount is : " + total);
        	    
        	}else {
        		double base = 4_00_000;
        		double Gst_amount = (base * 18)/ 100;
        		long total = (long) ((long)base + Gst_amount);
        		System.out.println("Diesel Cars is base price is 4L : ");
        	    System.out.println(" With 18% GST amount is : " + Gst_amount);
        	   System.out.println("Total amount is : " + total);
        	}
        	
        	
        }else if(select == 2) {
        	System.out.println("Select Luxury Cars with base price : ");
        	System.out.println("1.SUVs \n2.Toyota Fortuner \n3.BMW X5 : ");
        	int lux = sc.nextInt();
        	
        	if(lux==1) {
        		double base = 33_00_000;
        		double Gst_amount = (base * 40)/ 100;
        		long total = (long) ((long)base + Gst_amount);
        		System.out.println("SUVs base price is 33L. ");
        		System.out.println("With 40% GST amount is : " + Gst_amount);
        	    System.out.println("Total amount is : " + total);
        	}else if(lux == 2) {
        		double base = 35_00_000;
        		double Gst_amount = (base * 40)/ 100;
        		long total = (long) ((long)base + Gst_amount);
        		System.out.println("Toyota Fortuner base price is 35L. ");
        		System.out.println("With 40% GST amount is : " + Gst_amount);
        	    System.out.println("Total amount is: " + total);
        	}else {
        		double base = 95_00_000;
        		double Gst_amount = (base * 40)/ 100;
        		long total = (long) ((long)base + Gst_amount);
        		System.out.println("BMW X5 base price is 95L. ");
        		System.out.println("With 40% GST amount is : " + Gst_amount);
        	    System.out.println("Total amount is : " + total);
        	}
        	
        }
        else if(select == 3){
        	System.out.println("Select Mobiles or Laptops ");
        	System.out.println("1.Mobiles  \n 2.Laptops: ");
        	
        	int lap = sc.nextInt();
        	
        	if(lap == 1) {
        		double base = 10_000;
        		double Gst_amount = (base * 18)/ 100;
        		long total = (long) ((long)base + Gst_amount);
        		System.out.println("Mobiles base price is 10,000 ");
        	    System.out.println("With  18% GST amount is : " + Gst_amount);
        	    System.out.println("Total amount is : " + total);
        	}else {
        		double base = 30_000;
        		double Gst_amount = (base * 18)/ 100;
        		long total = (long) ((long)base + Gst_amount);        		System.out.println("Laptop base price is 30,000 ");
        	    System.out.println("With 18% GST amount is : " + Gst_amount);
        	    System.out.println("Total amount is : " + total);
        	}
        }
        System.out.println("/n DO you want to Continue: (Y/N) : ");
        again = sc.next().charAt(0);
        
	    }while(again == 'Y' || again == 'y');
		System.out.println("***********************************");
        sc.close();
	}

}
