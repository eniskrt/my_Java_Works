package Day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {

        //Kullanıcıdan toplanmak üzere sayılar isteyin
        //Kullanıcı 0'a basıncaya kadar işlemi tekrar ettirin
        //Kullanıcı 0'a bastığında girilen sayıların toplamını yazdırın

        //Döngünün kaç kere çalışacağı belli olmayan işlemlerde while loop tercih edilir.

        Scanner scanner = new Scanner(System.in);

        double sayi = 1;
        double toplam =0;
        /*
        Kullanıcıdan alacağımız sayı 0 olmadığı sürece kod çalışacak
        Loop'dan önce bu sayıyı oluşturmamız gerekir ki
        while() içinde kullanabilelim.

        NOT :İlk değer ataması yaparken loop'un ilk çalışmasını engellemeyecek bir değer atamayA
             DİKKAT EDİLMELİDİR.
         */

        while (sayi !=0){

            System.out.println("Toplanmak üzere sayılar giriniz \nBitirmek için 0'a basınız.");
            sayi = scanner.nextDouble();

            toplam +=sayi;

        }
        System.out.println("Girilen sayıların toplamı : "+ toplam);




    }
}
