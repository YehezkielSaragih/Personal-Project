package math.calculate;

import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Welcome to Collatz Conjecture Program \n");

        System.out.print("Input = ");
        int num = input.nextInt();

        System.out.print("Output = ");
        for(int i = num; i > 1;){
        
            // Even (Genap)
            if(i % 2 == 0){
                i = i / 2;
            } 
            // Odd (Ganjil)
            else if(i % 2 != 0) {
                i = i * 3 + 1;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Thank you for using this program :) \n");

        input.close();
    }

}   