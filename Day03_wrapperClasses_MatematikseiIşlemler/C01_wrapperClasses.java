package Day03_wrapperClasses_MatematikseiIşlemler;

public class C01_wrapperClasses {
    public static void main(String[] args) {

        int sayi = 20;
        String str = "Java";

        Integer sayi2 = 30;

        sayi = sayi2;
        sayi2 = sayi;

        char chr1 = 'j';
        Character chr2 = chr1;

        Boolean bl = true;
        Short shrt = 3;
        Double dbl = 3.5;
        Float flt = 2.3f;

        //Primitive data türleriyle o türün wrapper class'ı arasında geçiş mümkündür.

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Short.MIN_VALUE); //-23768

        String str1 = "34";
        String str2 = "45";

        //str1 ve str2'nin değerlerini matematiksel olarak toplayın

        System.out.println(str1+str2);  //3445

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); //79

        str1 = "34a";
        str2 = "23";

        //System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2)));
        //NumberFormatException

        chr1 = 'a';

        System.out.println((Character.isDigit(chr1))); //false
        System.out.println((Character.isLetter(chr1))); //true
        System.out.println((Character.toUpperCase(chr1)));

        //int olara verilen bir sayıyı String'e nasıl çeviririz

        String metin = 23 + "";
        System.out.println(metin);

    }
}
