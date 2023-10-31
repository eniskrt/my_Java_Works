package Day15_multiDimensionalArays_arrayList;

public class C02_MDA_tumelemanlarıToplama {
    public static void main(String[] args) {
        //verilen bir multidimensional array'de tüm sayıları toplayıp
        //toplamı yazdıran bir method oluşturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};

        elemanlariToplama(arr);

    }
    public static void elemanlariToplama (int[][] arr) {
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}
