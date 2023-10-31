package Day04_ifStatemnets;

import java.util.Scanner;

public class C03_if {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not>= 50){
            System.out.println("sınıfı geçtin");
        }

        if (not<50){
            System.out.println("Malesf kaldın.");
        }

        if (not >= 50){
            System.out.println("Sınıfı geçtin");
        } else {
            System.out.println("Malesef kaldın");
        }

    }
}
