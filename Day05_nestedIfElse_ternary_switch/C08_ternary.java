package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C08_ternary {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        /*
        Büyük olmayan demekle küçük olan demek farklıdır.
        Çünkü 9 9 verildiğinde büyük olmayan 9
                    küçük olan ikisi de değildir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz.");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
    }
}
