package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C11_switchStatements {
    public static void main(String[] args) {

        //Kullanicidan ISTQB kisaltmasindan harflerden anlamini ogrenmek istedigi harfi alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ISTQB kısaltmasında anlamını öğrenmek istediğiniz harfi giriniz.");
        char harf = scanner.next().charAt(0);

        switch (harf){
            case 'I' :
            case 'i' :
                System.out.println("International");
                break;
            case 'S' :
            case 's' :
                System.out.println("Software");
                break;
            case 'T' :
            case 't' :
                System.out.println("Testing");
                break;
            case 'Q' :
            case 'q' :
                System.out.println("Qualification");
                break;
            case 'B' :
            case 'b' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Lütfen kısaltmadaki harflerden birini giriniz.");
        }

        System.out.println(2+3==5);



    }
}
