package Day04_ifStatemnets;

import java.util.Scanner;

public class C06_ifElseStatement {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner =new Scanner(System.in);
        char krk =scanner.next().charAt(0);

        if (krk >='a' && krk <='z' ){
            System.out.println(Character.toUpperCase(krk));
        } else {
            System.out.println(krk);
        }
    }
}
