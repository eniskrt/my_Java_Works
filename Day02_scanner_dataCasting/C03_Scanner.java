package Day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //           girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi griniz");

        char ilkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lütfen Soy isiminizi giriniz");

        String soyIsim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + ilkHarf +" "+soyIsim+", "+yas);

    }
}
