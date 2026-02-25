package projects_java;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Bus_Booking_System {
	
	

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	

        HashSet<BusBooking> bookings = new HashSet<>();
        Set<Integer> selectedSeats = new HashSet<>();
      
        System.out.println("========================================");
        System.out.println("        WELCOME TO BUS BOOKING SYSTEM    ");
        System.out.println("========================================");

        System.out.print("Enter number of seats to book (1-4): ");
        int seats = sc.nextInt();

        if (seats < 1 || seats > 4) {
            System.out.println("Invalid seat selection!");
            return;
        }

        // ---------- FROM CITY ----------
        System.out.println("\nSelect city From =>");
        showcityFrom();
        int boarding = sc.nextInt();

        String fromCity = getCityName(boarding);
        showBoardingPoints(boarding);

        System.out.print("Select boarding point: ");
        int boardingPoint = sc.nextInt();
        String boardingPointName = getBoardingPointName(boarding, boardingPoint);

        // ---------- TO CITY ----------
        System.out.println("\nSelect city To =>");
        showcityTo();
        int dropping = sc.nextInt();

        String toCity = getCityName(dropping);
        showDroppingPoints(dropping);

        System.out.print("Select dropping point: ");
        int droppingPoint = sc.nextInt();
        String droppingPointName = getDroppingPointName(dropping, droppingPoint);

        //-------------Set Selected ---------------------
        showSeatLayout();

        for (int i = 1; i <= seats; i++) {

            System.out.println("\nPassenger " + i + " Details");
           //------------hashSet Method/class call ------------------------------
            int seat;
            while (true) {
                System.out.print("Enter seat number: ");
                seat = sc.nextInt();
                if (!selectedSeats.contains(seat)) {
                    selectedSeats.add(seat);
                    break;
                }
                System.out.println("Seat already selected! Choose another.");
            }

            //---------- Passengers Details -------------------
            System.out.print("Enter Name: ");
            String name = sc.next();

            String gender;
            while (true) {
                System.out.print("Enter Gender (M/F): ");
                gender = sc.next().toUpperCase();
                if (gender.equals("M") || gender.equals("F")) break;
                System.out.println("Invalid gender!");
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            String number;
            while (true) {
                System.out.print("Enter 10-digit Mobile Number: ");
                number = sc.next();
                if (number.matches("\\d{10}")) break;
                System.out.println("Invalid number!");
            }
            //-------------HashSet method call -------------------------
            bookings.add(new BusBooking(
                    name, number, age, seat, gender,
                    fromCity, boardingPointName,
                    toCity, droppingPointName
            ));
        }

        System.out.println("\n========================================");
        System.out.println("        THANK YOU FOR BOOKING           ");
        System.out.println("========================================");
        //---- ---------------UUID METHOD Used --------------------------
        for (BusBooking b : bookings) {
            String bookingId = "BUS" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            System.out.println(b +"\n Booking ID:  " + bookingId);
        }

         Amount am=new Amount(seats);
    }

    
    
    // ---------- CITY  ----------
    static void showcityFrom() {
        System.out.println("1. Mumbai");
        System.out.println("2. Pune");
        System.out.println("3. Nashik");
        System.out.println("4. Nagpur");
        System.out.println("5. Aurangabad");
        System.out.println("6. Kolhapur");
        System.out.println("7. Satara");
        System.out.println("8. Solapur");
    }

    static void showcityTo() {
        showcityFrom();
    }

    static String getCityName(int c) {
        String[] cities = {"Mumbai","Pune","Nashik","Nagpur","Aurangabad","Kolhapur","Satara","Solapur"};
        return cities[c - 1];
    }

    // ---------- BOARDING ----------
    static void showBoardingPoints(int city) {
        String[][] bp = {
                {"Dadar","Andheri","Borivali","Kurla"},
                {"Swargate","Katraj","Nigdi","Dange Chowk"},
                {"CBS","College Road","Panchavati","MIDC"},
                {"Sitabuldi","Dharampeth","Wardha Road","Sadar"},
                {"CIDCO","Kranti Chowk","Waluj","Station"},
                {"Bus Stand","Rankala","Tarabai Park","Udyamnagar"},
                {"Powai Naka","Karad Naka","MIDC","Bus Stand"},
                {"Central Stand","Railway Station","Akkalkot Rd","Hotgi Rd"}
        };
        for (int i = 0; i < 4; i++)
            System.out.println((i + 1) + ". " + bp[city - 1][i]);
    }

    static String getBoardingPointName(int city, int p) {
        String[][] bp = {
                {"Dadar","Andheri","Borivali","Kurla"},
                {"Swargate","Katraj","Nigdi","Dange Chowk"},
                {"CBS","College Road","Panchavati","MIDC"},
                {"Sitabuldi","Dharampeth","Wardha Road","Sadar"},
                {"CIDCO","Kranti Chowk","Waluj","Station"},
                {"Bus Stand","Rankala","Tarabai Park","Udyamnagar"},
                {"Powai Naka","Karad Naka","MIDC","Bus Stand"},
                {"Central Stand","Railway Station","Akkalkot Rd","Hotgi Rd"}
        };
        return bp[city - 1][p - 1];
    }

    // ---------- DROPPING ----------
    static void showDroppingPoints(int city) {
        String[][] dp = {
                {"Bandra","Chembur","Thane","Navi Mumbai"},
                {"Wakad","Hinjewadi","Hadapsar","Kharadi"},
                {"Gangapur Rd","Dwarka","Adgaon","Ambad"},
                {"Manish Nagar","Mihan","Chatrapati Sq","Jaripatka"},
                {"Jalna Rd","Paithan Gate","Beed Bypass","Chikalthana"},
                {"Ujalaiwadi","Shahupuri","Gandhinagar","Ichalkaranji"},
                {"Karanje","Godoli","Degaon","MIDC"},
                {"Vijapur Rd","Barshi Rd","Pandharpur Rd","Akluj"}
        };
        for (int i = 0; i < 4; i++)
            System.out.println((i + 1) + ". " + dp[city - 1][i]);
    }

    static String getDroppingPointName(int city, int p) {
        String[][] dp = {
                {"Bandra","Chembur","Thane","Navi Mumbai"},
                {"Wakad","Hinjewadi","Hadapsar","Kharadi"},
                {"Gangapur Rd","Dwarka","Adgaon","Ambad"},
                {"Manish Nagar","Mihan","Chatrapati Sq","Jaripatka"},
                {"Jalna Rd","Paithan Gate","Beed Bypass","Chikalthana"},
                {"Ujalaiwadi","Shahupuri","Gandhinagar","Ichalkaranji"},
                {"Karanje","Godoli","Degaon","MIDC"},
                {"Vijapur Rd","Barshi Rd","Pandharpur Rd","Akluj"}
        };
        return dp[city - 1][p - 1];
    }

    static void showSeatLayout() {
        System.out.println("\nSeats:" );
        System.out.println("Front of Bus     ");
        System.out.println("-----------------");
        System.out.println("w1   2  |   3  4w");
        System.out.println("w8   7  |   6  5w");
        System.out.println("w9  10  |  11 12w");
        System.out.println("w16 15  |  14 13w");
        System.out.println("w17 18  |  19 20w");
        System.out.println("w24 23  |  22 21w");
        System.out.println("w25 26  |  27 28w");
        System.out.println("w32 31  |  30 29w");
        System.out.println("w33 34  |  35 36w");
        System.out.println("w41 40 39  38 37w");
        System.out.println("-----------------");
    }
}




