package Day08_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        //Kullanıcıdan isim soy isim ve kart numarasını alın
        //aşağıdaki şekilde yazdırın
        //İsim  :Ş***** G****
        //Kart No   :1234 **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz.");
        String isim = scanner.next();

        System.out.println("Lütfen Soyadınızı giriniz");
        String soyisim = scanner.next();

        System.out.println("Lütfen kart numaranızı giriniz.");
        String kartNo =scanner.next();

        String yildizliIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");
        String yildizliSoyIsim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");
        String yidizliKartNo =kartNo.substring(0,4)+"**** **** ****";

        System.out.println("İsim soyisim : "+yildizliIsim + " " +yildizliSoyIsim);
        System.out.println("Kart no :  "+ yidizliKartNo);


    }
}
