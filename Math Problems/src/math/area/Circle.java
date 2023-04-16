package math.area;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int r;
        double luas_lingkaran;
        
        System.out.println("Selamat datang di program penghitung luas lingkaran");
        System.out.println("");

        // Input jari-jari lingkaran
        System.out.println("Masukkan jari-jari lingkaran !");
        r = input.nextInt();
        // Warning message
        while(r < 0 || r == 0) {
            System.out.println("Jari-jari lingkaran harus diatas nol dan bernilai positif !");
            r = input.nextInt();
        }
        input.nextLine();
        System.out.println("");

        // Rumus luas lingkaran
        luas_lingkaran = Math.PI *r *r;
        System.out.println("Luas lingkaran = " + String.format("%.2f", luas_lingkaran));
        System.out.println("");

        // Closing program
        System.out.println("Terimakasih karena telah menggunakan program ini :)");
        
        input.close();
    }
}
