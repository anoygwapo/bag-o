package app2c;

import java.util.Scanner;

public class acivity1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        System.out.print("Enter marks in Science: ");
        double science = scan.nextDouble();

        System.out.print("Enter marks in History: ");
        double history = scan.nextDouble();

        System.out.print("Enter marks in Math: ");
        double math = scan.nextDouble();

        System.out.print("Enter marks in Soc: ");
        double soc = scan.nextDouble();

        System.out.print("Enter marks in Arts: ");
        double arts = scan.nextDouble();

        
        double total = science + history + math + soc + arts;
        double average = total / 5.0;
 String remarks ;
   if (average < 70) {
    remarks = "Fail";
} else if (average >= 70 && average <= 75) {
    remarks = "Poor";
} else if (average > 75 && average <= 80) {
    remarks = "Fair";
} else if (average > 80 && average < 86) {
    remarks = "Good";
} else if (average >= 86 && average <= 90) {
    remarks = "Very Good";
} else {
    remarks = "Excellent";
}

        System.out.printf("\nTotal Marks: %.0f\n", total);
        System.out.printf("Total percentage: %.2f\n", average);
        System.out.println("Remarks: " + remarks);

        if (average < 70) {
            System.out.println("Try Again");
        } else {
            System.out.println("Congrats " + name + ", you Passed.");
        }
    }
}
