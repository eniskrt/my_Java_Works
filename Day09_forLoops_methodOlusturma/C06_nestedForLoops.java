package Day09_forLoops_methodOlusturma;

public class C06_nestedForLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 1; i <=4; i++) {
            System.out.print(2*i +" ");
        }

        System.out.println("");
        for (int i = 1; i <=4; i++) {
            System.out.print(3 * i + " ");
        }

        /*Bu tür tekrar eden işlemleri nested for ile yapabiliriz.
        yukarıda 3 kez  aynı loop'u çalıştırdık (satır sayısı kadr)
        1 2 3 4
        2 4 6 8
        6 6 9 12

         */
        System.out.println("");
        System.out.println("=============================");

        for (int i = 1; i <=3 ; i++) { //outer (dış) loop satırları kontrol eder.

            for (int j = 1; j <= 4; j++) { // inner (iç) loop süunları kontrol edder
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }

    }
}
