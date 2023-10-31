package Day15_multiDimensionalArays_arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_arraydekiTekrarEdenElementleriSilme {
    public static void main(String[] args) {

        //Verilen bir int array'de tekrar eden elementleri silip,
        //array'i her elementin uniq olduğu bir hal getirin.

        int [] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        //bir list oluşturalım
        //array'in tüm elemanlarını tek tek elle alalım
        //


        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!sayilar.contains(arr[i])){
                sayilar.add(arr[i]);
            }
        }
        System.out.println(sayilar); // [3, 2, 5, 6, 7, 8, 9, 0, 1, 4]

        int [] yeniArr = new int[sayilar.size()];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr [i] = sayilar.get(i);
        }
        arr = yeniArr;
        Arrays.sort(arr);

        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        // Array'in son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
