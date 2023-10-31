package Day15_multiDimensionalArays_arrayList;

import java.util.Arrays;

public class C01_MDA_tumElementleriYazdirma {
    public static void main(String[] args) {
        int[] arr1 = {3,4,6,8};

        //arr'yi yazdırın

        System.out.println(Arrays.toString(arr1));

        //arr1'in tüm elementlerini yazdırın
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");

        int [][] arr2 = {{1,4,7},{3,5},{1,9,0,8},{2}};

        System.out.println(Arrays.deepToString(arr2));
        
        //arr2'nin tüm elementleri yazdırın

        for (int i = 0; i < arr2.length; i++) { //outer array'i kontrol eder ve sırasıyla inner array'leri getirir
            for (int j = 0; j < arr2[i].length ; j++) {
                System.out.print(arr2 [i][j] + " ");
            }
        }


    }
}
