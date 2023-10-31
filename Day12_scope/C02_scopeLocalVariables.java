package Day12_scope;

public class C02_scopeLocalVariables {
    public static void main(String[] args) {

        int sayi = 20;
        String s ="Hava";

        for (int i = 0; i <10 ; i++) {
            String str ="Java";
            str += i;
            s+=i;
        }
        //System.out.println(str);
        //System.out.println(i);
        System.out.println(s);
    }

    public static void staticMethod () {
        //System.out.println(sayi);
        String str = "Java";
        //System.out.println(bl);
    }

    public void staticOlmayanMethod () {
        //System.out.println(sayi);
        //str = "Tava";
        boolean bl = true;
    }



}
