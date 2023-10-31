package Day03_wrapperClasses_MatematikseiIşlemler;

public class C06_concatenation {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Kolaydır";
        String s3 = " ";
        String s4 = "";//hiçlik sayıyı String yapmak için kullanırız.

        int a = 4;
        int b = 3;

        //Sadece varable'ları kullanarak aşağıda istenin metinleri yazdırın.

        //Java Kolaydır 12

        System.out.println(s1 + s3 + s2 + s3 + a*b);

        //Java7Kolaydır
        System.out.println(s1 + (a + b + s2)); // Java7Kolaydır
        System.out.println(s1 + (a+b) + s2); // Java7Kolaydır

        //43Java
        System.out.println(a + (b + s1)); // 43Java
        System.out.println(s4 + a + b + s1); // 43Java


    }
}
