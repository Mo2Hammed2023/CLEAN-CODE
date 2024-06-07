package overloading;

import java.util.Scanner;

public class Overloading {static Scanner in =new Scanner (System.in);
 
    static void user(){
            System.out.println("Enter The name : ");
            String name =in.next();
            System.out.println("Enter The phone number : ");
            String phone =in.next();
            String brather_inf[]=brather();
            int b[]=numbers();
            print(phone,name,brather_inf,b);
            }
    
    static void print(String name,String phone_num,String []brother,int[] fav_num){
        System.out.println("Your Name : "+name);
        System.out.println("Your phone num : "+phone_num);
        System.out.println("You have "+brother.length);
        System.out.print("Your brothers ara :");
        for (int i = 0; i < brother.length; i++) {
            System.out.print(brother[i]+"\t");
        }System.out.println();
        System.out.print("Your favroite numbers : ");
        for (int i = 0; i < fav_num.length; i++) {
            System.out.print(fav_num[i]+"\t");
        }}
    
    static String[] brather(){
        System.out.println("Enter number of brother : ");
        int num_brather=in.nextInt();
        String brather[]=new String[num_brather];
        for (int i = 0; i <num_brather ; i++) {
            System.out.println("Enter Rhe Name of brather");
             brather[i]=in.next();
           }
        return brather;
        }
    
    static int[] numbers(){
        int []d=new int[3];
            System.out.println("Enter  three numbers : ");
        for (int i = 0; i <3 ; i++) {
             d[i]=in.nextInt();
           }
        return d;
        }  
    public static void main(String[] args) {
    user();
    }
    
}
