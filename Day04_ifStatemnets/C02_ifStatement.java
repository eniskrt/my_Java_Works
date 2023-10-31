package Day04_ifStatemnets;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        //Java ikili karşılaştırmaları kabul eder.
        //Daha fazla karşılaştırmaya ihtiyaç varsa
        //mantıksal operatörler kullanılarak şartlar ayrı ayrı yazılıp birleştirilir.

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2 > 0){
            System.out.println("Verilen kenar uzunlukları eşkanar üçgen oluşturur.");
        }


    }
}
