package Day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_swap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk tam sayıyı giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiğiniz değerler : sayi1 =" + sayi1 + " sayi2 ="+ sayi2 );

        int bosKova = 0 ;

        bosKova = sayi2;
        sayi2 = sayi1;
        sayi1 = bosKova;

        System.out.println("Girdiğiniz değerler : sayi1 =" + sayi1 + " sayi2 ="+ sayi2 );




    }
}
