package Day07stringManipulations;

public class C07_nullPointer {
    public static void main(String[] args) {

        String str;

        //System.out.println(str);
        //Java'da main metod içerisinde bir variable oluşturabiliriz.
        //ANCAK değer atamadan kullanamayız.

        String str2 = "";
        System.out.println(str2); // hiçlik yazdırır.
        //str2'yikullanabilmek için hiçlik değeri aayabiliriz
        //Ancak hiçlik değeri atanan vaiable'ları
        //Java değer atanmamış olarak sınıflandırmaz
        // değer atananlar grubuna koyar.

        /*
        java değer atanmamış variable'ları işaretlemek için
        özel olarak null keyword!ünü oluşturmuştur.

        Aşağıdaki örnekte
        str4'e hiçlik değeri atanmıştır
        str5'e Tava değeri atanmıştır.
        str3 ise null olarakİŞARETLENMİŞTİR.

        null bir değer değil İŞARETÇİDİR
        str3'ün oluşturulduğunu ve bir değer atanmadan kullanılmak istendiğini gösterir.
        str3'ün oluşturukduğunu ve bir değer atanana kadar
        bu şekilde kullanılmak istendiğini Java'ya söyler

        null olarak işaretlenen bir String'i yazdırabilirisiniz
        ancak method'larda kullanamazsınız
         */

        //String str3 = true;
        //String str3 = 45;
        //String str3 = 'f';
        String str3 = null;
        String str4 ="";
        String str5 ="Tava";

        System.out.println(str3); // true

        //System.out.println(str3.substring(0, 1));NullPointerException
        //System.out.println(str3.charAt(0)); NullPointerException

        System.out.println(str3==null);

    }
}
