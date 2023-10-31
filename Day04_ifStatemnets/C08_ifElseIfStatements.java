package Day04_ifStatemnets;

import java.util.Scanner;

public class C08_ifElseIfStatements {
    public static void main(String[] args) {

        //öğrenciden notu alıp geçtin veya kaldın yazdıralım
        //öğrenci 0 dan küçük veya 100den bir not girerse
        //geçersiz not yazdıralım

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz.");
        double not = scanner.nextDouble();

        if (not>100 || not<0 ){
            System.out.println("Geçersiz not.");
        } else if (not>=50) {
            System.out.println("Sınıfı geçtin.");
        } else {
            System.out.println("Malesef kaldın.");
        }
    }
}
