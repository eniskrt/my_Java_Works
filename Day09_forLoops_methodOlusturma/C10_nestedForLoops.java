package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C10_nestedForLoops {
    public static void main(String[] args) {

        /*kullanıcıdan satır ve sütun numara sayısını alıp
        aşağıdaki gibi yıldızlardan oluşan bir şekil çizdirin
                *
                * *
                * * *
                * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz.");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir; i++) { //satır
            for (int j = 1; j <=i; j++) { //sütun
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
