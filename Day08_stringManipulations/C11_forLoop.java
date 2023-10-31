package Day08_stringManipulations;

import java.util.Scanner;

public class C11_forLoop {
    public static void main(String[] args) {

        //Kullanıcıdan pozitif bir  tam sayı değeri isteyin
        // osayıya kadar olan tüm pozitif tam sayıların toplamını yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz.");
        int girilenSayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 0; i <= girilenSayi; i++) {
            toplam +=i;
        }
        System.out.print(girilenSayi+"'ye kadar olan pozitif tamsayıların toplamı : "+toplam);

    }
}
