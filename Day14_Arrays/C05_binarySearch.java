package Day14_Arrays;

import Day13_arrays.C06_arrays;

import java.util.Arrays;

public class C05_binarySearch {
    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,9,12,-1,4,3};

        //Array'de 5'in olup olmadığını varsa kaç tane olduğunu yazdırın.
        C06_arrays.elemanSayisiYazdir(arr,5); //Aranan eleman array'de yok.

        //Array'de 3'in olup olmadığını varsa kaç tane olduğunu yazdırın.
        C06_arrays.elemanSayisiYazdir(arr,3); //Aranan eleman array'de 2 kere kullanılmış.

        System.out.println("/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=//=/=");
        System.out.println(Arrays.binarySearch(arr, 8)); //-11
        System.out.println(Arrays.binarySearch(arr, 9)); //-11
        System.out.println(Arrays.binarySearch(arr, 2)); //4
        System.out.println(Arrays.binarySearch(arr, 1)); //-1
        //binarySearch() kullanmadan önce sort() kullanmazsanız
        //sonucun ne olacağını bilemeyiz
        //doğru da olabilir, yanlış da olabilir.



        String [] isimler ={"Esra", "İbrahim", "Hüseyin", "Ömer", "Azim","Azim"};
        //isimler Array'inde Esra'nınn olup olmadığını döndüren bir method var.

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        //Array'de arama yapmadan önce sort() YAPILMALIDIR.
        //Aradığımız element varsa ilk kullanımın index'ini döndürür.
        System.out.println(Arrays.binarySearch(isimler, "Esra")); //2
        System.out.println(Arrays.binarySearch(isimler, "Azim")); //0
        System.out.println(Arrays.binarySearch(isimler, "Ömer")); //4

        //eleman yoksa olsaydı hangi sırada olacağını "-" işaretiyle birlikte döndürür.

        System.out.println(Arrays.binarySearch(isimler, "Ayça"));
        System.out.println(Arrays.binarySearch(isimler, "Deniz"));


    }
}
