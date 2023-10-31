package Day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C11_nestedForLoops {
    public static void main(String[] args) {

        //kullanıcıdan satır ve sütun numara sayısını alıp
        //        aşağıdaki gibi yıldızlardan oluşan bir şekil çizdirin
        //                1
        //                2 4
        //                3 6 9
        //                4 8 12 16

        Scanner scanner =new Scanner(System.in);
        System.out.println("satır sayısını girinz.");
        int satir = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*j +" ");
            }
            System.out.println(" ");
        }

    }
}
