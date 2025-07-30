package app2c;
import java.util.Scanner;
public class Aldrennnn {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String name;
        float hr,gross;
        int thr;
        float sss;
        float nww = 0;
        System.out.print("Enter employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        hr = sc.nextFloat();
        System.out.print("Enter total hours worked this week: ");
        thr = sc.nextInt();
        gross = hr * thr;
        sss = (float) (gross * 0.10);
        nww = gross - sss;
        
        System.out.println("---- Wage Summary ----");
        System.out.println("Employee: "+name);
        System.out.printf("Hourly Rate: ₱%.2f\n", hr);
        System.out.println("Hours Worked: "+thr);
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", gross);
        System.out.printf("SSS Contribution: ₱%.2f\n", sss);
        System.out.println("____________________________");
        System.out.printf("Next Weekly Wage: ₱%.2f\n", nww);
    }
    }
    

