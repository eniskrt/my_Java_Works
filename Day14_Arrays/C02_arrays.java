package Day14_Arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        //Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int[] arr1 = {4,5,6,7};

        //Bu arrayE beşinci element olarak 8'i atayın

        int [] yeniArr ={4,5,6,7,8};

        arr1 = yeniArr;

        System.out.println("arr1!in son hali : " + Arrays.toString(arr1));// [4, 5, 6, 7, 8]

        arr1 = arrayeElemanEkle(arr1,10);

        System.out.println("arr1'in method call'dan sonraki hali : "+ Arrays.toString(arr1));

        arr1 = arrayeElemanEkle(arr1,38);
        System.out.println("arr1'in 2. method call'dan sonraki hali : "+ Arrays.toString(arr1));

    }
    public static int[] arrayeElemanEkle (int[] arr, int eklenecekEleman){
        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0, 0, 0]

        //eski arr'deki tüm elemetleri yeniarr'ye taşıyalım
        for (int i = 0; i < arr.length; i++) {  //[4, 5, 6, 7, 8, 0]
            yeniArr[i] = arr[i];
        }
        //yeniarr'in son elementi olarak istenen sayıyı atayalım.

        yeniArr[yeniArr.length-1] = eklenecekEleman;
        return yeniArr; //[4, 5, 6, 7, 8, 10]
    }
}