// ---------- BusBooking ----------
class BusBooking {
    String name, number, gender;
    int age, seat;
    String fromCity, boardingPoint, toCity, droppingPoint;

    public BusBooking(String name, String number, int age, int seat, String gender,
                      String fromCity, String boardingPoint,
                      String toCity, String droppingPoint) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.seat = seat;
        this.gender = gender;
        this.fromCity = fromCity;
        this.boardingPoint = boardingPoint;
        this.toCity = toCity;
        this.droppingPoint = droppingPoint;
    }

    public String toString() {
        return     " name      : " +name + "  \n Contact   : " + number +
        		                           "  \n Age       : "+ age +
                "  \n Seat      : " + seat + "  \n Gender   : " + gender +
                "  \n From      : "+ fromCity + " (" + boardingPoint + ")" +
                 "  \n To        : "+ toCity + " (" + droppingPoint + ")";
    }
    //------------parameterized variable------------------------
    public int hashCode() {
        return Objects.hash(seat, number);
    }

    public boolean equals(Object o) {
        if (!(o instanceof BusBooking)) return false;
        BusBooking b = (BusBooking) o;
        return seat == b.seat && number.equals(b.number);
    }
}

// ---------- Amount ----------
class Amount {
    private static final int PRICE_PER_SEAT = 800;

    public Amount(int seats) {
        System.out.println("\nFinal Booking Amount: ₹" + (seats * PRICE_PER_SEAT));
    }
}