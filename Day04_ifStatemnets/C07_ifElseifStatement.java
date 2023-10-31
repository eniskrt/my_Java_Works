package Day04_ifStatemnets;

import java.util.Scanner;

public class C07_ifElseifStatement {
    public static void main(String[] args) {

        //Kullanıcıdan pozitif bir tam sayı isteyip
        // sayı 3e bölünüyorsa 3e bölünüyor
        // sayı 5e bölünüyorsa 5e bölünüyor
        //hem 3 hem 5e bölünüyorsa süper sayı
        //ne 3 ne de 5e bölünmüyorsa çöpe at gitsin yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı giriniz.");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) {
            System.out.println("Süper sayı!");
        } else if (girilenSayi % 3 == 0) {
            System.out.println("Girilen sayı 3'e bölünüyor.");
        } else if (girilenSayi % 5 == 0) {
            System.out.println("Girilen sayı 5'e bölünüyor.");
        } else {
            System.out.println("Çöpe at gitsin!!!");
        }

    }

}

