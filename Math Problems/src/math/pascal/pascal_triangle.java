package math.pascal;

import java.util.Scanner;

public class pascal_triangle {
    
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        
        // Formula
        int coefisiens = 1;
        for(int i = 1; i <= rows; i++){
            // Distance from left corner
            for(int j = 1; j <= (rows - i + 1); j++){
                System.out.print("  ");
            }
            // Pascal Number
            for(int k = 0; k <= i; k++){
                if(i == 0 || k == 0){
                    coefisiens = 1;
                }
                else{
                    coefisiens = coefisiens * (i - k + 1) / k;
                }
                System.out.printf("%4d",coefisiens);
            }
            // Distance from right corner
            for(int l = 1; l <= (rows - i + 1); l++){
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");

        input.close();
    }
}
