package dealing_with_arrays;

import java.util.Scanner;

public class Dealing_with_Arrays {
    public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
        System.out.print("Enter The Size Of Array : ");
        int size=in.nextInt();
        int array[][]=new int[size][size];
            int num_of_opration;
            int counter_of_tries=1;
        do {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1)Enter Array Elemens");
            System.out.println("2)Print Array Elemens");
            System.out.println("3)Search  In Array");
            System.out.println("4)Update Array Elemens");
            System.out.println("5)Exit");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Enter The Number of Thr Operation : ");
            num_of_opration=in.nextInt();
            if(num_of_opration==1||counter_of_tries>1)
            switch(num_of_opration){            
                case 1:{
                    System.out.println("Enter The Elements Of Array : ");
                    for (int row= 0; row < array.length; row++) {
                        for (int clomun = 0; clomun <array.length; clomun++) {
                            array[row][clomun]=in.nextInt();
                        }}break;}
                case 2:{
                    System.out.println("The Elements Of Array : ");
                    for (int row = 0; row < array.length; row++) {
                        for (int clomun = 0; clomun < array.length; clomun++) {
                            System.out.print(array[row][clomun]+" ");
                        }System.out.println(" ");
                    }break;}
                
                case 3:{
                    int which_row = 0,which_column=0;
                System.out.println("Enter The Number That You Want To Found It : ");
                int num=in.nextInt();
                boolean is_found=false;
                for (int row = 0; row < array.length; row++) {       
                for (int column = 0; column < array.length; column++) {
                if (num==array[row][column]){ 
                    is_found=true;
                which_row=row;
                which_column=column;
                }   
                        }}
                if(is_found){
                System.out.println("Found");
                System.out.println("The Number "+num+" Is Located In Row Number "+(which_row+1)+" And In The Column Number "+(which_column+1)+" .");
                }
                else
                System.out.println("No Found");break;}
        
                case 4:{
                System.out.print("Enter The Number That You Want To Change It : ");
                int num=in.nextInt();
                    System.out.println( );
                int num1;
                boolean f=false;
                for (int row = 0; row < array.length; row++) {       
                for (int column = 0; column < array.length; column++) {
                if (num==array[row][column]){ 
                System.out.print("Enter The Number That You Want To Put It Instead Of Number "+num+" : ");
                num1=in.nextInt();
                    array[row][column]=num1;
                    f=true;
                    break;
                }}}}
                
            default:System.out.println("There Is No Option ");}
            else {
            System.out.println("You Should To Enter Number One");}
            counter_of_tries++;
        } while (num_of_opration!=5);
        
    }
    
}
