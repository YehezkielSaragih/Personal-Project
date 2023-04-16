package math.time;

import java.util.Scanner;

public class Time_1 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int time_input;
        int time_result;
   
        System.out.println("Welcome to time converter program");
        System.out.println("");

        // Choose what kind of time to convert
        System.out.println("What kind time converter do you want to use ? ");
        System.out.println("Type the number of converter do you want !");
        System.out.println("1) Hour to minute");
        System.out.println("2) Hour to second");
        System.out.println("3) Minute to second");
        number = input.nextInt();
        // Warning wrong number input
        while(number < 0 || number == 0 || number > 3 ) {
            System.out.println("The number must be within 1, 2, and 3 !");
            number = input.nextInt();
        }
        System.out.println("");

        // Execute what kind of converter
        if(number == 1) // Hour to minute converter
        { 
            System.out.println("Type the hour that you want convert to minute ?");
            time_input = input.nextInt();
            // Warning wrong time input
            while(time_input <0 || time_input == 0){
                System.out.println("Please input a valid time !");
                time_input = input.nextInt();
            }

            time_result = time_input* 60 ; // Hour to minute formula
            System.out.println("");
            System.out.println(time_input + " hour is equals to " + time_result + " minute.");
        }
        if(number == 2) // Hour to second converter
        {
            System.out.println("Type the hour that you want convert to second ?");
            time_input = input.nextInt();
            // Warning wrong time input
            while(time_input <0 || time_input == 0){
                System.out.println("Please input a valid time !");
                time_input = input.nextInt();
            }

            time_result = time_input* 60 * 60; // Hour to second formula
            System.out.println("");
            System.out.println(time_input + " hour is equals to " + time_result + " second.");
        }
        if (number == 3) // Minute to second converter
        {
            System.out.println("Type the minute that you want convert to second ?");
            time_input = input.nextInt();
            // Warning wrong time input
            while(time_input <0 || time_input == 0){
                System.out.println("Please input a valid time !");
                time_input = input.nextInt();
            }
            time_result = time_input* 60 ; // Minute to second formula
            System.out.println("");
            System.out.println(time_input + " minute is equals to " + time_result + " second.");
        }
        System.out.println("");

        // Closing program
        System.out.println("Thank you for using this program :)");

        input.close();
    }

}
