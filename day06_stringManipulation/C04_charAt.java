package day06_stringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java gün geçtikçe güzelleşiyor.";

        //İlk harfi yazdırın.
        System.out.println(str.charAt(0)); //J

        System.out.println(str.charAt(4)); // (boşluk)

        //str'da 31 karakter var
        //son karakter olan .'nın indeksi 30 olur.

        //son karakteri yazdırın

        System.out.println(str.charAt(30)); // .

        //sondan 5'inci karakteri yazdırın

        System.out.println(str.charAt(31-5)); // i

        //str'da olmayan bir indeksi istersek

        //System.out.println(str.charAt(44));  Index 44 out of bounds for length 31

    }
}
