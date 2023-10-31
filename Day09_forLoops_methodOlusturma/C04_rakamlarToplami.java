package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C04_rakamlarToplami {
    public static void main(String[] args) {
        
        //Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif birtam sayı giriniz.");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami =0;
        int rakam=0;

        for (int i =girilenSayi; i >0 ; i/=10) {
            rakam = i%10;
            rakamlarToplami += rakam;

        }
        System.out.println(girilenSayi + "sayısının rakamlar toplamı : "+ rakamlarToplami);

        //aynı soruyu basamak sayısı kadar tekrar ederek çözelim

        rakamlarToplami = 0;
        rakam = 0;
        int basamakSayisi = (girilenSayi+"").length();
        int sayi =girilenSayi;

        //1234 basamak sayıs 4

        for (int i =1; i <=basamakSayisi; i++) {// basamak sayısına göre loop oluşturalım
            rakam = sayi%10;
            rakamlarToplami +=rakam;
            sayi/=10;
        }
        System.out.println(girilenSayi + "sayısının rakamlar toplamı : "+ rakamlarToplami);

        
    }
}
