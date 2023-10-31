package day06_stringManipulation;

public class C06_subString {
    public static void main(String[] args) {

        String str = "Java en güzel programlama dili.";

        System.out.println(str.substring(5)); //en güzel programlama dili.

        System.out.println(str.substring(0)); //Java en güzel programlama dili.

        System.out.println(str.substring(1)); //ava en güzel programlama dili.

        System.out.println(str.substring(str.length()-5)); // dili.


        //metinden sadece Java'yı yazdırın.

        System.out.println(str.substring(0,4)); //Java

        //0. indeks'ten başla 4 karakter yazdır.
        // veya 0. indeks(dahil) ile 4.(hariç) arası yazdır.

        //cümledeki 2. space'in indeksi 7 ise
        //2. space'ten sonraki 5 harfi yazdırın.

        System.out.println(str.substring(8,13)); // güzel

        System.out.println(str.substring(0, 1)); //J 0. indeks'deki karakteri
        System.out.println(str.substring(3,4)); //a  3. indeks'deki kaakteri

        //6. indeksteki harfi String olarak kaydedin.

        String indeks6dakiHarf = str.substring(6,7); // n
        System.out.println(indeks6dakiHarf); // n

        System.out.println("başlangıç indeksi ve bitiş indeksi aynı olursa:"+str.substring(5,5)+"---"); //hiçlik

        //System.out.println(str.substring(5,2)); Range [5, 2) out of bounds for length 31

    }
}
