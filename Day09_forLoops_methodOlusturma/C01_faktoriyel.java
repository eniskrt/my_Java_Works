package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C01_faktoriyel {
    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük bir tamsayı giriniz.");
        int girilenSayi = scanner.nextInt();

        int sonuc =1;

        for (int i = girilenSayi; i >=1 ; i--) {
            sonuc *=i;
            System.out.println(i);
        }
        System.out.println("Girilen sayının faktöriyeli : "+ sonuc);

    }
}
