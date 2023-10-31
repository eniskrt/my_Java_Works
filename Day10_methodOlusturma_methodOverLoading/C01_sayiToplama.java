package Day10_methodOlusturma_methodOverLoading;

import java.util.Scanner;

public class C01_sayiToplama {

    public static void main(String[] args) {
        //Verilen iki sayıyı toplayıp sonucu yazdıran bir method oluşturun.

        toplaYazdir(5,6.4);
        toplaYazdir(7,6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplanmak üzere iki sayı giriniz.");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        toplaYazdir(sayi1,sayi2);

    }//main() method sonu

    public static void toplaYazdir (double sayi1, double sayi2) {

        System.out.println("Verilen iki sayının toplamı : " +(sayi1 + sayi2));
    }


}//class sonu
