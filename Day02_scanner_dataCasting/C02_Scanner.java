package Day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörgenin iki kenar uzunluğunu alıp
        //dikt

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dikdörgenin kenar uzunluklarını giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörgenin alanı :" + kenar1*kenar2);

    }
}
