package math.calculate;

import java.util.Scanner;

public class OddEven {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Welcome to Odd and Even Number Checker");
        System.out.println("");

        // Input integer
        System.out.println("Type the Integer number that you want to check !");
        number = input.nextInt();
        // Warning Message
        while(number < 0 || number == 0){
            System.err.println("This input must be higher than 0 !");
            number = input.nextInt();
        }
        System.out.println("");

        // Print Result 
        if(number %2 == 0) {
            System.out.println("The number is even. \n");
        }
        else {
            System.out.println("The number is odd.\n"); 
        }    

        // Closing program
        System.out.println("Thank you for using this program :) ");
        
        input.close();

    }
}
