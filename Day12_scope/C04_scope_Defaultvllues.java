package Day12_scope;

public class C04_scope_Defaultvllues {

    String str = "Java";
    String str2;
    int sayi = 23;
    int sayi2;

    static boolean bl = true;
    static boolean bl2;
    static char chr ='a';
    static char chr2;

    public static void main(String[] args) {
        String metin;

        //System.out.println(metin);
        //System.out.println(str);
        //System.out.println(sayi);
        System.out.println(bl); //true
        System.out.println(bl2); //false
        System.out.println(chr); //a
        System.out.println(chr2); //hiçlik
        //staticOlmayanMethod() Non-static method 'staticOlmayanMethod()' cannot be referenced from a static context
        //Static olan main() method içerisinden static olmayan bir method direk çağrılamaz

        //static methodlar içerisinden static olmayan class üyelerine ulaşmak istersek obje oluşturmamız gerekir.

        C04_scope_Defaultvllues obj = new C04_scope_Defaultvllues();

        obj.staticOlmayanMethod();

        /*
        Local variable'lar değer atamadan oluşturulabilir
        ANCAK değer atanmadan kullanılamaz
         */
    }

    public void staticOlmayanMethod () {
        System.out.println(str); //Java
        System.out.println(str2); //null
        System.out.println(sayi); //23
        System.out.println(sayi2); //0
    }

}
