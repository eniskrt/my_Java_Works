package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C07_nestedForLoops {
    public static void main(String[] args) {

        /*kullanıcıdan satır ve sütun numara sayısını alıp
        aşağıdaki gibi yıldızlardan oluşan bir şekil çizdirin
                * * * * *
                * * * * *
                * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz.");
        int satir = scanner.nextInt();
        System.out.println("Lütfen sütun sayısını giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
