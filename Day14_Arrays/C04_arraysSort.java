package Day14_Arrays;

import java.util.Arrays;

public class C04_arraysSort {
    public static void main(String[] args) {

        int[] arr1 = {3,9,1,0,12,87,4,6};

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 ={"ibrahim", "Hüseyin", "Hasan", "İsmail", "İshak", "israfil", "isa"};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //ascii değerleri sebebiyle küçük harfler sıralamada
        //büyük harflerden sonra gelir


        //String'lerde sadece method çalışınca yapılan değişiklikler kalıcı olmaz
        //değişikliğin kalıcı olması için tama yapmalıyız.
        //Bu durum Strng'den kaynaklanan özel bir durumdur.

        String isim = "Ali";
        isim.toUpperCase();
        System.out.println(isim); //Ali
    }
}
