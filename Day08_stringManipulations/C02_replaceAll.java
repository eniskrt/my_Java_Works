package Day08_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "J1a5v8a +/can8_7dir";

        //metindeki sayı ve karakterleri tamizleyip
        //sadece harflerden oluşan "Java candir" şekline dönüştürün.

        //tüm sayıları yok edelim.

        str =str.replaceAll("\\d", "");

        //space'i korumak için space yerine bir rakam atayalım
        str = str.replaceAll(" ","5");

        str = str.replaceAll("\\W","");
        str = str.replaceAll("\\d"," ");
        //W harf, rakam ve _'yi değiştirmez
        //_'yi de yok etmek istersek alttaki satırı kullanabiliriz
        str = str.replaceAll("_","");

        System.out.println(str);

    }
}
