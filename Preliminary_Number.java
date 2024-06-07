package preliminary_number;

import java.util.Scanner;

public class Preliminary_Number {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int T = 0;
        System.out.println("Enter Any Number : ");
        int number = in.nextInt();
        for (int counter = 2; counter < number; counter++) {
            if (counter % counter == 0) {
                T++;
            }
        }
        if (T == 0) {
            System.out.println("Preliminary Number .");
        } else {
            System.out.println("Not Preliminary Number .");
        }
    }
    
}
