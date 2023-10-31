package Day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C09_doWhileLoop {
    public static void main(String[] args) {
        ////Kullanıcıdan toplanmak üzere sayılar isteyin
        //        //Kullanıcı 0'a basıncaya kadar işlemi tekrar ettirin
        //        //Kullanıcı 0'a bastığında girilen sayıların toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi =0;

        do {
            System.out.println("Lütfen toplanmak üzere bir sayı giriniz. \n İşlemi bitirmek için 0'a basınız.");
            sayi = scanner.nextInt();
            toplam += sayi;
        } while (sayi!=0);

        System.out.println("Girilen sayıların toplamı = "+ toplam);



    }
}
