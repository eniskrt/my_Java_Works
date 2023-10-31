package Day13_arrays;

public class C04_arrays {
    public static void main(String[] args) {

        //verilen string bir array'de istenen harfi içeren
        //elementleri yazdırın

        String [] isimler = {"Hüseyin", "Mehmet", "Esra", "Ercan", "Ömer"};
        String istenenHarf = "a";

        for (int i = 0; i <isimler.length; i++) {

            if (isimler[i].contains(istenenHarf)) {
                System.out.print(isimler[i]+ " ");
            }

        }

    }
}
