package Day08_stringManipulations;

import java.util.Scanner;

public class C12_forLoop {

    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz.");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz.");
        int bitis = scanner.nextInt();

        int toplam =0;

        if (baslangic>bitis){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz.");
        }else {
            for (int i = baslangic; i <=bitis; i++) {
                toplam +=i;
            }
            System.out.println("Verilen aralıktaki sayıların toplamı: "+toplam);
        }
    }
}
