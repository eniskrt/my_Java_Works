package Day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C05_ternary {
    public static void main(String[] args) {

        //Kullanıcıdan bir pozitif tam sayı alın
        //sayının çift veya tek olduğunu yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz.");
        int sayi = scanner.nextInt();

        //Sorunun if else ile çözümü

        if (sayi %2 ==0){
            System.out.println("Sayı çift.");
        } else {
            System.out.println("Sayı tek.");
        }

        //Sorunun ternary ile çözümü

        System.out.println(sayi%2 ==0 ? "Sayı çift." : "Sayı tek.");

        //sayı 100'den büyükse sayıyı 2 katına çıkarın,
        //100'den büyük değilse değerini 10 arttırın

        sayi = sayi >100 ? 2* sayi : sayi + 10;

        System.out.println("Ternary'den sonra sayı : "+ sayi);


        //sayının yeni hali 100den büyükse sayı zaten büyük yazdırın
        //yeni hali 100den büyük değilse sayının 2 katını alın.

        System.out.println(sayi>100 ? "Sayı zaten büyük " :2*sayi);

        //Sadede atama ve sadece yazdırma sorularında ternary kullanılabilir.
        //ama iki farklı işlemler olduğunda kullanılmaz
        //bu soruda iki katını yazdırdı ama soruda atama istiyordu, yapmadı.

    }

}
