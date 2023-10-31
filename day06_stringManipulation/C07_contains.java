package day06_stringManipulation;

public class C07_contains {
    public static void main(String[] args) {

        String str = "Javaya çok çalışırsan çok çabuk iş bulursun";

        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("Java"));  //true
        System.out.println(str.contains("java")); //false

        System.out.println(str.contains("a")); //true

        System.out.println(str.contains(" ")); //true

        System.out.println(str.contains("")); //true

        System.out.println(str.contains("çok çalış")); //true
    }
}
