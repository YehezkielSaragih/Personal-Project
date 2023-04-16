import java.util.Arrays;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.Random;

public class TicTacToe {
    
    public static void ProgramOpening(){
        
        System.out.println("================================");
        System.out.println("Welcome to Tic Tac Toe Program !");
        System.out.println("================================");
        System.out.println("Tic Tac Toe Game Board");
    }
    
    public static void Print_GameBoard(char[][] gameboard){
        
        for(int i = 0; i < gameboard.length; i++) {

            for(int j = 0; j < gameboard[i].length; j++){

                System.out.print(gameboard[i][j]);
            }
            System.out.println("");
        }
    }

    public static void GamePiece(char[][] gameboard, int position, String user){

        char symbols = ' ';

        if(user.equalsIgnoreCase("Player")){

            symbols = 'X';
            player_positions.add(position);
        }
        else if(user.equalsIgnoreCase("Computer")){

            symbols = 'O';
            computer_positions.add(position);
        }
        
        switch(position){

            case 1 :
                gameboard[1][2] = symbols;
                break;
            case 2 :
                gameboard[1][6] = symbols;
                break;    
            case 3 :
                gameboard[1][10] = symbols;
                break;
            case 4 :
                gameboard[3][2] = symbols;
                break;
            case 5 :
                gameboard[3][6] = symbols;
                break;    
            case 6 :
                gameboard[3][10] = symbols;
                break;
            case 7 :
                gameboard[5][2] = symbols;
                break;
            case 8 :
                gameboard[5][6] = symbols;
                break;    
            case 9 :
                gameboard[5][10] = symbols;
                break;
            default :
                break;
        }
    }
    
    static ArrayList<Integer> player_positions = new ArrayList<Integer>();
    static ArrayList<Integer> computer_positions = new ArrayList<Integer>();

    public static String WinChecker(){

        //
        List<Integer> top_row = Arrays.asList(1, 2, 3);
        List<Integer> mid_row = Arrays.asList(4, 5, 6);
        List<Integer> bottom_row = Arrays.asList(7, 8, 9);
        List<Integer> right_column = Arrays.asList(1, 4, 7);
        List<Integer> mid_column = Arrays.asList(2, 5, 8);
        List<Integer> left_column = Arrays.asList(3, 6, 9);
        List<Integer> diagonal_1 = Arrays.asList(1, 5, 9);
        List<Integer> diagonal_2 = Arrays.asList(3, 5, 7);

        //
        List<List<Integer>> winning_conditions = new ArrayList<List<Integer>>();
        winning_conditions.add(top_row);
        winning_conditions.add(mid_row);
        winning_conditions.add(bottom_row);
        winning_conditions.add(left_column);
        winning_conditions.add(mid_column);
        winning_conditions.add(right_column);
        winning_conditions.add(diagonal_1);
        winning_conditions.add(diagonal_2);

        //
        for(List<Integer> winloop : winning_conditions){

            if(player_positions.containsAll(winloop)){

                return "You won the game !";
            }
            else if(computer_positions.containsAll(winloop)){

                return "Sorry, you lost the game.";
            }
            else if (player_positions.size() + computer_positions.size() == 9){

                return "Draw.";
            }
        }
        return "";
    }

    public static void ProgramCloser(){

        System.out.println("================================");
        System.out.println("Thankyou for playing this game !");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        
        ProgramOpening();
        
        char[][] gameboard = { {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                               {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                               {'|', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '|'},
                               {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                               {'|', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '|'},
                               {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                               {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'} 
                             };
        
        char[][] tutorial = { {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                              {'|', ' ', '1', ' ', '|', ' ', '2', ' ', '|', ' ', '3', ' ', '|'},
                              {'|', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '|'},
                              {'|', ' ', '4', ' ', '|', ' ', '5', ' ', '|', ' ', '6', ' ', '|'},
                              {'|', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '|'},
                              {'|', ' ', '7', ' ', '|', ' ', '8', ' ', '|', ' ', '9', ' ', '|'},
                              {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'} 
                            };

        Print_GameBoard(tutorial);

        Scanner input = new Scanner(System.in);
        
        while(true){
            
            System.out.print("Player position   = ");
            int player_position = input.nextInt();
            while (player_position == 0 || player_position > 9){

                System.out.println("Input must between 1 - 9 !");
                System.out.print("Player position   = ");
                player_position = input.nextInt();
            }
            while(player_positions.contains(player_position) || computer_positions.contains(player_position)){

                System.out.println("Position taken. Try again !");
                System.out.print("Player position   = ");
                player_position = input.nextInt();
            }
            GamePiece(gameboard, player_position, "Player");

            String result = WinChecker();
            if(result.length() > 0){
                
                Print_GameBoard(gameboard);
                System.out.println(result);
                break;
            }

            Print_GameBoard(gameboard);

            Random computer = new Random();
            int computer_position = computer.nextInt(9) + 1;
            System.out.print("Computer position = " + computer_position + "\n");
            while(player_positions.contains(computer_position) || computer_positions.contains(computer_position)){

                System.out.println("Position taken. Try again !");
                computer_position = computer.nextInt(9) + 1;
                System.out.print("Computer position = " + computer_position + "\n");
            }
            GamePiece(gameboard, computer_position, "Computer");

            Print_GameBoard(gameboard);

            result = WinChecker();
            if(result.length() > 0){
                
                System.out.println(result);
                break;
            }
        }

        input.close();
        
        ProgramCloser();
    }
}