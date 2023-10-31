package Day12_scope;

import java.io.FilterOutputStream;

public class C03_scope_ClassVariables {
    String str = "Java";
    int sayi = 23;

    static boolean bl = true;
    static char chr ='a';


    public static void main(String[] args) {
        //static int a =23;
        //System.out.println(str);
        //System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);

    }
    public static void  staticMethod() {
        //static String s = "tava";
        //System.out.println(str);
        //System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);
    }
    public void  staticOlmayanMethod () {
        System.out.println(str);
        System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);
    }
}
