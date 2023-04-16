package math.calculate;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Welcome to divider program ! \n");

        System.out.print("Input the start interval  = ");
        int num_1 = input.nextInt();
        System.out.print("Input the end interval    = ");
        int num_2 = input.nextInt();
        System.out.print("Input the divider         = ");
        int divider  = input.nextInt();
        System.out.println("");

        int output_2 = 0;
        
        System.out.print("Output 1 = ");
        while(num_1 <= num_2){
            
            if(num_1 %divider == 0){
                System.out.print(num_1 + " ");
                output_2++;
            }   
            num_1++;
        }
        System.out.println("\n");

        System.out.println("Output 2 = " + output_2 + "\n");

        System.out.println("Thank you for using this program :) \n");

        input.close();
        
    }

}
