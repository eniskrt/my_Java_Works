package Day11_whileLoop_doWhileLoop;

public class C10_doWhileLoop {
    public static void main(String[] args) {

        int sayi=10;

        //do-while loop ile verilen sayıdan başlayıp birer azaltarak
        //3'e kadar olan sayıları yazdırın.

        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);
        System.out.println();
        System.out.println("============================");

        sayi =2;
        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);

        System.out.println();
        System.out.println("=============================");

        // aynı soruyu while loop ile yapalım

        System.out.println("While loop ile : ");
        while (sayi>3){
            System.out.println(sayi + " ");
        }


    }
}
