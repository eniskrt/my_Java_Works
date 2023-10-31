package Day11_whileLoop_doWhileLoop;

import Day10_methodOlusturma_methodOverLoading.C05_asalSayiMiDöndür;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan bir asal sayı girmesini isteyin
        //kullanıcı asal sayı girmezse bu asal değil tekrar dene yazdırın
        //kullanıcı asal sayı girdiinde işlem başarılı olarak tamamlandı yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayi =4;

        while (!C05_asalSayiMiDöndür.asalMiDondur(sayi)){ //while loop boolean şart false olduğu müddetçe çalışır.
            System.out.println("Lütfen bir asal sayı yazdırın");
            sayi = scanner.nextInt();

            if (C05_asalSayiMiDöndür.asalMiDondur(sayi)){
                System.out.println("İşlem başarılı olarak tamamlandı.");
            } else {
                System.out.println("Bu asal değil tekrar dene!");
            }

        }

    }
}
