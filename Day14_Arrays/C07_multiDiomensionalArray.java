package Day14_Arrays;

public class C07_multiDiomensionalArray {
    public static void main(String[] args) {

        int[] arr = {3,6,8,1};

        //arr'nin tüm elementlerini yazdırın

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //3 6 8 1
        }

        System.out.println("\n/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=");

        int[][] sayilar = {{3,5,6},{2,7},{1,5,8},{1}};
        //syılar array'indeki tüm elementleri yazdırın.

        for (int i = 0; i < sayilar.length; i++) { // outer loop outer array' kontrol eder
            for (int j = 0; j <sayilar[i].length ; j++) { // inner loop da inner array'i kontrol eder
                System.out.print(sayilar[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
