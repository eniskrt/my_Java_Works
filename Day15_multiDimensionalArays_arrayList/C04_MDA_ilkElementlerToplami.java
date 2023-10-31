package Day15_multiDimensionalArays_arrayList;

public class C04_MDA_ilkElementlerToplami {
    public static void main(String[] args) {

        //Verilen bir multidimensional bir earray'da
        //her bir inner array'in ilk elementlerinin toplamını
        //bize döndüren bir method oluşturun.

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};

        int ilkInerElementToplam = ilkInnerElementlerTolam(arr);

        System.out.println("İlk elementler toplamı : " + ilkInerElementToplam);
    }
    public static int ilkInnerElementlerTolam (int[][] arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i][0];
        }
        return toplam;
    }

}
