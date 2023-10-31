package Day02_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru 1 Kullanıcıdan üç farklı data türündew değer alıp,
        //alınan değerleri açıklamalarıyla yazdırın.

        //adim 1 Scanner objesi oluşturalım

        Scanner scanner = new Scanner(System.in);

        //kullanıcıya ne istediğinizi söyleyin
        System.out.println("Lütfen isminizi giriniz");

        //adım 3 girilen bilgiye uygun bir variable oluşturup
        //       data türüne uygun next..() ile bilgiyi kaydedin
        String girilenIsim = scanner.next(); //sadece ilk ismini alırsınız

        System.out.println("Girilen isim :" + girilenIsim );

        //İkinci olarak bir tam sayı isteyelim
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("Yaşınız:" + yas);

        //emekli misiniz true/false

        System.out.println("Emekli misiniz? true veya false olarak giriniz");

        boolean emekliMi = scanner.nextBoolean();

        System.out.println("Girilen isim :" + girilenIsim );
        System.out.println("Yaşınız:" + yas);
        System.out.println("Emekli misiniz?" + emekliMi);
    }
}