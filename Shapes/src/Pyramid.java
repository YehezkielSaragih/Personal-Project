import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        
        // Formula
        for(int i = 1; i <= rows; i++){
            // Distance from left corner
            for(int j = 1; j <= (rows - i + 1); j++){
                System.out.print(" ");
            }
            // Odd or Even Star (*) 
            for(int k = 0; k != 2 * i - 1; k++){
                System.out.print("*");
            }
            // Distance from right corner
            for(int l = 1; l <= (rows - i + 1); l++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");
    
        for(int w = rows; w >= 1; --w) {
            // Distance from left corner
            for(int a = 1; a <= (rows - w + 1); a++) {
              System.out.print(" ");
            }
            // Left Triangle
            for(int s = w; s <= 2 * w - 1; s++) {
              System.out.print("*");
            }
            // Right Triangle
            for(int s = 0; s < w - 1; s++) {
              System.out.print("*");
            }
            // Distance from right corner
            for(int d = 1; d <= (rows - w + 1); d++) {                            
                System.out.print(" ");
            }
            System.out.println("");
          }
        System.out.println("");

        input.close();
    }   
}
