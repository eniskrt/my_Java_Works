package Day15_multiDimensionalArays_arrayList;

public class C05_MDA_ciftSayilarintoplami {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};

        ciftSayiToplami(arr);

    }
    public static void ciftSayiToplami (int[][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Verilen Array içindeki çift sayıların toplamı : " + toplam);
    }
}
