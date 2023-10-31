package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C10_switchStatements {
    public static void main(String[] args) {
        //Kullanıcıdan gün numarasını alıp
        //hafta içi ya da hafta sonu yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz.");
        int gunNo = scanner.nextInt();

        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlış gün numarası");
        }

        /*
        gün isminin baş harfini alın
        case s || S :OLMAZ
        case s, S : OLMAZ

        case s : OLUR
        case S :OLUR

         */
    }
}
