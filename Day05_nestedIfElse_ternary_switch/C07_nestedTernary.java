package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C07_nestedTernary {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı alın
        //sayı pozitif ise 100'den büyükveya küçük olduğunu yazdırın
        //sayı negatifse tek veya çift olduğunu yazdırın.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz.");
        int sayi = scanner.nextInt();

        System.out.println(
                sayi>0
                        ?
                        //sayı 0'dan büyükse yazdırılacak kısım
                        sayi>100 ? "Sayı büyük " : "Sayı küçük"
                        :
                        //sayı negatifse
                        sayi %2 ==0 ? "Sayı çift " : "sayı tek"
        );

        /*

        System.out.println(
                sayi>0 ? sayi>100 ? "Sayı büyük " : "Sayı küçük" : sayi %2 ==0 ? "Sayı çift " : "sayı tek");

         */

    }
}
