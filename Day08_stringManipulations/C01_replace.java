package Day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candır";

        System.out.println(str.replace('a', 'q')); //Jqvq cqndır

        System.out.println(str.replace("Java", "Tava")); // Tava candır

        System.out.println(str.replace("Java","X")); // X candır

        System.out.println(str.replace('x','y')); // Java candır

        System.out.println(str.replace("a", "e").replace("ı", "a")); //Jeve cendar

        System.out.println(str.replace("ı","a").replace("a","e")); //Jeve cender

        //değişecek metin sadece ilk dğer için değişsin istiyorsak
        //replace() yerine replaceFirst() kullanılır


        System.out.println(str.replaceFirst("a", "x")); // Jxva candır

        //regex:regular expressions :belirlenmiş kısaltmalar.
        //ilk harfi yıldız yapalım
        System.out.println(str.replaceFirst("\\w", "*"));
        // varsa ilk string içindeki ilk rakamı + yapalım

        str = "Java 44Candır.";

        System.out.println(str.replaceFirst("\\d","+"));

    }
}
