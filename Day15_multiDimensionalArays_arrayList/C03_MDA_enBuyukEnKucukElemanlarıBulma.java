package Day15_multiDimensionalArays_arrayList;

public class C03_MDA_enBuyukEnKucukElemanlarıBulma {
    public static void main(String[] args) {

        //Verilen bir multidimensional array'de en büyük ve en küçük sayıları bulup yazdıran bir method oluşturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};

        enBuyukEnKucukBulma(arr);

    }
    public static void enBuyukEnKucukBulma (int [][] arr){
        int enBuyuk =arr[0][0];
        int enKucuk =arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>enBuyuk){
                    enBuyuk =arr[i][j];
                }
                if (arr[i][j]<enKucuk){
                    enKucuk = arr[i][j];
                }
            }
        }
        System.out.println("Array içindeki en büyük eleman : " + enBuyuk);
        System.out.println("Array içindeki en küçük eleman : " + enKucuk);

    }
}
