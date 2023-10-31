package Day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {
        //Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üs hesaplamak istediğiniz pozitif tamsayıyı giriniz.");
        int sayi = scanner.nextInt();
        System.out.println("Lütfen hesaplanacak üs değerini pozitif tamsayı olarak giriniz");
        int us = scanner.nextInt();

        usHesapla(sayi,us);


    }

    public static void  usHesapla (int sayi, int us){
        int sonuc =1;
        int geciciUs =us;

        while (geciciUs>0){

            sonuc*=sayi;
            geciciUs--;
        }
        System.out.println(sayi + " uzeri "+ us + " = " + sonuc);
    }

}
