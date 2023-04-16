package Program;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String txt1 = sc.nextLine();
        String[] txt2 = txt1.split(" / ");

        // for (int i = 0; i < txt2.length; i++) {
            
        //     System.out.println(txt2[i]);
        // }

        System.out.println("Yui lite choose "+ txt2[rand.nextInt(txt2.length + 1)]);

        sc.close();
    }
}
