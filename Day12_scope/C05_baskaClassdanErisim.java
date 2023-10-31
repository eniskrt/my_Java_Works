package Day12_scope;

public class C05_baskaClassdanErisim {
    /*Class içerisinde oluşturduğumuz class üyelerinin static olup olmaması
    başka class’lardan erişimi de etkiler.

    Başka class'tan static bir class üyesine ulaşmak için
    clasIsmi.staticClassUyesiIsmi

    Başka class'tan static olmaya class üyesine ulaşmak
    önce o class'ta obje oluşturup
    sonra objeIsmi.staicOlmayanClassUyesiIsmi kullanılır

    PEKİİİ static bir class üyesine
    obje üserinden ulaşabilir miyiz?
    Java obj ismini yazıp nokta koyunca static üyeleri
    otomatik olarak önermez ama biz manual olarak
    obj.staticClassUyeIsmi yazarsak java istediğimiz
    static üyeyi getirir.
    Bu durumda intelij bu kullanımı sarıya boyar
    static bir class üyesine static olmayan bir yolla
    erişiyorsun diye bizi uyarır.
     */
    public static void main(String[] args) {

        System.out.println(C03_scope_ClassVariables.bl); //true
        System.out.println(C03_scope_ClassVariables.chr);//a
        C03_scope_ClassVariables.staticMethod();

        C03_scope_ClassVariables obj = new C03_scope_ClassVariables();
        obj.staticOlmayanMethod();
        System.out.println(obj.sayi);
        System.out.println(obj.str);
        System.out.println(obj.bl);


    }
}
