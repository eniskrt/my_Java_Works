package day06_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java öğren işsiz kalma.";
        System.out.println(str.length()); //26

        //sondan ikinci karakteri yazdırın.

        str = "Java";
        System.out.println(str.charAt(str.length()-2));

        // kodlamada dinamik kod yazmak önemlidir.
        //Dinamik kod input'da bilgileri alıp
        // input değişse bile çalımaya devam eden kod demektir.

        //metnin son karakterini yazdırın
        System.out.println(str.charAt(str.length()-1)); // a

        str = "Java güzeldir.";

        System.out.println(str.charAt(str.length()-1)); // .


    }
}
