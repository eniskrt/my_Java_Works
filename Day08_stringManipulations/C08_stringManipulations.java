package Day08_stringManipulations;

import java.util.Scanner;

public class C08_stringManipulations {
    public static void main(String[] args) {
        //Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina:) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String girilenMetin = scanner.nextLine();

        int uzunluk = girilenMetin.length();
        String yeniHal = "";

        if (uzunluk%2==0){
            yeniHal =girilenMetin.substring(0,uzunluk/2)+" :) "+girilenMetin.substring(uzunluk/2);
        }else {
            yeniHal = girilenMetin.substring(0,uzunluk/2)+" :( "+girilenMetin.substring(uzunluk/2+1);
        }
        System.out.println(girilenMetin+" yazdınız ve ben onu değiştirdim : "+yeniHal);

    }
}
