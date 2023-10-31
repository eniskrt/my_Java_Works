package Day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {
        //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
        //                  "sifre basariyla kaydedildi" yazdirin
        //                  - ilk harf kucuk harf olmali
        //                  - son karakter rakam olmali
        //                  - sifre bosluk icermemeli
        //                  - uzunlugu en az 10 karakter olmali

        Scanner scanner =new Scanner(System.in);

        String sifre =" "; // şartları sağlamayan bir ilk değer ataması

        while (!sifreKontrolEt(sifre)){ //şifre true dönerse loop'un bitmesi için ünlem yazdık
            System.out.println("Lütfen şifrenizi giriniz");
            sifre = scanner.nextLine();
        }

    }
    //Bu class'ta girilen şifreyi kontrol edip uygun şifreyse true
    // uygun değilde false döndüren bir method oluşturalım

    public static boolean sifreKontrolEt (String sifre) {

        int flag = 10;

        //     -ilk harf küçük harf olmalı

        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("İlk harf küçük harf olmalı.");
            flag = 11;
        }

        //          son karakter rakam olmalı

        char sonKarakter =sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<=9)){
            System.out.println("Son karakter rakam olmalı");
            flag = 11;
        }

        //      şifre boşluk içermemeli

        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli.");
            flag = 11;
        }

        //          uzunlupu en az 10 karakter olmalı

        if (sifre.length()<10){
            System.out.println("Şifre'nin uzunluğu en az 10 karakter olmalı");
            flag = 11;
        }

        //bağımsız if cümlelelerinden sonra flag ya10 ya 11 olacak
        if (flag ==10){
            System.out.println("Şifreniz başarıyla kaydedildi.");
        }

        if (flag==10) {
            return true;
        }else {
            return false;
        }
    }

}
