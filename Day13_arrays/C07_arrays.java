package Day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_arrays {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        String[] kullanicidanAlinanArray = stringArrayOlustur();

        System.out.println(Arrays.toString(kullanicidanAlinanArray));

    }

    public static String[] stringArrayOlustur () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunluğunu giriniz.");
        int arrLength = scanner.nextInt();

        String[] kullaniciArrayi = new String[arrLength];

        scanner = new Scanner(System.in);
        for (int i = 0; i < kullaniciArrayi.length; i++) {
            System.out.println("Array'e eklemek için bir isim giriniz.");
            kullaniciArrayi[i] = scanner.nextLine();
        }
        return kullaniciArrayi;
    }

}
