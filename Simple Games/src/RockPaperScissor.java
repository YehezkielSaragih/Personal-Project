import java.util.Random;

import java.util.Scanner;

public class RockPaperScissor {
    
    public static void ProgramOpening(){

        System.out.println("==============================");
        System.out.println("   Rock Paper Scissor Games   ");
        System.out.println("==============================");
    }

    public static void WinCondition(String player_move, String computer_move){

        if(player_move.equalsIgnoreCase("Rock")) {

            if(computer_move.equalsIgnoreCase("Rock")){

                System.out.println("Draw.");
            }
            else if(computer_move.equalsIgnoreCase("Paper")){

                System.out.println("You lose the game.");
            }
            else if(computer_move.equalsIgnoreCase("Scissor")) {

                System.out.println("You win the game.");
            }
        }
        else if(player_move.equalsIgnoreCase("Paper")) {

            if(computer_move.equalsIgnoreCase("Rock")){

                System.out.println("You win the game.");
            }
            else if(computer_move.equalsIgnoreCase("Paper")){

                System.out.println("Draw.");
            }
            else if(computer_move.equalsIgnoreCase("Scissor")) {

                System.out.println("You lose the game.");
            }
        }
        else if(player_move.equalsIgnoreCase("Scissor")) {

            if(computer_move.equalsIgnoreCase("Rock")){

                System.out.println("You lose the game.");
            }
            else if(computer_move.equalsIgnoreCase("Paper")){

                System.out.println("You win the game.");
            }
            else if(computer_move.equalsIgnoreCase("Scissor")) {

                System.out.println("Draw.");
            }
        }
    }
    
    public static void ProgramCloser(){

        System.out.println("==============================");
        System.out.println("Thankyou for playing this game");
        System.out.println("==============================");
    }    
    
    public static void main(String[] args){

        ProgramOpening();

        System.out.println("Input rock, paper, or scissor");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        while(true){

            // Player Move
            System.out.print("Player move\t= ");
            String player_move = input.next();
            // Player Move Loop
            while(!(player_move.equalsIgnoreCase("Rock") || player_move.equalsIgnoreCase("Paper") || player_move.equalsIgnoreCase("Scissor"))){

                System.out.println("");
                System.err.println("Invalid input, please try again ");
                System.out.println("");
                System.out.print("Player move\t= ");
                player_move = input.next();
            }

            // Computer move
            String[] move = {"Rock", "Paper", "Scissor"};
            String computer_move = move[new Random().nextInt(move.length)];
            System.out.println("Computer move\t= " + computer_move);

            WinCondition(player_move, computer_move);
            
            // Retry 
            System.out.println("");
            System.out.println("Want to play again ? Yes / No");
            String retry = input.next();
            // Retry Loop
            while(!(retry.equalsIgnoreCase("No") || retry.equalsIgnoreCase("Yes"))) {

                System.err.println("Input invalid, please try again");
                retry = input.next();
            }

            if(retry.equalsIgnoreCase("No")){

                break;
            }
            else if(retry.equalsIgnoreCase("Yes")){

                System.out.println("");
            }
        }
        input.close();

        ProgramCloser();
    }
}