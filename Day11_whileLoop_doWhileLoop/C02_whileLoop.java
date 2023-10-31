package Day11_whileLoop_doWhileLoop;

public class C02_whileLoop {
    public static void main(String[] args) {

        //1'den 10' a kadar olan sayıları yazdırın.

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("====================================");

        // while loop ile yapmak istersek
        // whilw loop'ta
        //              loop içinde kullanılacak varable,
        //              bitiş şartı
        //              artış/azalış yöntemini bizim yazmamız gereklidir.

        int sayi = 1;
        while (sayi<=10){
            System.out.print(sayi + " ");
            sayi++;
        }
        //for loop ile yapılacak bir işlemi
        //for loop ile yapmak tercih edilir.


    }
}
