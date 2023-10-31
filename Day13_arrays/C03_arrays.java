package Day13_arrays;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {

        //verilen int bir array'deki
        //tüm elementlerin değerlerini 2 arttırın.

        int []  arr ={3,5,7,10};

        System.out.println("Array'in ilk hali : " + Arrays.toString(arr));

        for (int i = 0; i <arr.length; i++) {
            arr [i] +=2;
        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
    }
}
