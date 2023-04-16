package math.area;

import java.util.Scanner;

public class Square {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int p;
        int l;
        int luas_segi_empat;

        System.out.println("Selamat datang di program penghitung luas segi-empat");
        System.out.println("");

        // Input panjang segi-empat
        System.out.println("Masukkan panjang segi-empat !");
        p = input.nextInt();
        while(p < 0 || p == 0) {
            System.out.println("Nilai Panjang harus diatas nol dan bernilai positif !");
            p = input.nextInt();
        }

        // Input lebar segi-empat
        System.out.println("Masukkan lebar segi-empat !");
        l = input.nextInt();
        //Warning Message
        while(l < 0 || l == 0) {
            System.out.println("Nilai lebar harus diatas nol dan bernilai positif !");
            l = input.nextInt();
        }
        System.out.println("");

        // Formula
        luas_segi_empat = p * l;
        System.out.println("Luas segi-empat = " + luas_segi_empat);
        System.out.println("");

        // Closing program
        System.out.println("Terimakasih karena telah menggunakan program ini :)");
        
        input.close();
    } 

}
