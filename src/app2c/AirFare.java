package app2c;
import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        float tfare = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("distance: ");
        int dis = sc.nextInt();
        System.out.print("Class: ");
        float cl = sc.nextFloat();
        
       
        if(cl == 1){
            cl = 250;
             tfare = dis * cl;
            System.out.printf("total fare: %.2f%n", tfare);
        }else if(cl == 2){
             tfare = dis * 500;
            cl = 500;
             tfare = tfare - (tfare * 0.10f);
            System.out.printf("total fare: %.2f%n", tfare);
        }
      
    }
}
