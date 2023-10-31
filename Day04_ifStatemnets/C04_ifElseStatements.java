package Day04_ifStatemnets;

import java.util.Scanner;

public class C04_ifElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 &&kenar2>0){
            System.out.println("Eşkenar üçgen");
        } else {
            System.out.println("Eşkenar üçgen değil.");
        }



    }
}
