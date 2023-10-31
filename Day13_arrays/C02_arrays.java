package Day13_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        int sayi = 10;

        int[] arr = {4,6,1,2};

        //Bu array'i yazdıralım

        System.out.println(sayi); // 10

        //System.out.println(arr); // [I@6acbcfc0

        //Array'ler direk yazdırılamaz,
        //direk yazdırmak isterseniz, array'i değil referansını yazdırır.
        //Array'i yazdırmak için Arrays class'ından yardım almalıyız.

        System.out.println(Arrays.toString(arr)); // [4, 6, 1, 2]

        String [] kelimeler = {"Ali", ", okula", "gitti."};
        System.out.println(Arrays.toString(kelimeler));

        //Array'in tüm elementlerini yazdırın

        System.out.println(arr[0]); // 4
        System.out.println(arr[1]); // 6
        System.out.println(arr[2]); // 1
        System.out.println(arr[3]); // 2

        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        //4 6 1 2

        /*
        B,z ne zaman array'in tüm elementleri ile ilgili bir işlem yapmak istesek bir for loop
        oluşturup arr[i] üzerinden işlem yapabiliriz.
         */

    }
}
