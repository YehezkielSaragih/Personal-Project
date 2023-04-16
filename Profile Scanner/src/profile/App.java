package profile;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner profile = new Scanner (System.in);

        System.out.println("What is your name ?"); 
        var name = profile.nextLine();                  // Err : Name input can still be numbers or symbols
        
        System.out.println("What is your nickname ?");
        var nickname = profile.nextLine();              // Err : Name input can still be numbers or symbols    
        
        System.out.println("What is your gender ?");
        var gender = profile.nextLine();                // Err : Gender must be setting within male / female
        
	    System.out.println("What is your age ?");
        var age = profile.nextInt();
        while(age < 0 || age == 0) {
            System.err.println("Your age must be higher than 0 and a positive decimal !");
            age = profile.nextInt();
        }
        profile.nextLine();
        
        System.out.println("");
        
        System.out.println("Thank you " + nickname + ", are you sure all data are correct ?");
        System.out.println("Type True / False");
        var validate = profile.nextLine();
        System.out.println("");

        if(validate.equalsIgnoreCase("True")) {
            System.out.println("All data are saved to your account");
            System.out.println("Name = " + name);
            System.out.println("Gender = " + gender);
            System.out.println("Age = " + age);
            System.out.println("");
        }
        if(validate.equalsIgnoreCase("False")) {
            System.out.println("Please try again later !");
            System.out.println("");
        }
        profile.close();
    }
}