package Day14_Arrays;

public class C01_arrays {
    public static void main(String[] args) {

         //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //          method yaziniz.
        int [] arr = {3,-5,4,2,-6,-7};

        int pozitifSayiToplam =pozitifSayilariTopla(arr);
        System.out.println(pozitifSayiToplam); //9
    }
    public static int pozitifSayilariTopla (int [] arr){

        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
