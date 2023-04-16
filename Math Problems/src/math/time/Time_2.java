package math.time;

import java.util.Scanner;

public class Time_2 {
    
    public static void main(String[] args) {

        System.out.println("Welcome to time difference checker");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        // Input 1 = Jam 1
        System.out.println("Input the first hour that you want check the difference");
        int first_hour = input.nextInt();
        while(first_hour <0 || first_hour == 0){
            System.out.println("Please input a valid time !");
            first_hour = input.nextInt();
        }
        // input 2 = Menit 1
        System.out.println("Input the first minute that you want check the difference");
        int first_minute = input.nextInt();
        while(first_minute <0){
            System.out.println("Please input a valid time !");
            first_minute = input.nextInt();
        }
        // Output 1 2
        System.out.println("Input one = " + first_hour + " hour " + first_minute + " minutes");
        System.out.println("");

        // Input 3 = Jam 2
        System.out.println("Input the second hour that you want check the difference");
        int second_hour = input.nextInt();
        while(second_hour <0 || second_hour == 0){
            System.out.println("Please input a valid time !");
            second_hour = input.nextInt();
        }
        // Input 4 = Menit 2
        System.out.println("Input the second minute that you want check the difference");
        int second_minute = input.nextInt();
        while(second_minute <0){
            System.out.println("Please input a valid time !");
            second_minute = input.nextInt();
        }
        // Output 3 4
        System.out.println("Input one = " + second_hour + " hour " + second_minute + " minutes.");
        System.out.println("");

        // Output Result  = Selisih Jam dalam bentuk menit
        int time_input_1 = first_hour * 60 + first_minute;
        int time_input_2 = second_hour *60 + second_minute;
        int time_difference = time_input_1 - time_input_2;
        System.out.println("The difference beetween the two time that you input is " + time_difference + " minute.");
        System.out.println("");

        // Closing Program
        System.out.println("Thank you for using this program :)");
        input.close();

    }
}
