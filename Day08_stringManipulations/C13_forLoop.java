package Day08_stringManipulations;

import java.util.Scanner;

public class C13_forLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir başlangıç değerini giriniz.");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen pozitif bir bitiş değerini giriniz.");
        int bitis = scanner.nextInt();

        int toplam =0;

        if (bitis>baslangic){
            for (int i = baslangic; i <=bitis; i++) {
                toplam+=i;
            }
        } else {
            for (int i = bitis; i <=baslangic; i++) {
                toplam +=1;
            }
        }
        System.out.println("Verilen aralıktaki sayıların toplamı : "+ toplam);


    }
}
