package Day10_methodOlusturma_methodOverLoading;

import java.util.Scanner;

public class C02_maxSayiyiBulma {
    public static void main(String[] args) {
        //Kullanıcıdan 3 sayı alıp bu 3 sayının
        //en büyük olanı yazdıran bir method oluşturun

        enBuyukBulma();

    }

    public static void enBuyukBulma () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("En büyük sayıyı bulmak için 3 adet sayı giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();

        if ((sayi1>sayi2)&&(sayi1>sayi3)){
            System.out.println("Girilen sayılardan en büyük olanı : "+ sayi1);
        } else if ((sayi2>sayi3)&&sayi2>sayi1) {
            System.out.println("Girilen sayılardan en büyük olanı : "+ sayi2);
        } else if ((sayi3>sayi1)&&(sayi3>sayi2)) {
            System.out.println("Girilen sayıların en büyük olanı : "+ sayi3);
        }

    }


}
