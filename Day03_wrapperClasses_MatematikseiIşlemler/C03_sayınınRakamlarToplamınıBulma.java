package Day03_wrapperClasses_MatematikseiIşlemler;

import java.util.Scanner;

public class C03_sayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {

        //kullanıcıdan 3 basamaklı pozitif bir tam sayı alıp
        // sayının rakamlar toplamını yazdırın.

        //sayımız 257

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı pozitif bir tam sayı giriniz.");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int rakam = 0;

        rakam = girilenSayi % 10; //7
        rakamlarToplami = rakamlarToplami + rakam; // 0 + 7 = 7
        girilenSayi =girilenSayi / 10; // 257/10 ==>25.7 ==>25

        //girilen sayı :25 , rakam : 7 , rakamlar toplamı : 7

        rakam = girilenSayi %10; // 25 % 10 ==>5
        rakamlarToplami = rakamlarToplami + rakam; // 7 + 5 ==>12
        girilenSayi = girilenSayi / 10; // 25 / 10 ==>2

        //girilen sayı :2 , rakam : 5 , rakamlar toplamı : 12

        rakam = girilenSayi % 10; //2%10 ==> 2
        rakamlarToplami =rakamlarToplami + girilenSayi; // 12+2 ==>14
        girilenSayi = girilenSayi /10; // 2/10 ==>0.2 ==>0

        System.out.println("Girilen sayının rakamları toplamı : "+rakamlarToplami);


    }
}
