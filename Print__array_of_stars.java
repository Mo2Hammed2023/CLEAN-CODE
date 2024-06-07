package print__array_of_stars;

import java.util.Scanner;

public class Print__array_of_stars {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
    int array_of_stars[]=new int [3];
        for (int i = 0; i < array_of_stars.length; i++) {
            for (int j = 0; j <array_of_stars.length; j++) {
                System.out.print("*");
            }System.out.println();
        }
        
    }
    
}
