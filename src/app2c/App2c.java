
package app2c;

import java.util.Scanner;

public class App2c {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pm;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        pm = num % 2;

        if (num == 0) {
            System.out.println("Inputted number zero");
        } else if (pm == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
    
}
