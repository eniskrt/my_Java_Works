package Day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_arrays {
    public static void main(String[] args) {

        int[] arr = {3,4,5};

        //kullanıcıdan değer alıp array'e ekleyin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array'e eklemek için  bir tamsayı giriniz");
        int eklenecekSayi = scanner.nextInt();

        arr =C02_arrays.arrayeElemanEkle(arr,eklenecekSayi);

        System.out.println("Array'in yeni hali : "+ Arrays.toString(arr));
    }
}
