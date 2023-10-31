package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C09_nestedForLoops {
    public static void main(String[] args) {

        /*kullanıcıdan satır ve sütun numara sayısını alıp
        aşağıdaki gibi yıldızlardan oluşan bir şekil çizdirin
                1
                1 2
                1 2 3
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz.");
        int satir = scanner.nextInt();

        //üçgen şekiller için de nested for loop kullanılır
        //dikdörgenden farkı sütun nosuna ihtiyacımız yoktur
        //her satırdaki sütun sayısı o satırın nosuyla aynıdır.

        for (int i = 1; i <= satir; i++) { // satır
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }


    }
}
