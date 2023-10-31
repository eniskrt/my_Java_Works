package Day12_scope;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {

        //Kullanıcıdan toplanmak üzere tamsayılar isteyin
        //toplam 500 olduğunda veya geçtiğinde işlemi durdurup kaç sayı
        //girildiğini ve taoplamlarını yazdırın.

        Scanner scanner = new Scanner(System.in);
        int sayi =0;
        int toplam = 0;
        int sayac = 0;

        while (toplam<500){
            System.out.println("Lütfen toplanmak üzere sayı giriniz.");
            sayi = scanner.nextInt();
            sayac++;
            toplam += sayi;
        }

        System.out.println(sayac + " adet sayı girdiniz, sayıların toplamı : "+ toplam);

    }
}
